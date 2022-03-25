package com.dashuju1.service;

import com.dashuju1.Dao.UserDao;
import com.dashuju1.Entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user_tno = request.getParameter("name");
        String user_pass = request.getParameter("password");
        UserDao u = new UserDao();
        User user = u.login(user_tno,user_pass);
        if (user != null){
            response.sendRedirect(request.getContextPath()+"/Backstage management.jsp?userName="+user.getUser_tno());
        }else{
            request.setAttribute("message", "账号密码错误，请重新登录<br>");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}
