/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.Account;
import service.impl.EnrollService;
import utils.SessionUtil;

@WebServlet(urlPatterns = {"/enroll"})
public class EnrollSubject extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("idSub"));
        EnrollService.getInstance().enroll(((Account)SessionUtil.getInstance().getValue(req, "account")).getUserName(), id);
        resp.sendRedirect("subject-details?id=" + id);
    }
    
}
