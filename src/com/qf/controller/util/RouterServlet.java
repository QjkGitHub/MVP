package com.qf.controller.util;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/router_servlet")
public class RouterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         // 1. 接收数据
        String mypath = request.getParameter("path");
        // 2. 处理数据

        // 3. 响应数据
        request.getRequestDispatcher("/WEB-INF/view/"+mypath+".jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}