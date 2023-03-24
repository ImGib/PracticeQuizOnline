/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import model.Account;
import service.impl.AccountService;
import utils.CheckUtil;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/signup"})
public class SignUpController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/Register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String user = req.getParameter("user");
        String pass = CheckUtil.MD5Encryption(req.getParameter("pass"));
        String repass = CheckUtil.MD5Encryption(req.getParameter("repass"));
        Account a = new Account(user, pass, email, 1, true);
        String mess = AccountService.getInstance().addAccount(a, repass);
        signUpDiracter(mess, req, resp);
    }
    
    private void signUpDiracter(String mess,HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(mess == null){
            req.setAttribute("mess", "Create account success!");
            req.getRequestDispatcher("views/Login.jsp").forward(req, resp);
        }else{
            req.setAttribute("mess", mess);
            doGet(req, resp);
        }
        
    }
    
}
