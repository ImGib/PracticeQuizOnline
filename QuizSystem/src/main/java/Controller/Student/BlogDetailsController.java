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
import model.Post;
import service.impl.PostService;
import utils.SessionUtil;

@WebServlet(urlPatterns = {"/blog-details"})
public class BlogDetailsController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SessionUtil.getInstance().putValue(req, "crPage", "Blog");

        String id = req.getParameter("postId");
        if (id == null) {
            id = "";
        }
        Post post = PostService.getInstance().getPostDetails(id);
        PostService.getInstance().upNumberAccess(Integer.parseInt(id));
        req.setAttribute("crPost", post);
        req.getRequestDispatcher("views/student/blog-details.jsp").forward(req, resp);
    }

}
