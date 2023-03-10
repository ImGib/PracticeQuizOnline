/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Expert;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.Subject;
import service.impl.QuestionService;
import service.impl.SubjectService;
import utils.SessionUtil;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/expert-home"})
public class ExpertHomeController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Account a = (Account) SessionUtil.getInstance().getValue(req, "account");
        int numberSubject = SubjectService.getInstance().getNumberSubjectByUserName(a.getUserName());
        int numberQuestion = QuestionService.getInstance().getNumberQuestionByUserName(a.getUserName());
        int numberStudent = SubjectService.getInstance().getNumberStudentByIdAuthor(a.getUserName());
        List<Subject> listS = SubjectService.getInstance().getListSubjectAndNumberQuestionByUserName(a.getUserName());
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
        req.setAttribute("numberQuestion", numberQuestion);
        req.setAttribute("numberStudent", numberStudent);
        req.getRequestDispatcher("views/expert/Expert_Statistic.jsp").forward(req, resp);
    }
    
}
