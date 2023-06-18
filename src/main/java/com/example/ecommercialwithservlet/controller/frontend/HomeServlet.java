package com.example.ecommercialwithservlet.controller.frontend;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HomeServlet", value = "/")
public class HomeServlet extends HttpServlet {

    public HomeServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String homePage = "frontend/index.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(homePage);
        requestDispatcher.forward(request, response);
    }
}
