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
import model.UserGoogleDto;
import service.impl.AccountService;
import utils.LoginGoogleUtil;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/login-google"})
public class LoginGoogleController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String code = req.getParameter("code");
        LoginGoogleUtil util = new LoginGoogleUtil();
        String accessToken = util.getToken(code);
        UserGoogleDto user = util.getUserInfo(accessToken);
        AccountService accountService = new AccountService();
        Account a = accountService.loginWithEmail(user);
        HttpSession session = req.getSession();
        session.setAttribute("account", a);
        
        //chuyen huong trang home
        req.setAttribute("name", user.getEmail());
        req.getRequestDispatcher("views/Check.jsp").forward(req, resp);
    }
    
    
}
