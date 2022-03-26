package com.dashuju1.service;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "PageServlet2", urlPatterns = "/PageServlet2")
public class PageServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("111");
//        Map<String, String[]> parameterMap = request.getParameterMap();
//        String[] s1 = parameterMap.get("a");
//        String[] s2 = parameterMap.get("n");
//        String a = s1[0];
//        int n = Integer.parseInt(s2[0]);
//        System.out.println(a);
//        System.out.println(n);
//        if (a.equals("a")){
//            if (n>1){
//                n = n-1;
//                request.setAttribute("n", n);
//                request.getRequestDispatcher("/PageServlet").forward(request, response);
//            }
//        }else if (a.equals("b")){
//            n = n+1;
//            request.setAttribute("n", n);
//            request.getRequestDispatcher("/PageServlet").forward(request, response);
//        }else {
//            n=Integer.parseInt(a);
//            request.setAttribute("n", n);
//            request.getRequestDispatcher("/PageServlet").forward(request, response);
//        }
////        doGet(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int n = Integer.parseInt(request.getParameter("go"));
        if (n>=1) {
            request.setAttribute("n", n);
            request.getRequestDispatcher("/PageServlet").forward(request, response);
        }

    }
}

