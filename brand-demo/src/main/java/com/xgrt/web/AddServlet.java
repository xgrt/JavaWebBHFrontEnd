package com.xgrt.web;

import com.alibaba.fastjson2.JSON;
import com.xgrt.pojo.Brand;
import com.xgrt.service.BrandService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.BufferedReader;
import java.io.IOException;

@WebServlet(urlPatterns = "/addServlet")
public class AddServlet extends HttpServlet {
    private BrandService brandService=new BrandService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.接收数据，request.getParameter不能JSON数据
        /*String brandName = request.getParameter("brandName");
        System.out.println(brandName);*/

        //获取请求体
        BufferedReader br = request.getReader();
        String params = br.readLine();

        //将JSON字符串转为Java对象
        Brand brand = JSON.parseObject(params, Brand.class);
        /*System.out.println(brand);*/

        //2.调用service 添加
        brandService.add(brand);

        //3.响应成功的标识
        response.getWriter().write("success");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
