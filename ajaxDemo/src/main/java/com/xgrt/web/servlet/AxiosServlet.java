package com.xgrt.web.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(urlPatterns = "/axiosServlet")
public class AxiosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("get……");
        //1.接收请求参数
        String username = request.getParameter("username");
        System.out.println(username);
        //2.响应数据
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("你好，Axios！");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post……");
        this.doGet(request, response);
    }
}
