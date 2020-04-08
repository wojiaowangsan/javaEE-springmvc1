package org.springmvc.class03.controller;

import org.springmvc.class03.jdbc.StudentHomeworkjdbc;
import org.springmvc.class03.model.StudentHomework;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
//@Controller
//@RequestMapping(path = "/list")
@WebServlet("/list")
public class StudentHomeworkController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<org.springmvc.class03.model.StudentHomework> list = StudentHomeworkjdbc.selectAll();


        req.setAttribute("list", list);

        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
