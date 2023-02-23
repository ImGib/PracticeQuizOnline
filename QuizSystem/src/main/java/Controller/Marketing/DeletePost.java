/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Controller.Marketing;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.impl.PostService;

/**
 *
 * @author asus
 */
@WebServlet(name="DeletePost", urlPatterns={"/marketing-deletepost"})
public class DeletePost extends HttpServlet {
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        
    } 

    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        int id=Integer.parseInt(req.getParameter("id"));
        req.setAttribute("id", id);
        req.getRequestDispatcher("views/marketing/Marketing-Post-Delete.jsp").forward(req, resp);
    } 

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        int id=Integer.parseInt(req.getParameter("id"));
        PostService.getInstance().deletePost(id);
        resp.sendRedirect("/QuizSystem/marketing-post");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
