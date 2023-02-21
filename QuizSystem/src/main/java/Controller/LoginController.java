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
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import model.Account;
import service.impl.AccountService;
import utils.CheckUtil;
import utils.SessionUtil;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/login"})
public class LoginController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/Login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String pass = CheckUtil.MD5Encryption(req.getParameter("pass"));
        Account a = AccountService.getInstance().findAccountByEmailAndPass(email, pass);
        directController(a, req, resp);
    }

    private void directController(Account a, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (a != null) {
            SessionUtil.getInstance().putValue(req, "account", a);
            req.getRequestDispatcher("views/Check.jsp").forward(req, resp);
        } else {
            req.setAttribute("mess", "Wrong email or password!");
            doGet(req, resp);
        }
    }
    
}
