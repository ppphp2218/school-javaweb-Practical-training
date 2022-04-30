package com.dashuju1.servlet;

import com.dashuju1.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UsersServlet", urlPatterns = "/UsersServlet")
public class UsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("name");
        String password = request.getParameter("pass");
        UserService u = new UserService();
        int i = u.UpdateUser(id, password);
        if (i == 1) {
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().write("true");
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
