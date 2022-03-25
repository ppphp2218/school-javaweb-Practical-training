package com.dashuju1.Dao;

import com.dashuju1.Entity.User;
import com.dashuju1.DbUtils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    public User login(String name,String password){
        User user = null;
        try {
            String sql = "select * from user where user_tno=? and user_pass=?";
            con = DbUtils.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1,name);
            st.setString(2,password);
            rs =st.executeQuery();
            if (rs.next()){
                user = new User();
                user.setUser_tno(rs.getString(1));
                user.setUser_pass(rs.getString(2));
            }
        }catch (SQLException e){
            throw new RuntimeException("数据库连接异常"+e.getMessage());
        }finally {
            DbUtils.close(con,st,rs);
        }
        return user;
    }
}
