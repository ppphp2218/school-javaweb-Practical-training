package com.dashuju1.Filter;

import com.dashuju1.Dao.User;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter",urlPatterns ="/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
    }
    @Override
    public void destroy() {
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest)request;
        String[] urls = {"/login.jsp","/login","/img/","/css/","/js/"};
        String url = req.getRequestURL().toString();
        for (String i : urls){
            if (url.contains(i)){
                chain.doFilter(request, response);
                return;
            }
        }
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        if (user != null){
            chain.doFilter(request, response);
        }else {
            request.setAttribute("message", "您未登录，请登录后访问<br>");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }
}
