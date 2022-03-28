package com.dashuju1.DbUtils;

import java.sql.*;

public class DbUtils {

    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() throws SQLException {
        Connection con = null;
        con = DriverManager.getConnection("jdbc:mysql://39.105.122.88:3306/homework","root","221827");
        return con;
    }
    public static void close(Connection con, Statement st, ResultSet rs) throws SQLException {
        try {
            if (st!=null)
                st.close();
            if (rs!=null)
                rs.close();
            if (con!=null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void close(Connection con, Statement st) throws SQLException {
        try {
            if (st!=null)
                st.close();
            if (con!=null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

