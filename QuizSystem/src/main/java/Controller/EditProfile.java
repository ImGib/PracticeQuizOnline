///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
// */
//package Controller;
//
//import dao.impl.AccountDao;
//import java.io.IOException;
//import java.io.PrintWriter;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.MultipartConfig;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//import java.io.File;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import model.Account;
//import service.impl.AccountService;
//
///**
// *
// * @author avici
// */
//@MultipartConfig()
//@WebServlet(urlPatterns = {"/edit-profile"})
//public class EditProfile extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//            throws ServletException, IOException {
//        req.getRequestDispatcher("views/EditProfile.jsp").forward(req, resp);
//    }
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
////        String userName = req.getParameter("userName");
////        String firstName = req.getParameter("firstName");
////        String lastName = req.getParameter("lastName");
////        String phone = req.getParameter("phone");
////        String address = req.getParameter("address");
////        String img = req.getParameter("img");
////        String gmail = req.getParameter("gmail");
//         AccountDao d = new AccountDao();
//      
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        Account currAcc = (Account) request.getSession().getAttribute("account");
//        AccountService accountService = new AccountService();
//          String filename = null;
//        boolean isUpload = true;
//        try {
//            // Create a factory for disk-based file items
//            DiskFileItemFactory factory = new DiskFileItemFactory();
//            ServletContext servletContext = this.getServletConfig().getServletContext();
//            File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
//            factory.setRepository(repository);
//            ServletFileUpload upload = new ServletFileUpload(factory);
//            List<FileItem> items = upload.parseRequest(request);
//            Iterator<FileItem> iter = items.iterator();
//            HashMap<String, String> fields = new HashMap<>();
//
//    }
//
// 
////    private void EditProfileDiracter(String mess, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////        if (mess == null) {
////            req.setAttribute("mess", "Update Profile seccess!");
////            req.getRequestDispatcher("views/Home.jsp").forward(req, resp);
////        } else {
////            req.setAttribute("mess", mess);
////            doGet(req, resp);
////        }
////
////    }
////
//}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Account;
import service.impl.AccountService;


@WebServlet(urlPatterns = {"/edit-profile"})
public class EditProfile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.getRequestDispatcher("views/EditProfile.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        String img = req.getParameter("img");
        String gmail = req.getParameter("gmail");
        HttpSession ses = req.getSession();
        Account a = (Account) ses.getAttribute("account");
        AccountService accountService = new AccountService();
        String mess = accountService.editProfile(userName, firstName, lastName, gmail, phone, address, img);
        EditProfileDiracter(mess,req,resp);
    }
  
    private void EditProfileDiracter(String mess, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (mess == null) {
            req.setAttribute("mess", "Update Profile seccess!");
            req.getRequestDispatcher("views/Home.jsp").forward(req, resp);
        } else {
            req.setAttribute("mess", mess);
            doGet(req, resp);
        }

    }

}