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
import utils.SessionUtil;

@WebServlet(urlPatterns = {"/security"})
public class SecurityController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SessionUtil.getInstance().putValue(req, "crPage", "Security");

        req.getRequestDispatcher("views/UserSecurity.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Account acc = (Account) SessionUtil.getInstance().getValue(req, "account");
        String currentPassword = CheckUtil.MD5Encryption(req.getParameter("currentPassword"));
        String newPassword = CheckUtil.MD5Encryption(req.getParameter("newPassword"));
        String confirmPassword = CheckUtil.MD5Encryption(req.getParameter("confirmPassword"));
        String mess = AccountService.getInstance().userChangePassword(acc, currentPassword, newPassword, confirmPassword);
        if(mess == null){
            acc.setPassword(newPassword);
            SessionUtil.getInstance().putValue(req, "account", acc);
            mess = "Successfully";
        }
        req.setAttribute("changePassMess", mess);
        doGet(req, resp);
    }
    
    
}
