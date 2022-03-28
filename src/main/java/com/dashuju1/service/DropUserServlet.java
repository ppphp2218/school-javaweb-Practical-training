package com.dashuju1.service;

import com.dashuju1.Dao.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DropUserServlet", urlPatterns = "/DropUserServlet")
public class DropUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        System.out.println(id);
        UserDao u = new UserDao();
        u.DropUser(id);
        request.getRequestDispatcher("um.jsp").forward(request,response);
    }
}
