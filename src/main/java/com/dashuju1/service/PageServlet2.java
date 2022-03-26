package com.dashuju1.service;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "PageServlet2", urlPatterns = "/PageServlet2")
public class PageServlet2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int u = Integer.parseInt(request.getParameter("up"));
        request.setAttribute("s",u);
        int g= Integer.parseInt(request.getParameter("go"));
        request.setAttribute("s",g);
        int d= Integer.parseInt(request.getParameter("down"));
        request.setAttribute("s",d);
        request.getRequestDispatcher("/PageServlet").forward(request, response);
    }
}
