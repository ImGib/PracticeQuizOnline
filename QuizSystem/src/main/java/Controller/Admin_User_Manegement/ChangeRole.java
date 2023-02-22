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
@WebServlet(name="ChangeRole", urlPatterns={"/ChangeRole"})
public class ChangeRole extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String user=request.getParameter("user");
        int role=AccountService.getInstance().findAccountByUserName(user).get(0).getRole();
        request.setAttribute("role", role);
        request.setAttribute("user", user);
        request.getRequestDispatcher("views/ChangeRole.jsp").forward(request, response);
        
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String user=request.getParameter("user");
        int role=Integer.parseInt(request.getParameter("role"));
        AccountService.getInstance().changeRoleByUserName(user, role);
        
        request.setAttribute("role", role);
        request.setAttribute("successText", "Edit Successfull");
        request.getRequestDispatcher("views/ChangeRole.jsp").forward(request, response);
    }
    

}
