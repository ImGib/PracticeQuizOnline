/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import service.impl.AccountService;

/**
 *
 * @author avici
 */
@WebServlet(name="ChangePassUser", urlPatterns={"/ChangePassUser"})
public class ChangePassUser extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/ChangePassUser.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");
        String rePass = req.getParameter("repass");
       
        String mess = AccountService.getInstance().changePassWordUser(email, pass, rePass);
        directController(mess,email, req, resp);
    }
    
    private void directController(String mess, String email, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        if(mess == null){
            req.setAttribute("mess", "Your password is changed. Please login again!");
            req.getRequestDispatcher("views/Login.jsp").forward(req, resp);
        }
        else{
            req.setAttribute("email", email);
            req.setAttribute("mess", mess);
            doGet(req, resp);
        }
    }
}

