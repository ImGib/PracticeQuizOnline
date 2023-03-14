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
import model.Subject;
import service.impl.SubjectService;
import utils.PageUtil;
import utils.SessionUtil;

@WebServlet(urlPatterns = {"/expert-subject-management"})
public class ExpertManagementSubjectController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setCharacterEncoding("UTF-8");
            String search = req.getParameter("search");
            int index = Integer.parseInt(req.getParameter("index"));
            PageUtil p = new PageUtil();
            p.setNrpp(3);
            p.setIndex(index);
            p.setSearch(search);
            Account a = (Account) SessionUtil.getInstance().getValue(req, "account");
            p.setUserName(a.getUserName());
            p.setTotalPage(SubjectService.getInstance().getNumberSubjectBySearchAndUserName(p));
            List<Subject> list = SubjectService.getInstance().getAllSubjectAndNumberEnrollBySearchAndUserName(p);
            req.setAttribute("list", list);
            req.setAttribute("totalPage", p.getTotalPage());
            req.setAttribute("index", p.getIndex());
            req.setAttribute("searchName", search);
            req.setAttribute("isManageSubject", true);
            req.getRequestDispatcher("views/expert/Expert-Subject-Management.jsp").forward(req, resp);
        } catch (ServletException | IOException | NumberFormatException e) {
            req.getRequestDispatcher("views/expert/Expert_Statistic.jsp").forward(req, resp);
        }
    }

}
