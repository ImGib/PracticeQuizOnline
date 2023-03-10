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
import service.impl.SliderService;
import service.impl.SubjectService;
import utils.SessionUtil;

@WebServlet(urlPatterns = {"/home"})
public class HomepageController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        SessionUtil.getInstance().putValue(request, "crPage", "QuixLab");
        SessionUtil.getInstance().putValue(request, "pplPost", PostService.getInstance().getTopPopular());

        request.setAttribute("accService", AccountService.getInstance());
        request.setAttribute("sliders", SliderService.getIntance().getAll());
        request.setAttribute("sbjList", SubjectService.getInstance().getTopThree());
        request.setAttribute("pstList", PostService.getInstance().getTopTwo());
        request.setAttribute("cateList", CategoryService.getInstance().getAllCate());
        request.getRequestDispatcher("views/student/home.jsp").forward(request, response);
        //update
    }
}
