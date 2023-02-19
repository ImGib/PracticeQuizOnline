/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller.Admin_User_Manegement;

import dao.impl.AccountDao;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "EditAccount", urlPatterns = {"/EditAccount"})
public class EditAccount extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("user");
        AccountService ad = new AccountService();
        Account a = ad.findAccountByUserName(user).get(0);
        String pass = a.getPassword();
        String fname = a.getFirstName();
        String lname = a.getLastName();
        String email = a.getGmail();
        String add = a.getAddress();
        String phone = a.getPhone();
        String img=a.getImg();
        int role = a.getRole();

        request.setAttribute("user", user);
        request.setAttribute("pass", pass);
        request.setAttribute("fname", fname);
        request.setAttribute("lname", lname);
        request.setAttribute("email", email);
        request.setAttribute("add", add);
        request.setAttribute("phone", phone);
        request.setAttribute("role", role);
        request.setAttribute("img", img);
        
        request.getRequestDispatcher("views/EditAccount.jsp").forward(request, response);
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        AccountDao ad = new AccountDao();
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String fname=request.getParameter("fname");
        String lname=request.getParameter("lname");
        String email = request.getParameter("email");
        String add = request.getParameter("add");
        String phone = request.getParameter("phone");
        String role = request.getParameter("role");
        String img=request.getParameter("img");

        request.setAttribute("user", user);
        request.setAttribute("pass", pass);
        request.setAttribute("fname", fname);
        request.setAttribute("lname", lname);
        request.setAttribute("email", email);
        request.setAttribute("add", add);
        request.setAttribute("phone", phone);
        request.setAttribute("role", role);
        request.setAttribute("img", img);
        
        if (!ad.findAccountByEmail(email).isEmpty()) {
            request.setAttribute("wrongText", "This Email already exist!!!");
            request.getRequestDispatcher("views/EditAccount.jsp").forward(request, response);
        }
        
        ad.EditAccount(new Account(user, pass, fname, lname, email, phone, Integer.parseInt(role), add, true, img));

        processRequest(request, response);
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
