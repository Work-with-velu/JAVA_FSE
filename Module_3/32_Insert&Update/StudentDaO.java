import java.sql.*;

class StudentDaO {

    private Connection conn;

    public StudentDaO() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prince", "root", "sakthi");
    }

    public void insertStudent(int id, String name) throws SQLException {
        String sql = "INSERT INTO students (id, name) VALUES (?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.executeUpdate();
    }

    public void updateStudent(int id, String newName) throws SQLException {
        String sql = "UPDATE students SET name=? WHERE id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, newName);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
    }

    public static void main(String[] args) throws SQLException {
        StudentDaO dao = new StudentDaO();
        dao.insertStudent(1, "karthikeyan");
        dao.updateStudent(1, "sakthi");
    }
}