import java.sql.*;

public class MoneyTransfer {

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prince", "root", "Karthi")) {
            conn.setAutoCommit(false);

            try (PreparedStatement debit = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?"); PreparedStatement credit = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?")) {

                debit.setDouble(1, 100.0);
                debit.setInt(2, 1);

                credit.setDouble(1, 100.0);
                credit.setInt(2, 2);

                debit.executeUpdate();
                credit.executeUpdate();

                conn.commit();
                System.out.println("Transaction successful!");
            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Transaction failed. Rolled back.");
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}