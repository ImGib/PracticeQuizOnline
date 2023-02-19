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
import service.impl.AccountService;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/change-pass"})
public class ChangePassController extends HttpServlet{
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/ChangePass.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");
        String rePass = req.getParameter("repass");
        String code = req.getParameter("code");
        HttpSession session = req.getSession();
        String sessionCode = (String) session.getAttribute("forgetCode");
        int timeInput = (int) session.getAttribute("timeInput")+1;
        session.setAttribute("timeInput", timeInput);
        String mess = new AccountService().changePassWord(email, pass, rePass, code, sessionCode, timeInput);
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
