package com.dashuju1.servlet;

import com.alibaba.fastjson.JSON;
import com.dashuju1.Dao.page;
import com.dashuju1.Dao.teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author luten
 */
@WebServlet(name = "PageServlet", urlPatterns = "/PageServlet")
public class PageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ArrayList<teacher> list = (ArrayList<teacher>) session.getAttribute("list");
        int page;
        int pages = Integer.parseInt(request.getParameter("page"));
        if (pages == 0) {
            com.dashuju1.Dao.page p = (com.dashuju1.Dao.page) session.getAttribute("page");
            page = p.getPage()+1;
        }else if (pages == -1) {
            com.dashuju1.Dao.page p = (com.dashuju1.Dao.page) session.getAttribute("page");
            page = p.getPage()-1;
        }else {
            page = pages;
        }
        int pageSize = 10;
        int start = (page - 1) * pageSize;
        int end = page * pageSize;
        if (end > list.size()) {
            end = list.size();
        }
        ArrayList<teacher> list1 = new ArrayList<teacher>();
        for (int i = start; i < end; i++) {
            list1.add(list.get(i));
        }
        com.dashuju1.Dao.page p = new page();
        p.setPage(page);
        p.setPageSize(pageSize);
        p.setTotalPage(list.size() % pageSize == 0 ? list.size() / pageSize : list.size() / pageSize + 1);
        p.setTotalcount(list.size());
        session.setAttribute("list1", list1);
        session.setAttribute("page", p);
        response.getWriter().print(p.getTotalPage());
        System.out.println(p.getTotalPage());
        System.out.println(JSON.toJSONString(list1));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
