/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Student;

import dao.impl.SubjectDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import model.Category;
import model.Post;
import model.Subject;
import service.impl.AccountService;
import service.impl.CategoryService;
import service.impl.PostService;
import service.impl.SubjectService;

@WebServlet(urlPatterns = {"/home"})
public class HomepageController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Subject> subjectList = SubjectService.getInstance().getTopThree();
        List<Post> postList = PostService.getInstance().getTopTwo();
        List<Category> cateList = CategoryService.getInstance().getAllCate();
        
//        request.setAttribute("crTime", getCurrentDate());
        request.setAttribute("accService", AccountService.getInstance());
        request.setAttribute("sbjList", subjectList);
        request.setAttribute("pstList", postList);        
        request.setAttribute("cateList", cateList);
        request.getRequestDispatcher("views/student/home.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
