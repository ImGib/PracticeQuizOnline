/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller.Admin_User_Manegement;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Account;
import service.impl.AccountService;

/**
 *
 * @author asus
 */
@WebServlet(name = "AddNewAccount", urlPatterns = {"/AddNewAccount"})
public class AddNewAccount extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("views/AddNewAccount.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
//        String fname=request.getParameter("fname");
//        String lname=request.getParameter("lname");
        String email = request.getParameter("email");
        String add = request.getParameter("add");
        String phone = request.getParameter("phone");
        String role = request.getParameter("role");

        request.setAttribute("user", user);
        request.setAttribute("pass", pass);
//        request.setAttribute("fname",fname );
//        request.setAttribute("lname", lname);
        request.setAttribute("email", email);
        request.setAttribute("add", add);
        request.setAttribute("phone", phone);
        request.setAttribute("role", role);

        Account a = new Account(user, pass, "", "", email, phone, Integer.parseInt(role), add, true, "");
        String mess = AccountService.getInstance().checkValidateAddAccount(a);
        if (mess == null) {
            AccountService.getInstance().addAccount(a);
            request.setAttribute("successText", "Add Successful!!!");
        } else {
            request.setAttribute("WrongText", mess);
        }
        request.getRequestDispatcher("views/AddNewAccount.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
