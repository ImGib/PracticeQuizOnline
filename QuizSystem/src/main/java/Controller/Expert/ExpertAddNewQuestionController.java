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
import java.util.ArrayList;
import java.util.List;
import model.Subject;
import service.impl.AnswerService;
import service.impl.QuestionService;
import service.impl.SubjectService;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/expert-add-new-question"})
public class ExpertAddNewQuestionController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Subject> listS = SubjectService.getInstance().getAllSubject();
        req.setAttribute("listS", listS);
        req.getRequestDispatcher("views/expert/Expert_AddNewQuestion.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        int idSub = Integer.parseInt(req.getParameter("subject"));
        String question = req.getParameter("question");
        List<String> answer = new ArrayList<>();
        for(int i = 1; i< 5; i++){
            answer.add(req.getParameter("answer" + i));
        }
//        String answer1 = req.getParameter("answer1");
//        String answer2 = req.getParameter("answer2");
//        String answer3 = req.getParameter("answer3");
//        String answer4 = req.getParameter("answer4");
        String[] correctA = req.getParameterValues("check");
        String mess = QuestionService.getInstance().createNewQuestion(idSub, question, answer, correctA);
        try {
            int idQ = Integer.parseInt(mess);
            AnswerService.getInstance().createNewAnswerForAQuess(idQ, answer, correctA);
            resp.sendRedirect("expert-question-management?index=1&&search=&&idSub=-1");
        } catch (IOException | NumberFormatException e) {
            req.setAttribute("nameClass", "alert alert-warning");
            req.setAttribute("mess", mess);
            doGet(req, resp);
        }
    }
    
    
    
}
