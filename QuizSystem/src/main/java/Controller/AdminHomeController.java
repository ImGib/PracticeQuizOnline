/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Subject;
import service.impl.AccountService;
import service.impl.PostService;
import service.impl.SubjectService;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/admin-home"})
public class AdminHomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int numberSubject = SubjectService.getInstance().getNumberSubject();
        int numberStaff = AccountService.getInstance().getNumberStaff();
        int numberStudent = AccountService.getInstance().getNumberStudent();
        int numberPost = PostService.getInstance().getNumberPost();
        List<Subject> listS = SubjectService.getInstance().getAllSubjectAndNumberEnoll();
        List<String> xValue = new ArrayList<>();
        List<Integer> yValue = new ArrayList<>();
        for (Subject subject : listS) {
            xValue.add(subject.getName());
            yValue.add(subject.getNumberEnroll());
        }
        Gson gson = new Gson();
        String xV = gson.toJson(xValue);
        String yV = gson.toJson(yValue);
        req.setAttribute("xValue", xV);
        req.setAttribute("yValue", yV);
        req.setAttribute("numberSubject", numberSubject);
        req.setAttribute("numberStaff", numberStaff);
        req.setAttribute("numberStudent", numberStudent);
        req.setAttribute("numberPost", numberPost);
        req.getRequestDispatcher("views/AdminHome.jsp").forward(req, resp);
    }

}
