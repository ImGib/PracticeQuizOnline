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
import java.util.List;
import model.Post;
import service.impl.AccountService;
import service.impl.PostService;
import utils.PagginationUtil;

/**
 *
 * @author asus
 */
@WebServlet(name="Maketing", urlPatterns={"/marketing-post"})
public class Post_Manage extends HttpServlet {
   
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    } 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String txt = "";
        txt=request.getParameter("txt");
        if(txt==null)txt="";
        List<Post> listP= PostService.getInstance().findPostByTitleAndAuthor("");
        
        //------------------------Phan Trang----------------------------------------------
        int size = listP.size(); 
        int pageIndex=1;
        try {
            pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
        } catch (NumberFormatException e) {
        }
        pageIndex= PagginationUtil.getInstance().pageIndex(pageIndex, size);
        listP=PostService.getInstance().findPostByTextAndPagination(txt, pageIndex, PagginationUtil.getInstance().getNrpp());
 //-----------------------------------------------------------------------------------       
        request.setAttribute("totalPage", PagginationUtil.getInstance().getTotalPage());
        request.setAttribute("size", size);
        request.setAttribute("txt",txt );
        request.setAttribute("pageIndex",pageIndex);
        request.setAttribute("listP", listP);
        request.getRequestDispatcher("views/marketing/Marketing-Post-Management.jsp").forward(request, response);
    } 

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
