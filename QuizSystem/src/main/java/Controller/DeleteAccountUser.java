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
import model.Account;
import service.impl.AccountService;
import utils.CheckUtil;
import utils.SessionUtil;

/**
 *
 * @author avici
 */
@WebServlet(name="DeleteAccountUser", urlPatterns={"/delete-user"})
public class DeleteAccountUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
       req.getRequestDispatcher("views/DeleteAccount.jsp").forward(req, resp);
    } 

  
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        String gmail= req.getParameter("gmail");
        String password= CheckUtil.MD5Encryption(req.getParameter("password"));
        HttpSession ses = req.getSession();
        Account a = (Account) ses.getAttribute("account");
    String b= AccountService.getInstance().deleteAccountUser(a, gmail, password);
       // resp.sendRedirect("login");
       directController(b, req, resp);
    }

    private void directController(String b, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (b == null) {
            //SessionUtil.getInstance().putValue(req, "account", a);
           // req.getRequestDispatcher("views/student/home.jsp").forward(req, resp);
           

            resp.sendRedirect("login");
        } else {
            
            req.setAttribute("mess", b);
            doGet(req, resp);
        }
    }
    

}
