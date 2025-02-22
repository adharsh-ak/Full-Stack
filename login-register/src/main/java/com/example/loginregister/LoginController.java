package com.example.loginregister;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.model.UserDAO;
import jakarta.validation.constraints.NotNull;

@WebServlet(value = "/LoginController")
public class LoginController extends HttpServlet {
    public static final long serialVersionUID = 1L;

//    private String message; this is from template

    /**
     * seeHttp Servlet #doPost(HttpServletRequest request,HttpServeltResponse response)
     */


//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        response.setContentType("text/html");                                                             From template
//        PrintWriter out = response.getWriter();                                                           From template
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
//    }
    protected void doPost (@NotNull HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        //TODO
        String uname =request.getParameter("uname");
        String password = request.getParameter("pass");

        String fname = new UserDAO().checkUser(uname,password);
        System.out.println(fname);
        if(!fname.isEmpty()){
            response.sendRedirect("success.html");
            return;
        }
        response.sendRedirect("index.html");
    }

    public void destroy() {
    }
}