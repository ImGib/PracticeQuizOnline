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
import java.util.List;
import model.Account;
import model.Category;
import model.Subject;
import service.impl.CategoryService;
import service.impl.SubjectService;
import service.impl.SubjectTypeService;
import utils.CheckUtil;
import utils.SessionUtil;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/expert-add-new-subject"})
public class ExpertAddNewSubjectController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Category> listC = CategoryService.getInstance().getAllCate();

        req.setAttribute("listC", listC);
        req.getRequestDispatcher("views/expert/Expert_AddNewSubject.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("subName");
        String description = req.getParameter("description");
        String img = req.getParameter("img");
        String[] cateIds = req.getParameterValues("checkBox");
        //lấy userName trên Session
        Account a = (Account) SessionUtil.getInstance().getValue(req, "account");
        Subject s = new Subject(0, name, img, description, CheckUtil.getDateNow(), a.getUserName());
        int idS = SubjectService.getInstance().createNewSubject(s);
        if (idS == -1) {
            req.setAttribute("mess", "Subject is already exist!!!");
            req.setAttribute("nameClass", "alert alert-warning");
            doGet(req, resp);
        } else {
            SubjectTypeService.getInstance().createNewSubType(cateIds, idS);
            resp.sendRedirect("expert-subject-management?index=1&&search=");
        }
    }

}
