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
import model.Account;
import model.Post;
import service.impl.AccountService;
import service.impl.PostService;
import utils.SessionUtil;

@WebServlet(name = "AddNewPost", urlPatterns = {"/marketing-addpost"})
public class Post_Add extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("views/marketing/Marketing-Post-AddNew.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SessionUtil.getInstance().putValue(request, "account", AccountService.getInstance()
                .findAccountByRole(1).get(0));
        Account a = (Account) SessionUtil.getInstance().getValue(request, "account");
        String img = request.getParameter("img");
        String title = request.getParameter("title");
        String detail = request.getParameter("detail");
        
        request.setAttribute("img", img);
        request.setAttribute("title", title);
        request.setAttribute("detail", detail);
        
        String idAuthor = a.getUserName();
        String txt = PostService.getInstance().checkValidPost(title);
        if (txt == null) {
            PostService.getInstance().addNewPost(new Post(title, img, detail, idAuthor));
            request.setAttribute("successText", "Add Successfully!!!");
        } else {
            request.setAttribute("wrongText",txt);
        }
         request.getRequestDispatcher("views/marketing/Marketing-Post-AddNew.jsp").forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
