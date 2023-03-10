/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Expert;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import service.impl.SubjectService;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/exper-public-subject"})
public class ExpertPublicSubject extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        boolean isPublic = Boolean.parseBoolean(req.getParameter("isPublic"));
        SubjectService.getInstance().changePublic(isPublic, id);
        resp.sendRedirect("expert-subject-management");
    }
    
    
    
}
