package test;

import java.sql.*;

/**
 * Created by husiq on 12/15/2016.
 */
public class connect2mysql {
    public static void main(String args[]){
        //test
        System.out.println("********Start test Mysql*******");
        Connection con = null;
        String sqlUrl = "jdbc:MySQL://127.0.0.1/bookmanagment";
        String user = "root";
        String passwd = "password1";
        String sqlQuery = "select * from user where id = 0";
//        ? 获取MySQL驱动的实例
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(sqlUrl+"/user",user,passwd);
            if (!con.isClosed()){
                System.out.println("--------------connected to DB Successfully -------------");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sqlQuery);
                while(rs.next()){
                    System.out.println("########## id " + rs.getInt("id"));
                    System.out.println("########## name " + rs.getString("name"));
                    System.out.println("########## passwd " + rs.getString("passwd"));
                    System.out.println("########## client " + rs.getInt("client"));
                    System.out.println("########## admin " + rs.getInt("admin"));
                    System.out.println("########## seller " + rs.getInt("seller"));
                }
                con.close();
            }
            else{
                System.out.println("--------------failed to connected to DB -------------");
            }
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
}
