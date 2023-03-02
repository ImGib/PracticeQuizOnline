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
import java.util.List;
import model.Category;
import model.Subject;
import service.impl.CategoryService;
import service.impl.QuestionService;
import service.impl.SubjectService;

@WebServlet(urlPatterns = {"/subject-details"})
public class SubjectDetailsController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Subject sub = SubjectService.getInstance().getSubjectById(id);
        List<Category> cateList= CategoryService.getInstance().getCateBySubId(id);
        
        req.setAttribute("questions", QuestionService.getInstance().getAllQuestionBySubId(id));
        req.setAttribute("sub", sub);
        req.setAttribute("cateList", cateList);
        req.getRequestDispatcher("views/student/subject-details.jsp").forward(req, resp);
    }
    
}
