package com.example.demo3.controller;

import com.example.demo3.dao.PhoneDao;
import com.example.demo3.model.Phone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddPhoneServlet", value = "/AddPhoneServlet")
public class AddPhoneServlet extends HttpServlet {
    PhoneDao dao = new PhoneDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("addphones.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Phone phone = new Phone();
        phone.setName(request.getParameter("name"));
        phone.setBrand(request.getParameter("brand"));
        phone.setPrice(request.getParameter("price"));
        phone.setDescription(request.getParameter("description"));
        dao.insertPhone(phone);
        response.sendRedirect("/PhoneServlet");
    }
}
