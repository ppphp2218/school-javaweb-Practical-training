package com.dashuju1.service;

import com.dashuju1.Dao.teacher;
import com.dashuju1.DbUtils.DbUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TeacherServers {
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    public ArrayList<teacher> selectDept1All(){
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
        } catch (SQLException e) {
            throw new RuntimeException("数据库连接异常" + e.getMessage());
        } finally {
            try {
                DbUtils.close(con, st, rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return list;
    }
    public teacher selectbyID(int id){
        teacher tea = null;
        ArrayList<teacher> list = this.selectDept1All();
        for (teacher t:list) {
            if (t.getTid()==id){
                tea = t;
                break;
            }
        }
        return tea;
    }
}
