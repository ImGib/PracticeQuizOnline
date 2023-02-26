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
import model.Post;
import service.impl.PostService;

/**
 *
 * @author asus
 */
@WebServlet(name="EditPost", urlPatterns={"/marketing-editpost"})
public class Post_Edit extends HttpServlet {
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int id=Integer.parseInt(req.getParameter("id"));
        Post p= PostService.getInstance().findPostById(id).get(0);
        String img=p.getImg();
        String title=p.getTittle();
        String detail=p.getDetails();
        
        req.setAttribute("id", id);
        req.setAttribute("img", img);
        req.setAttribute("title", title);
        req.setAttribute("detail", detail);
        req.getRequestDispatcher("views/marketing/Marketing-Post-Edit.jsp").forward(req, resp);
    } 

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        int id=Integer.parseInt(req.getParameter("id"));
        String img=req.getParameter("img");
        String title=req.getParameter("title");
        String detail=req.getParameter("detail");
        
        req.setAttribute("id", id);
        req.setAttribute("img", img);
        req.setAttribute("title", title);
        req.setAttribute("detail", detail);
        String txt=PostService.getInstance().checkValidPostForEdit(id, title);
        if(txt==null){
            req.setAttribute("successText", "Edit Successfully!!!");
            PostService.getInstance().editPost(id, img, title, detail);
        }
        else{
            req.setAttribute("wrongText", txt);
        }
        req.getRequestDispatcher("views/marketing/Marketing-Post-Edit.jsp").forward(req, resp);
    }


}
