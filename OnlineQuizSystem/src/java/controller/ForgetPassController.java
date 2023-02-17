/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import service.impl.AccountService;

/**
 *
 * @author Lenovo
 */
public class ForgetPassController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/ForgetPassWord.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String mess = new AccountService().forgetPass(email);
        forgetPassDirect(mess, req, resp);
    }

    private void forgetPassDirect(String mess, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (mess == null) {
            mess = "Please check your mail to get change password link!";
        }
        req.setAttribute("mess", mess);
        doGet(req, resp);
    }

}
