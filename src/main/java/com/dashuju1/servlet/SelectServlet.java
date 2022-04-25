package com.dashuju1.servlet;

import com.alibaba.fastjson.JSON;
import com.dashuju1.Dao.teacher;
import com.dashuju1.service.TeacherServers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "SelectServlet", urlPatterns = "/SelectServlet")
public class SelectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String id = request.getParameter("id");
        int dept = Integer.parseInt(request.getParameter("dept"));
        int ses = Integer.parseInt(request.getParameter("ses"));
        TeacherServers ts = new TeacherServers();
        if (ses == 1) {
            if (dept == 1) {
                if (id == "") {
                    HttpSession session = request.getSession();
                    ArrayList<teacher> list = ts.selectDept1All();
                    session.setAttribute("list", list);
                    response.setContentType("text/html;charset=utf-8");
                    response.getWriter().write("true");
                }else {
                    teacher t = ts.selectbyID(Integer.parseInt(id));
                    if (t != null) {
                        System.out.println(JSON.toJSONString(t));
                        response.setContentType("text/json;charset=utf-8");
                        response.getWriter().write(JSON.toJSONString(t));
                    }else {
                        response.setContentType("text/html;charset=utf-8");
                        response.getWriter().write("false");
                    }
                }
            }else {
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().write("false");
            }
        }else {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("false");
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
