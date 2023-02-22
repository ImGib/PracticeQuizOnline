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
import utils.PagginationUtil;

/**
 *
 * @author asus
 */
@WebServlet(name = "Admin", urlPatterns = {"/Admin"})
public class Admin extends HttpServlet {

   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        String txt = "";
        txt=request.getParameter("txt");
        if(txt==null)txt="";
        List<Account> ListAccount = AccountService.getInstance().searchAccountByUserName_Name_Gmail_Phone(txt);
 //------------------------Phan Trang----------------------------------------------
        int size = ListAccount.size(); 
        int pageIndex=1;
        try {
            pageIndex = Integer.parseInt(request.getParameter("pageIndex"));
        } catch (NumberFormatException e) {
        }
        pageIndex= PagginationUtil.getInstance().pageIndex(pageIndex, size);
        ListAccount=AccountService.getInstance().loadAccount_Pagination(txt, pageIndex, PagginationUtil.getInstance().getNrpp());
 //-----------------------------------------------------------------------------------       
        request.setAttribute("totalPage", PagginationUtil.getInstance().getTotalPage());
        request.setAttribute("size", size);
        request.setAttribute("txt",txt );
        request.setAttribute("pageIndex",pageIndex);
        request.setAttribute("ListAccount", ListAccount);
        request.getRequestDispatcher("views/admin_user_management.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

   
}
