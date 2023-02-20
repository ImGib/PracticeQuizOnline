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
@WebServlet(name="Ajax_Paggination", urlPatterns={"/Ajax_Paggination_Search"})
public class Ajax_Paggination_Search extends HttpServlet {
   
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String txt=request.getParameter("txt");
        List<Account> list= AccountService.getInstance().searchAccountByUserName_Name_Gmail_Phone(txt);
        int totalPage=(list.size()+2-1)/2;
        
        out.print("<li class=\"page-item disabled\"><a href=\"LoadAdmin?txt="+txt+"&pageIndex=0\">Previous</a></li>");
        for(int i=0;i<totalPage;i++){
            out.print("<li class=\"page-item");
            if(i==0)out.print("active");
            out.print("\"><a href=\"LoadAdmin?txt="+txt+"&pageIndex="+(i+1)+"\" class=\"page-link\">"+(i+1)+"</a></li>");
        }
        out.print("<li class=\"page-item\"><a href=\"LoadAdmin?txt="+txt+"&pageIndex=2\" class=\"page-link\">Next</a></li>");
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
