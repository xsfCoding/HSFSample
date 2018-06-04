package com.alibaba.service;

import com.taobao.hsf.tbremoting.invoke.HSFResponseFuture;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            WebApplicationContext context = WebApplicationContextUtils
                    .getWebApplicationContext(getServletContext());
            HelloWorldService helloWorldService = (HelloWorldService)context.getBean("HelloWorldConsumer");
           //发起调用
            String hellostring= helloWorldService.sayhello("sisi");
            System.out.println("正在异步调取结果");
            //获取结果
            try {
               hellostring= (String) HSFResponseFuture.getResponse(-1);
                System.out.println(hellostring);
            } catch (com.taobao.hsf.exception.HSFException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

}
