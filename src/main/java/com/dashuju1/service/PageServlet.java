package com.dashuju1.service;

import com.dashuju1.Dao.teacherDao;
import com.dashuju1.Entity.teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "PageServlet", urlPatterns = "/PageServlet")
public class PageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //当前页数
        int n = (int) request.getAttribute("n");
        //需要显示的页数
        System.out.println(n);
        int p;
        //需要显示数据的条数
        int t;
        teacherDao td = new teacherDao();
        ArrayList<teacher> list = td.selectDept1All();
        t=list.size();
        p=t/10;
        ArrayList<teacher> te = getlist(list,p,n);
        System.out.println(te);
        request.setAttribute("p",p);
        request.setAttribute("n",n);
        request.setAttribute("t",t);
        request.setAttribute("tel",te);
        request.getRequestDispatcher("/Backstage management1.jsp").forward(request, response);
    }
    private ArrayList<teacher> getlist(ArrayList<teacher> l,int p,int n){
        Map<Integer, ArrayList<teacher>> m = new HashMap<>();
        int li;
        int mi = 0;
        for (int i = 0;i < p;i++){
            ArrayList<teacher> ll = new ArrayList<teacher>();
            li = 0;
            for (int j = i;j<i+10;j++){
                ll.add(li,l.get(j));
                li++;
            }
            m.put(mi,ll);
        }
        return m.get(n-1);
    }
}
