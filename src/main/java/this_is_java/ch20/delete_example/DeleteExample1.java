package this_is_java.ch20.delete_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteExample1 {
    public static void main(String[] args) {
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/thisisjava",
                    "root",
                    "1234"
            );

            String sql = "DELETE FROM boards WHERE bwriter = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "winter");

            int rows = pstmt.executeUpdate();
            System.out.println("삭제된 행 수: " + rows);

            pstmt.close();
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            if(conn != null){
                try{
                    conn.close();
                } catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
