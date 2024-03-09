package this_is_java.ch20.insert_example;

import java.io.FileInputStream;
import java.sql.*;

public class InsertExample2 {
    public static void main(String[] args) {
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/thisisjava",
                    "root",
                    "1234"
            );

            String sql = """
                    INSERT INTO boards(btitle, bcontent, bwriter, bdate, bfilename, bfiledata)
                    VALUES(?, ?, ?, now(), ?, ?)
                    """;

            PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, "눈 오는 날");
            pstmt.setString(2, "함박 눈이 내려요.");
            pstmt.setString(3, "winter");
            pstmt.setString(4, "this_is_java/snow.jpg");
            pstmt.setBlob(5, new FileInputStream("src/main/resources/this_is_java//snow.jpg"));

            int rows = pstmt.executeUpdate();
            System.out.println("저장 된 행 수: " + rows);

            if(rows == 1){
                ResultSet rs = pstmt.getGeneratedKeys();
                if(rs.next()){
                    int bno = rs.getInt(1);
                    System.out.println("저장된 bno: " + bno);
                }
                rs.close();
            }

            pstmt.close();
        } catch(Exception e) {
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
