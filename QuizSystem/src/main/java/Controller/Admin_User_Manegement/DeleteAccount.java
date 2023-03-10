/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Controller.Admin_User_Manegement;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.impl.AccountService;

/**
 *
 * @author asus
 */
@WebServlet(name="Delete_Account", urlPatterns={"/DeleteAccount"})
public class DeleteAccount extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String user=request.getParameter("user");
        request.setAttribute("user", user);
        request.getRequestDispatcher("/views/admin/Admin_DeleteAccount_App.jsp").forward(request, response);
    } 

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String user="";
        user=request.getParameter("user");
        AccountService.getInstance().deleteAccount(user);
        response.sendRedirect("/QuizSystem/Admin");
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
