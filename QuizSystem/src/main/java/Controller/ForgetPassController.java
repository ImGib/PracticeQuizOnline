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
import java.io.UnsupportedEncodingException;
import javax.mail.MessagingException;
import service.impl.AccountService;
import utils.CheckUtil;
import utils.EmailUtil;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/forget-password"})
public class ForgetPassController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/ForgetPassWord.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String mess = AccountService.getInstance().forgetPass(email);
        forgetPassDirect(mess, email, req, resp);
    }

    private void forgetPassDirect(String mess,String email, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, UnsupportedEncodingException{
        if (mess == null) {
            try {
                int code = new CheckUtil().createCheckCode();
                HttpSession session = req.getSession();
                String ssCode = code + "";
                session.setAttribute("forgetCode", ssCode);
                session.setAttribute("timeInput", 0);
                mess = "This is your verify code: " + code;
                new EmailUtil().sendMail(email, "verify code", mess);
                req.setAttribute("email", email);
                req.getRequestDispatcher("views/ChangePass.jsp").forward(req, resp);
            } catch (UnsupportedEncodingException | MessagingException e) {
                mess = e.getMessage();
            }
        }
        req.setAttribute("mess", mess);
        doGet(req, resp);
    }
    
}
