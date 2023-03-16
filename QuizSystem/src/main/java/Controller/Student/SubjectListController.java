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
import model.Subject;
import service.impl.AccountService;
import service.impl.SubjectService;
import utils.PagginationUtil;
import utils.SessionUtil;

@WebServlet(urlPatterns = {"/subject-list"})
public class SubjectListController extends HttpServlet {

    private int pageIndex = 1;
    private int size = 0;
    private String search = "";
    List<Subject> subList;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        SessionUtil.getInstance().putValue(req, "crPage", "Subject List");
        paginationSubject(req);
        req.setAttribute("accService", AccountService.getInstance());
        req.getRequestDispatcher("views/student/subject-list.jsp").forward(req, resp);
    }

    void paginationSubject(HttpServletRequest req) {
        String type = req.getParameter("type");
        search = req.getParameter("search");

        if (search == null) {
            search = "";
        }
        System.out.println(search);
        if (type != null) {
            size = SubjectService.getInstance().count_Cate(search);
        } else {
            size = SubjectService.getInstance().count_subName(search);
        }

        PagginationUtil.getInstance().setNrpp(9);
        try {
            pageIndex = Integer.parseInt(req.getParameter("pageIndex"));
        } catch (Exception e) {
        }

        pageIndex = PagginationUtil.getInstance().pageIndex(pageIndex, size);

        if (type != null) {
            subList = SubjectService.getInstance().getSubject_Cate(search, pageIndex, PagginationUtil.getInstance().getNrpp());
        } else {
            subList = SubjectService.getInstance().getSubject_subName(search, pageIndex, PagginationUtil.getInstance().getNrpp());
        }
        
        req.setAttribute("search", search);
        req.setAttribute("pageIndex", pageIndex);
        req.setAttribute("totalPagination", PagginationUtil.getInstance().getTotalPage());
        req.setAttribute("subList", subList);
    }
}
