/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Student;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Answer;
import model.Question;
import service.impl.QuestionService;

@WebServlet(urlPatterns = {"/do-quiz"})
public class DoQuizController extends HttpServlet {

    private List<Question> list;
    private int id;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int n = Integer.parseInt(req.getParameter("number"));
        id = Integer.parseInt(req.getParameter("idSub"));

        list = QuestionService.getInstance().getRandomQuestion(n, id);
        
        
        String jsonList = new Gson().toJson(list);
        req.setAttribute("values", jsonList);
        req.setAttribute("done", "None");
        req.setAttribute("list", list);
        req.getRequestDispatcher("views/student/do-quiz.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> radio = new ArrayList<>();
        for(Question q : list){
            radio.add(req.getParameter("answ" + q.getId()));
            System.out.println(req.getParameter("answ" + q.getId()));
        }
        req.setAttribute("checkList", radio);
        req.setAttribute("list", list);
        req.setAttribute("idSub", id);
        req.getRequestDispatcher("views/student/review-quiz.jsp").forward(req, resp);
    }

}
