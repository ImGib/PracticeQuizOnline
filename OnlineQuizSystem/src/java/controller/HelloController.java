/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.impl.AccountDao;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import model.Account;
import service.impl.AccountService;

/**
 *
 * @author Lenovo
 */
public class HelloController extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
//        Account a = new Account();
//        a.setGmail("dinhson123@gmail.com");
//        a.setUserName("kevin");
//        a.setPassword("12345");
//        
//        aService.addAccount(a);
        
        List<Account> list = new AccountDao().findAccountByEmail("sonndhe160021@fpt.edu.vn");
        request.setAttribute("name", list.get(0).getFirstName());
        request.getRequestDispatcher("views/Home.jsp").forward(request, response);
    }


}
