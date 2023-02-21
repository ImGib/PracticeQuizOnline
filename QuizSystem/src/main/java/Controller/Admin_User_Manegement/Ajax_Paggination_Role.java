/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Controller.Admin_User_Manegement;

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
@WebServlet(name="Ajax_Paggination_Role", urlPatterns={"/Ajax_Paggination_Role"})
public class Ajax_Paggination_Role extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String txt=request.getParameter("txt");
        int role=Integer.parseInt(txt);
        List<Account> list= AccountService.getInstance().findAccountByRole(role);
        int totalPage=(list.size()+2-1)/2;
        
        out.print("<li class=\"page-item disabled\"><a href=\"LoadAdmin?txt=Search_Role_"+txt+"&pageIndex=0\">Previous</a></li>");
        for(int i=0;i<totalPage;i++){
            out.print("<li class=\"page-item");
            if(i==0)out.print("active");
            out.print("\"><a href=\"LoadAdmin?txt=Search_Role_"+txt+"&pageIndex="+(i+1)+"\" class=\"page-link\">"+(i+1)+"</a></li>");
        }
        out.print("<li class=\"page-item\"><a href=\"LoadAdmin?txt=Search_Role_"+txt+"&pageIndex=2\" class=\"page-link\">Next</a></li>");
    } 

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
