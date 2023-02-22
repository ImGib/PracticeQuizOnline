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

@WebServlet(urlPatterns = {"/blog"})
public class BlogController extends HttpServlet {

    private int pageIndex = 1;
    private int size = PostService.getInstance().countPost();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        paginationPost(req);
        List<Post> pstList = PostService.getInstance().getPostPagination(pageIndex, size);

        req.setAttribute("postList", pstList);
        req.getRequestDispatcher("views/student/blog.jsp").forward(req, resp);
    }

    void paginationPost(HttpServletRequest req) {
        PagginationUtil.getInstance().setNrpp(4);
        try {
            pageIndex = Integer.parseInt(req.getParameter("pageIndex"));
        } catch (Exception e) {
        }
        pageIndex = PagginationUtil.getInstance().pageIndex(pageIndex, size);
        req.setAttribute("pageIndex", pageIndex);
        req.setAttribute("totalPage", PagginationUtil.getInstance().getTotalPage());
        req.setAttribute("begin", PagginationUtil.getInstance().getBegin());
        req.setAttribute("end", PagginationUtil.getInstance().getEnd());
    }
}
