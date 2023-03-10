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
import model.Account;
import model.Answer;
import model.Question;
import model.Subject;
import service.impl.AnswerService;
import service.impl.QuestionService;
import service.impl.SubjectService;
import utils.SessionUtil;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/expert-edit-question"})
public class ExpertEditQuestion extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Account a = (Account) SessionUtil.getInstance().getValue(req, "account");
        String id = req.getParameter("id");
        Question q = QuestionService.getInstance().getQuestionById(id);
        List<Subject> listS = SubjectService.getInstance().getAllSubjectByAccount(a);
        List<Answer> listA = AnswerService.getInstance().getAnswerByIdQues(id);
        try {
            req.setAttribute("answer1", listA.get(0).getAnswer());
            req.setAttribute("id1", listA.get(0).getId());
            req.setAttribute("check1", listA.get(0).isIsCorrect()?"checked":"");
        } catch (Exception e) {
            req.setAttribute("answer1", "");
        }
        try {
            req.setAttribute("answer2", listA.get(1).getAnswer());
            req.setAttribute("id2", listA.get(1).getId());
            req.setAttribute("check2", listA.get(1).isIsCorrect()?"checked":"");
        } catch (Exception e) {
            req.setAttribute("answer2", "");
        }
        try {
            req.setAttribute("answer3", listA.get(2).getAnswer());
            req.setAttribute("id3", listA.get(2).getId());
            req.setAttribute("check3", listA.get(2).isIsCorrect()?"checked":"");
        } catch (Exception e) {
            req.setAttribute("answer3", "");
        }
        try {
            req.setAttribute("answer4", listA.get(3).getAnswer());
            req.setAttribute("id4", listA.get(3).getId());
            req.setAttribute("check4", listA.get(3).isIsCorrect()?"checked":"");
        } catch (Exception e) {
            req.setAttribute("answer4", "");
        }
        req.setAttribute("listS", listS);
        req.setAttribute("question", q);
        req.getRequestDispatcher("views/expert/Expert-Edit-Question.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idQ = req.getParameter("id");
        String question = req.getParameter("question");
        List<String> answer = new ArrayList<>();
        List<String> id = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            answer.add(req.getParameter("answer" + (i + 1)));
            id.add(req.getParameter("id" + (i + 1)));
        }
        String[] correctA = req.getParameterValues("check");
//        req.setAttribute("cr", correctA[0]);
//        req.setAttribute("id", id);
//        req.setAttribute("answer", answer);
//        req.getRequestDispatcher("views/Check.jsp").forward(req, resp);
        String mess = AnswerService.getInstance().checkAndUpdateAnswer(idQ, correctA, answer, id);
       
        if(mess == null){
            QuestionService.getInstance().updateQuestion(idQ, question);
            resp.sendRedirect("expert-question-management?index=1&&search=&&idSub=-1");
        }else{
            req.setAttribute("nameClass", "alert alert-warning");
            req.setAttribute("mess", mess);
            doGet(req, resp);
        }
    }
    
    
    
}
