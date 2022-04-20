package com.dashuju1.service;

import com.dashuju1.Dao.User;
import com.dashuju1.DbUtils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserService {
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
            DbUtils.close(con,st,rs);
        }catch (SQLException e){
            throw new RuntimeException("数据库连接异常"+e.getMessage());
        }
        return user;
    }

    public ArrayList<User> ShouAllUser(){
        ArrayList<User> list = new ArrayList<>();
        User user;
        try {
            String sql = "select * from user";
            con = DbUtils.getConnection();
            st = con.prepareStatement(sql);
            rs =st.executeQuery();
            int i = 0;
            while (rs.next()){
                user = new User();
                user.setUser_id(rs.getString(1));
                user.setUser_tno(rs.getString(2));
                user.setUser_pass(rs.getString(3));
                list.add(i,user);
                i++;
            }
            DbUtils.close(con,st,rs);
        }catch (SQLException e){
            throw new RuntimeException("数据库连接异常"+e.getMessage());
        }
        return list;
    }

    public void AddUser(String tno,String tpass){
        try {
            String sql = "insert into user(user_tno, user_pass) VALUES(?,?);";
            con = DbUtils.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1,tno);
            st.setString(2,tpass);
            st.executeUpdate();
            DbUtils.close(con,st,rs);
        }catch (SQLException e){
            throw new RuntimeException("数据库连接异常"+e.getMessage());
        }
    }

    public void DropUser(String id){
        try {
            String sql = "delete from user where id=?";
            con = DbUtils.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1,id);
            st.executeUpdate();
            DbUtils.close(con,st,rs);
        }catch (SQLException e){
            throw new RuntimeException("数据库连接异常"+e.getMessage());
        }
    }

    public void UpdateUser(String tid,String tpass){
        try {
            String sql = "UPDATE user set user_pass=? where id=?";
            con = DbUtils.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1,tpass);
            st.setString(2,tid);
            st.execute();
            DbUtils.close(con,st,rs);
        }catch (SQLException e){
            throw new RuntimeException("数据库连接异常"+e.getMessage());
        }
    }

}
