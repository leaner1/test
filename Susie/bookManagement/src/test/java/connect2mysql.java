import java.sql.*;

/**
 * Created by husiq on 12/15/2016.
 */
public class connect2mysql {
    public static void main(String args[]){
//        System.out.println("********Start test Mysql*******");
//        Connection con = null;
//        String sqlUrl = "jdbc:mysql://127.0.0.1:3306/bookmanagment";
//        String user = "test";
//        String passwd = "test";
//        String sqlQuery = "select * from user;";
////        ? 获取MySQL驱动的实例
//        try {
////            反射
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            con = DriverManager.getConnection(sqlUrl + "?user=" + user + "&password=" + passwd + "&useSSL=true"
//                    + "&verifyServerCertificate=false");
////            con = DriverManager.getConnection(sqlUrl+"/user",user,passwd);
//            if (!con.isClosed()){
//                System.out.println("--------------connected to DB Successfully -------------");
//                Statement st = con.createStatement();
//                ResultSet rs = st.executeQuery(sqlQuery);
//                while(rs.next()){
//                    System.out.println("########## id " + rs.getInt("id"));
//                    System.out.println("########## name " + rs.getString("name"));
//                    System.out.println("########## passwd " + rs.getString("passwd"));
//                    System.out.println("########## client " + rs.getInt("client"));
//                    System.out.println("########## admin " + rs.getInt("admin"));
//                    System.out.println("########## seller " + rs.getInt("seller"));
//                }
//                con.close();
//            }
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
