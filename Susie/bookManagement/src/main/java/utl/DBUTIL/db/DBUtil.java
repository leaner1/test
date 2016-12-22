package utl.DBUTIL.db;

import java.sql.*;

/**
 * Created by husiq on 12/16/2016.
 */
public class DBUtil {
        private static final String sqlUrl = "jdbc:mysql://127.0.0.1:3306/bookmanagment";
        private static final String user = "test";
        private static final String passwd = "test";
        private static Connection con = null;
        private String sqlQuery = "select * from user;";

        static {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection(sqlUrl + "?user=" + user + "&password=" + passwd + "&useSSL=true"
                        + "&verifyServerCertificate=false");
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public static Connection getConnection(){
            System.out.println("********connect to Mysql*******");
            return con;
        }
}
