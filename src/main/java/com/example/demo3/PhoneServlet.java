package com.example.demo3;

import com.example.demo3.dao.PhoneDao;
import com.example.demo3.model.Phone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PhoneServlet", value = "/PhoneServlet")
public class PhoneServlet extends HttpServlet {
    PhoneDao dao = new PhoneDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("phones",getListPhone());
        request.getRequestDispatcher("listphone.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected List<Phone> getListPhone(){
        return  dao.getAllPhone();
    }
}
