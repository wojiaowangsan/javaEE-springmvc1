package org.springmvc.class03.controller;

import org.springmvc.class03.jdbc.Studentjdbc;
import org.springmvc.class03.model.student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
//@Controller
//@RequestMapping(path = "/studentlist")
@WebServlet("/studentlist")
public class Student   extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<student> list = Studentjdbc.selectAll();


        req.setAttribute("list", list);

        req.getRequestDispatcher("student.jsp").forward(req, resp);
    }
}
