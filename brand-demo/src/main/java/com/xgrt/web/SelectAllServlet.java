package com.xgrt.web;

import com.alibaba.fastjson2.JSON;
import com.xgrt.pojo.Brand;
import com.xgrt.service.BrandService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/selectAllServlet")
public class SelectAllServlet extends HttpServlet {
    private BrandService brandService = new BrandService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //1.调用service查询
        List<Brand> brands = brandService.selectAll();

        //2.将集合转换为JSON数据 序列化
        String jsonString = JSON.toJSONString(brands);

        //3.响应数据
        response.setContentType("text/json;charset=utf-8");//响应的是JSON数据而不是HTML
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
