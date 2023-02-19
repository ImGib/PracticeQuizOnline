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
import java.util.List;
import model.Account;
import service.impl.AccountService;

/**
 *
 * @author asus
 */
@WebServlet(name = "LoadAdmin", urlPatterns = {"/LoadAdmin"})
public class LoadAdmin extends HttpServlet {

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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            AccountService ad = new AccountService();
        String txt = "";
        try {
            txt=request.getParameter("txt");
        } catch (Exception e) {
        }
        List<Account> ListAccount = ad.SearchAccountByUserName_Name_Gmail_Phone("");
 //------------------------Phan Trang----------------------------------------------
        int size = ListAccount.size();
        int nrpp = 2;
        int totalPage = (size + nrpp - 1) / nrpp;
        int pageIndex = 1;
        try {
            pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
        } catch (Exception e) {
        }
        pageIndex = pageIndex > totalPage ? totalPage : pageIndex;
        pageIndex = pageIndex < 1 ? 1 : pageIndex;
        
        ListAccount=ad.LoadAccount_Pagination(txt, pageIndex, nrpp);
        
        request.setAttribute("nrpp", nrpp);
        request.setAttribute("size", size);
        request.setAttribute("txt",txt );
        request.setAttribute("pageIndex",pageIndex);
        request.setAttribute("totalPage", totalPage);
        request.setAttribute("ListAccount", ListAccount);
        request.getRequestDispatcher("views/admin_user_management.jsp").forward(request, response);
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        AccountService ad = new AccountService();
//        String txt = "";
//        txt= request.getParameter("txt");
//        List<Account> ListAccount = ad.SearchAccountByUserName_Name_Gmail_Phone(txt);
//        request.setAttribute("ListAccount", ListAccount);
//
//        request.getRequestDispatcher("views/admin_user_management.jsp").forward(request, response);
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
