package com.dashuju1.servlet;

import com.alibaba.fastjson.JSON;
import com.dashuju1.Dao.teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "PagesServlet", urlPatterns = "/PagesServlet")
public class PagesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ArrayList<teacher> list = (ArrayList<teacher>) session.getAttribute("list1");
        response.setContentType("application/json;charset=utf-8");
        response.getWriter().write(JSON.toJSONString(list));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
