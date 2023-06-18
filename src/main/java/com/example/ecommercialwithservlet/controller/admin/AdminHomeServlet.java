package com.example.ecommercialwithservlet.controller.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AdminHomeServlet", value = "/AdminHomeServlet")
public class AdminHomeServlet extends HttpServlet {

    public AdminHomeServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String adminHomePage = "admin/index.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(adminHomePage);
        requestDispatcher.forward(request, response);
    }

}
