package com.example.restdemo;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet is an annotation to indicate that the Java class should be treated as a servlet and registered with the
//Servlet container. The name parameter specifies the name of the servlet that will be registered with the container.
//The value parameter specifies the URL pattern or patterns that the servlet should be mapped to.
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;
    @Override
    public void init() {
        message = "This is a message for you! You have chosen   /hello-servlet   path.";
    }
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }
    @Override
    public void destroy() {
// Perform any necessary cleanup or resource releasing operations here
        System.out.println("Servlet destroyed");
    }
}