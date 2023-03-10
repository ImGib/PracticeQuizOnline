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
import model.Account;
import model.Subject;
import service.impl.AccountService;
import service.impl.PostService;
import service.impl.SubjectService;
import utils.PagginationUtil;
import utils.SessionUtil;

@WebServlet(urlPatterns = {"/enroll-list"})
public class EnrollListControllers extends HttpServlet {

    private int pageIndex = 1;
    private int size = 0;
    List<Subject> subList;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        SessionUtil.getInstance().putValue(req, "crPage", "Enroll List");
        paginationPost(req);
        req.setAttribute("accService", AccountService.getInstance());
        req.getRequestDispatcher("views/student/enroll-list.jsp").forward(req, resp);
    }

    void paginationPost(HttpServletRequest req) {
        Account acc = (Account) SessionUtil.getInstance().getValue(req, "account");
        size = SubjectService.getInstance().countEnrollByUsername(acc.getUserName());
        PagginationUtil.getInstance().setNrpp(9);
        try {
            pageIndex = Integer.parseInt(req.getParameter("pageIndex"));
        } catch (Exception e) {
        }

        pageIndex = PagginationUtil.getInstance().pageIndex(pageIndex, size);
        System.out.println( PagginationUtil.getInstance().getTotalPage());
        subList = SubjectService.getInstance().getEnrollByUsername(acc.getUserName(), pageIndex, PagginationUtil.getInstance().getNrpp());

        req.setAttribute("pageIndex", pageIndex);
        req.setAttribute("subList", subList);
        req.setAttribute("totalPagination", PagginationUtil.getInstance().getTotalPage());

    }
}
