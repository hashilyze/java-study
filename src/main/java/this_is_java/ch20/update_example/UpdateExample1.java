package this_is_java.ch20.update_example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExample1 {
    public static void main(String[] args) {
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/thisisjava",
                    "root",
                    "1234"
            );

            String sql = """
                    UPDATE boards SET
                    btitle = ?,
                    bcontent = ?,
                    bfilename = ?,
                    bfiledata = ?
                    WHERE bno = ?
                    """;

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "눈사람");
            pstmt.setString(2, "눈으로 만든 사람");
            pstmt.setString(3, "this_is_java/snowman.jpg");
            pstmt.setString(4, "src/main/resources/this_is_java/snowman.jpg");
            pstmt.setInt(5, 1);

            int rows = pstmt.executeUpdate();
            System.out.println("수정된 행 수: " + rows);

            pstmt.close();
        } catch(Exception e){
            e.printStackTrace();
        } finally {
            if(conn != null){
                try{
                    conn.close();
                } catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
