import java.sql.*;

public class BasicJDBCConnection {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/prince";
        String user = "root";
        String password = "sakthi";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Teacher");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}