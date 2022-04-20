package com.dashuju1.service;

import com.dashuju1.DbUtils.DbUtils;
import com.dashuju1.Entity.teacher;

import java.sql.*;
import java.util.ArrayList;

public class TeacherService {
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    public ArrayList selectDept1All(){
        ArrayList<teacher> list = null;
        try {
            list = new ArrayList<teacher>();
            String sql = "select teacher.tno, teacher.tname, score.tscore " +
                    "from teacher,score where teacher.sdept_id=5 " +
                    "and teacher.tno=score.tno order by score.tscore desc ";
            con = DbUtils.getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            int i = 1;
            while (rs.next()) {
                teacher tea = new teacher();
                tea.setTsdept("软件与大数据系");
                tea.setTid(Integer.parseInt(rs.getString("tno")));
                tea.setTname(rs.getString("tname"));
                tea.setTscore(Integer.parseInt(rs.getString("tscore")));
                tea.setTrank(i);
                list.add(tea);
                i++;
            }
        } catch (SQLException e) {            throw new RuntimeException("数据库连接异常" + e.getMessage());
        } finally {
            try {
                DbUtils.close(con, st, rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return list;
    }
}
