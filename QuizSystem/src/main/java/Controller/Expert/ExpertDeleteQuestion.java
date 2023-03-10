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
import service.impl.QuestionService;

/**
 *
 * @author Lenovo
 */

@WebServlet(urlPatterns = {"/expert-delete-question"})
public class ExpertDeleteQuestion extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        String id = req.getParameter("id");
        QuestionService.getInstance().deleteQuestion(id);
        resp.sendRedirect("expert-question-management?index=1&&search=&&idSub=-1");
    }
    
}
