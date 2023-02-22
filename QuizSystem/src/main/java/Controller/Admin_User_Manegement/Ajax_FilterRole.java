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
@WebServlet(name="Ajax_FilterRole", urlPatterns={"/Ajax_FilterRole"})
public class Ajax_FilterRole extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int role=Integer.parseInt(request.getParameter("txt"));
        List<Account> list= AccountService.getInstance().loadAccount_PaginationByRole(role, 1, 2);
        
        for (Account o : list) {
            
        
        out.print(" <tr>\n" +
"                                            <td>"+o.getUserName()+"</td>\n" +
"                                            <td>"+o.getGmail()+"</td>\n");
        
                                           if(o.getRole() == 0)out.print("<td>Admin</td>");
                                           if(o.getRole() == 1)out.print("<td>Student</td>");
                                           if(o.getRole() == 2)out.print("<td>Expert</td>");
                                           if(o.getRole() == 3)out.print("<td>Market</td>");
                                           if(o.getRole() == 4)out.print("<td>Sale</td>");

               out.print("<td><span class=\"status text-success\">&bull;</span> Active</td>\n");
               
                                        if(o.getRole() != 0){
                                            out.print(
"                                                <td>\n" +
"                                                    <a href=\"ChangeRole?user="+o.getUserName()+"\" class=\"settings\" title=\"Edit\" data-toggle=\"tooltip\"><i\n" +
"                                                            class=\"material-icons\">&#xE8B8;</i></a>\n" +
"                                                    <a href=\"DeleteAccount?user="+o.getUserName()+"\" class=\"delete\" title=\"Ban\" data-toggle=\"tooltip\"><i\n" +
"                                                            class=\"material-icons\">&#xE5C9;</i></a>\n" +
"                                                </td>\n");}

                                            out.print("</tr>");}
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
