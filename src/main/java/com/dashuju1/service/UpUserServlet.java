package com.dashuju1.service;

import com.dashuju1.Dao.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "UpUserServlet", urlPatterns = "/UpUserServlet")
public class UpUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String pass = request.getParameter("password");
        UserDao u = new UserDao();
        u.UpdateUser(id,pass);
        request.getRequestDispatcher("um.jsp").forward(request,response);
    }
}
