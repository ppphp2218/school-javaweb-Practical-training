package com.dashuju1.service;

import com.dashuju1.Dao.teacherDao;
import com.dashuju1.Entity.teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "BackstageServlet", urlPatterns = "/BackstageServlet")
public class BackstageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int semester = Integer.parseInt(request.getParameter("semester"));
        int dept = Integer.parseInt(request.getParameter("dept"));
        String tno = request.getParameter("id");
        //需要显示的页数
        int p;
        //需要显示数据的条数
        int t;
        if (semester==3){
            if (dept==1){
                if (tno == ""){
                    request.setAttribute("n", 1);
                    request.getRequestDispatcher("/PageServlet").forward(request, response);
                }else {
                    teacherDao td = new teacherDao();
                    ArrayList<teacher> list = td.selectDept1All();
                    System.out.println(list);
                    boolean flag = false;
                    for (teacher e : list){
                        System.out.println(e.getTid());
                        System.out.println(tno);
                        if (Integer.parseInt(tno)==e.getTid()){
                            p=1;
                            t=1;
                            flag =true;
                            //显示e
                            ArrayList<teacher> l = new ArrayList<>();
                            l.add(0,e);
                            request.setAttribute("tel", l);
                            request.setAttribute("n", 1);
                            request.setAttribute("p", p);
                            request.setAttribute("t", t);
                            request.getRequestDispatcher("/Backstage management1.jsp").forward(request, response);
                            break;
                        }
                    }
                    if (flag=false){
                        //显示未查询到
                    }
                }
            }else {
                //显示未查询到
            }
        }else {
            //显示未查询到
        }
    }

}
