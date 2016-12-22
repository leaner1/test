package utl.DBUTIL.dao;

import utl.DBUTIL.db.DBUtil;
import utl.DBUTIL.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by husiq on 12/16/2016.
 */
public class UserDao {
    public void addUser(User user) throws java.sql.SQLException{
        Connection conn = DBUtil.getConnection();
        String sql = "" +
                " insert into user" +
                " (name,passwd,client,admin,seller,email)" +
                " values (" +
                " ?,?,?,?,?,?)";
        PreparedStatement ppsm = conn.prepareStatement(sql);
        ppsm.setString(1, user.getName());
        ppsm.setString(2, user.getPasswd());
        ppsm.setBoolean(3, user.getClient());
        ppsm.setBoolean(4, user.getAdmin());
        ppsm.setBoolean(5, user.getSeller());
        ppsm.setString(6, user.getEmail());
        ppsm.execute();

    }
    public void updateUser(User user) throws java.sql.SQLException{
        Connection conn = DBUtil.getConnection();
        String sql = "" +
                " UPDATE user " +
                " set name = ?,passwd = ?,client = ?,admin = ?,seller = ?,email = ?" +
                " where id = ?";
        PreparedStatement ppsm = conn.prepareStatement(sql);
        ppsm.setString(1, user.getName());
        ppsm.setString(2, user.getPasswd());
        ppsm.setBoolean(3, user.getClient());
        ppsm.setBoolean(4, user.getAdmin());
        ppsm.setBoolean(5, user.getSeller());
        ppsm.setString(6,user.getEmail());
        ppsm.setInt(7, user.getId());
        ppsm.execute();
    }

    public void deleteUser(Integer id) throws java.sql.SQLException{
        Connection conn = DBUtil.getConnection();
        String sql = "" +
                " DELETE FROM user " +
                " where id = ?";
        PreparedStatement ppsm = conn.prepareStatement(sql);
        ppsm.setInt(1, id);
        ppsm.execute();
    }

    public List<User> query(List<Map<String,Object>> params) throws java.sql.SQLException{
        Connection conn = DBUtil.getConnection();
        Statement st = conn.createStatement();
        StringBuilder sqlQuery = new StringBuilder();
        sqlQuery.append("select * from user where 1=1");
        if (params != null && params.size()>0){
            for (int i = 0; i < params.size();i++){
                Map<String,Object> map = params.get(i);
                sqlQuery.append(" " + map.get("lo")+ " " + map.get("key") +
                        " " + map.get("rela") + " " + map.get("value"));
            }
        }
        System.out.println(sqlQuery.toString());
        ResultSet rs = st.executeQuery(sqlQuery.toString());
        List<User> users = new ArrayList<User>();
        User user = null;
        while (rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setPasswd(rs.getString("passwd"));
            user.setEmail(rs.getString("email"));
            user.setClient(rs.getInt("client") == 1);
            user.setAdmin(rs.getInt("admin") == 1);
            user.setSeller(rs.getInt("seller") == 1);
            users.add(user);
        }
        return users;
    }

    public List<User> query() throws java.sql.SQLException{
        return query("select * from user;");
    }

    public List<User> query(String sqlQuery) throws java.sql.SQLException{
        Connection conn = DBUtil.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(sqlQuery);
        List<User> users = new ArrayList<User>();
        User user = null;
        while (rs.next()){
            user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setPasswd(rs.getString("passwd"));
            user.setEmail(rs.getString("email"));
            user.setClient(rs.getInt("client") == 1);
            user.setAdmin(rs.getInt("admin") == 1);
            user.setSeller(rs.getInt("seller") == 1);
            users.add(user);
        }
        return users;
    }

    public User getUserById(Integer id) throws java.sql.SQLException{
        User user = new User();
        Connection conn = DBUtil.getConnection();
        String sql = "" +
                " SELECT * from user " +
                " where id = ?";
        PreparedStatement ppsm = conn.prepareStatement(sql);
        ppsm.setInt(1, id);
        ResultSet rs = ppsm.executeQuery();
        while (rs.next()){
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setPasswd(rs.getString("passwd"));
            user.setEmail(rs.getString("email"));
            user.setClient(rs.getInt("client") == 1);
            user.setAdmin(rs.getInt("admin") == 1);
            user.setSeller(rs.getInt("seller") == 1);
        }
        return user;
    }

    public Integer getIdByName(String name) throws java.sql.SQLException{
        Connection conn = DBUtil.getConnection();
        String sql = "" +
                " SELECT + id " + " from user " +
                " where name = ?";
        PreparedStatement ppsm = conn.prepareStatement(sql);
        ppsm.setString(1, name);
        ResultSet rs = ppsm.executeQuery();
        int id = 0;
        while (rs.next()){
            id = rs.getInt("id");
        }
        return id;

    }

    public String getPasswdByName(String name) throws java.sql.SQLException{
        return getvalueByName("passwd",name);
    }

    public String getvalueByName(String key,String name) throws java.sql.SQLException{
        Connection conn = DBUtil.getConnection();
        String sql = "" +
                " SELECT + " + key + " " + " from user " +
                " where name = ?";
        PreparedStatement ppsm = conn.prepareStatement(sql);
        ppsm.setString(1, name);
        ResultSet rs = ppsm.executeQuery();
        String value = "";
        while (rs.next()){
            value = rs.getString(key);
        }
        return value;
    }

    public Boolean verifyUser(User user)throws java.sql.SQLException {
        if (user.getName() != "" && user.getName() != null
                && user.getPasswd() != "" && user.getPasswd() != null) {
            if (getPasswdByName(user.getName()) != "" && getPasswdByName(user.getName()) != null) {
                return user.getPasswd().equals(getPasswdByName(user.getName()));
            }
            else {
                return false;
            }
        } else {
            return false;
        }
    }
}
