package com.dashuju1.service;

import com.dashuju1.Dao.UserDao;
import com.dashuju1.Entity.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "ShouUserServlet", urlPatterns = "/ShouUserServlet")
public class ShouUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao d = new UserDao();
        ArrayList<User> list = d.ShouAllUser();
        request.setAttribute("u",list);
        request.getRequestDispatcher("um.jsp").forward(request,response);
    }
}
