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
import model.Post;
import service.impl.PostService;
import utils.PagginationUtil;
import utils.SessionUtil;

@WebServlet(urlPatterns = {"/blog"})
public class BlogController extends HttpServlet {

    private int pageIndex = 1;
    private int size = 0;
    private String search = "";
    List<Post> pstList;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        SessionUtil.getInstance().putValue(req, "crPage", "Blog");

        paginationPost(req);

        req.setAttribute("postList", pstList);
        req.setAttribute("pplPost", PostService.getInstance().getTopPopular());
        req.getRequestDispatcher("views/student/blog.jsp").forward(req, resp);
    }

    void paginationPost(HttpServletRequest req) {
        search = req.getParameter("search");
        if (search == null) {
            search = "";
        }
        size = PostService.getInstance().countSearchPost(search);
        PagginationUtil.getInstance().setNrpp(4);
        try {
            pageIndex = Integer.parseInt(req.getParameter("pageIndex"));
        } catch (Exception e) {
        }

        pageIndex = PagginationUtil.getInstance().pageIndex(pageIndex, size);

        pstList = PostService.getInstance().getPostPagination(search, pageIndex, PagginationUtil.getInstance().getNrpp());

        req.setAttribute("search", search);
        req.setAttribute("pageIndex", pageIndex);
        req.setAttribute("totalPagination", PagginationUtil.getInstance().getTotalPage());

    }
}
