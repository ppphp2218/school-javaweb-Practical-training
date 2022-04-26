package com.dashuju1.servlet;

import com.alibaba.fastjson.JSON;
import com.dashuju1.Dao.User;
import com.dashuju1.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "UserServlet", urlPatterns = "/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserService u = new UserService();
        ArrayList<User> users = u.ShouAllUser();
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(JSON.toJSONString(users));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}


