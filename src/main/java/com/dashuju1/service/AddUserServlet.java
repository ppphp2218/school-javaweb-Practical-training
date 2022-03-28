package com.dashuju1.service;

import com.dashuju1.Dao.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AddUserServlet", urlPatterns = "/AddUserServlet")
public class AddUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String tno = request.getParameter("username");
        String tpass = request.getParameter("password");
        UserDao d = new UserDao();
        d.AddUser(tno,tpass);
        request.getRequestDispatcher("ShouUserServlet").forward(request,response);

    }
}
