package this_is_java.ch20.select_example;

import java.sql.*;

public class SelectExample {
    public static void main(String[] args) {
        Connection conn = null;

        try{
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/thisisjava",
                    "root",
                    "1234"
            );

            String sql = """
                    SELECT userid, username, userpassword, userage, useremail
                    FROM users
                    WHERE userid = ?
                    """;

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "winter");

            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                User user = new User();
                user.setUserId(rs.getString("userid"));
                user.setUserName(rs.getString("username"));
                user.setUserPassword(rs.getString("userpassword"));
                user.setUserAge(rs.getInt("userage"));
                user.setUserEmail(rs.getString("useremail"));
                System.out.println(user);
            }
            rs.close();

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
