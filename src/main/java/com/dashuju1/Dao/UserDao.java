package com.dashuju1.Dao;

import com.dashuju1.Entity.User;
import com.dashuju1.DbUtils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
                user.setUser_pass(rs.getString(2));
                user.setUser_tno(rs.getString(3));
                list.add(i,user);
                i++;
            }
        }catch (SQLException e){
            throw new RuntimeException("数据库连接异常"+e.getMessage());
        }finally {
            DbUtils.close(con,st,rs);
        }
        return list;
    }

    public void AddUser(User u){
        String tid = u.getUser_id();
        String tno = u.getUser_tno();
        String tpass = u.getUser_pass();
        try {
            String sql = "insert into user(id,user_tno, user_pass) VALUES(?,?,?)";
            con = DbUtils.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1,tid);
            st.setString(2,tno);
            st.setString(3,tpass);
            rs =st.executeQuery();
        }catch (SQLException e){
            throw new RuntimeException("数据库连接异常"+e.getMessage());
        }finally {
            DbUtils.close(con,st,rs);
        }
    }

    public void DropUser(User u){
        String tid = u.getUser_id();
        String tno = u.getUser_tno();
        String tpass = u.getUser_pass();
        try {
            String sql = "insert into user(id,user_tno, user_pass) VALUES(?,?,?)";
            con = DbUtils.getConnection();
            st = con.prepareStatement(sql);
            st.setString(1,tid);
            st.setString(2,tno);
            st.setString(3,tpass);
            rs =st.executeQuery();
        }catch (SQLException e){
            throw new RuntimeException("数据库连接异常"+e.getMessage());
        }finally {
            DbUtils.close(con,st,rs);
        }
    }

    public void UpdateUser(String tid,String tpass){
        try {
            String sql = "UPDATE ";
            con = DbUtils.getConnection();
            st = con.prepareStatement(sql);
//            st.setString(1,tid);
//            st.setString(2,tno);
            rs =st.executeQuery();
        }catch (SQLException e){
            throw new RuntimeException("数据库连接异常"+e.getMessage());
        }finally {
            DbUtils.close(con,st,rs);
        }
    }

}
