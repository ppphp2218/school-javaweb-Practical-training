package com.dashuju1.service;

import com.dashuju1.Entity.teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "PageServlet", urlPatterns = "/PageServlet")
public class PageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //当前页数
        int n = (int) request.getAttribute("n");
        //需要显示的页数
        int p;
        //需要显示数据的条数
        int t;
        ArrayList<teacher> list = (ArrayList<teacher>) request.getAttribute("teacher");
        t=list.size();
        p=t/10;
        System.out.println(list);
        ArrayList<teacher> te = new ArrayList<>();
        int ns = n*10;
        if(null!=list && list.size() !=0){
            for (int i = ns-10;i<ns;i++){
                te.add(i,list.get(i));
            }
        }
        request.setAttribute("p",p);
        request.setAttribute("t",t);
        request.setAttribute("tel",te);
        request.getRequestDispatcher("/Backstage management1.jsp").forward(request, response);
    }
}
