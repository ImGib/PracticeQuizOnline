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
import model.Question;
import model.Subject;
import service.impl.QuestionService;
import service.impl.SubjectService;
import utils.PageUtil;
import utils.SessionUtil;

/**
 *
 * @author Gib
 */
@WebServlet(urlPatterns = {"/expert-question-management"})
public class ExpertManagementQuestionController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String search = req.getParameter("search");
        int index;
        try {
            index = Integer.parseInt(req.getParameter("index"));
        } catch (NumberFormatException e) {
            index = 1;
        }
        int idSub;
        try {
            idSub = Integer.parseInt(req.getParameter("idSub"));
        } catch (NumberFormatException e) {
            idSub = -1;
        }
        PageUtil p = new PageUtil();
        p.setNrpp(10);
        p.setIndex(index);
        p.setSearch(search);
        p.setIdSub(idSub);
        Account a = (Account) SessionUtil.getInstance().getValue(req, "account");
        p.setUserName(a.getUserName());
        p.setTotalPage(QuestionService.getInstance().getNumberQuestionByAll(p));
        List<Question> list = QuestionService.getInstance().findAll(p);
        List<Subject> listS = SubjectService.getInstance().getAllSubjectByAccount(a);
        req.setAttribute("listS", listS);
        req.setAttribute("listQ", list);
        req.setAttribute("totalPage", p.getTotalPage());
        req.setAttribute("index", p.getIndex());
        req.setAttribute("searchName", search);
        req.setAttribute("idSub", idSub);
        req.setAttribute("isManageQuestion", true);
        req.getRequestDispatcher("views/expert/Expert_Question_Management.jsp").forward(req, resp);

    }

}
