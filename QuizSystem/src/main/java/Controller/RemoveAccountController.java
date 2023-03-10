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

@WebServlet(urlPatterns = {"/user-delete-account"})
public class RemoveAccountController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/RemoveAccount.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Account acc = (Account) SessionUtil.getInstance().getValue(req, "account");
        String gmail = req.getParameter("email");
        String password = CheckUtil.MD5Encryption(req.getParameter("password"));
        if (AccountService.getInstance().removeAccount(acc, gmail, password) == null) {
            resp.sendRedirect("logout");
        } else {
            req.setAttribute("removeMess", "Wrong email or password");
            doGet(req, resp);
        }
    }
}
