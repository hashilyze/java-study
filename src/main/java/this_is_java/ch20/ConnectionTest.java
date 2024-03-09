package this_is_java.ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/thisisjava",
                    "root",
                    "1234"
            );
            System.out.println("연결이 성공하였습니다.");
        } catch(Exception e){
            e.printStackTrace();
            System.out.println("연결이 실패하였습니다.");
        } finally {
            if(conn != null){
                try{
                    conn.close();
                    System.out.println("연결이 해제되었습니다.");
                } catch(SQLException e){

                }
            }
        }

    }
}
