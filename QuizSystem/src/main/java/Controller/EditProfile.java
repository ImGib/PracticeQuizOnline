

package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import model.Account;
import service.impl.AccountService;


/**
 *
 * @author avici
 */

@WebServlet(name = "EditProfile", urlPatterns = {"/edit-profile"})
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
        String mess = accountService.editProfile1(firstName, lastName, gmail, phone, address, img, userName);
        EditProfileDiracter(mess, req, resp);
    }

    private void EditProfileDiracter(String mess, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (mess == null) {
            req.setAttribute("mess", "Update Profile seccess!");
            req.getRequestDispatcher("views/student/home.jsp").forward(req, resp);
        } else {
            req.setAttribute("mess", mess);
            doGet(req, resp);
        }

    }

@Override
public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}



///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
// */
//package Controller;
////
////import java.io.IOException;
////import java.io.PrintWriter;
////import jakarta.servlet.ServletException;
////import jakarta.servlet.annotation.WebServlet;
////import jakarta.servlet.http.HttpServlet;
////import jakarta.servlet.http.HttpServletRequest;
////import jakarta.servlet.http.HttpServletResponse;
////import jakarta.servlet.http.HttpSession;
////import model.Account;
////import service.impl.AccountService;
//
///**
// *
// * @author avici
// */
//
//import dao.impl.AccountDao;
//import dao.impl.DaoImg;
////import jakarta.servlet.ServletContext;
//import jakarta.servlet.annotation.MultipartConfig;
//import java.io.File;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
////import jakarta.servlet.ServletContext;
////import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.MultipartConfig;
//import jakarta.servlet.annotation.WebServlet;
////import jakarta.servlet.http.HttpServlet;
////import jakarta.servlet.http.HttpServletResponse;
////import jakarta.servlet.http.HttpServletRequest;
////import jakarta.servlet.http.HttpServletRequest;
////import javax.servlet.http.HttpServletRequest;
////import jakarta.servlet.http.HttpServletResponse;
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import model.Account;
//import org.apache.commons.fileupload.FileItem;
//import org.apache.commons.fileupload.FileUploadException;
//import org.apache.commons.fileupload.disk.DiskFileItemFactory;
//import org.apache.commons.fileupload.servlet.ServletFileUpload;
//
////@WebServlet(urlPatterns = {"/edit-profile"})
//@MultipartConfig()
//public class EditProfile extends HttpServlet {
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//           AccountDao accountdao = new AccountDao();
//        DaoImg dao= new DaoImg();
//      String userName = request.getParameter("userName");
//      String firstName = request.getParameter("firstName");
//      String lastName = request.getParameter("lastName");
//      String gmail = request.getParameter("gmail");
//      String phone = request.getParameter("phone");
//       String address = request.getParameter("address");
//      
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        Account currAcc = (Account) request.getSession().getAttribute("account");
//      
//        String filename = null;
//        boolean isUpload = true;
//        try {
//            // Create a factory for disk-based file items
//            DiskFileItemFactory factory = new DiskFileItemFactory();
//            ServletContext servletContext = this.getServletConfig().getServletContext();
//            File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
//            factory.setRepository(repository);
//            ServletFileUpload upload = new ServletFileUpload(factory);
//            
//            // Check that we have a file upload request
//
//            List<FileItem> items = upload.parseRequest(request);
//            
//            Iterator<FileItem> iter = items.iterator();
//            HashMap<String, String> fields = new HashMap<>();
//
//            while (iter.hasNext()) {
//                FileItem item = iter.next();
//                if (item.getName().isEmpty()) {
//                    isUpload = false;
//                    break;
//                }
//                if (item.isFormField()) {
//                    fields.put(item.getFieldName(), item.getString());
//                    String name = item.getFieldName();
//                    String value = item.getString();
//                    System.out.println(name + " " + value);
//                } else {
//                    filename = "u_" + currAcc.getUserName() + "_" + item.getName();
//                    if (filename == null || filename.equals("")) {
//                        break;
//                    } else {
//                        Path path = Paths.get(filename);
//                        String storePath = servletContext.getRealPath("/upload");
//                        File uploadFile = new File(storePath + "/" + path.getFileName());
//                        if (uploadFile.canRead()) {
//                            uploadFile.delete();
//                        }
//                        item.write(uploadFile);
//                    }
//                    out.println(filename);
//                }
//            }
//        } catch (FileUploadException ex) {
//            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (Exception ex) {
//            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        if (isUpload == true) {
//            currAcc.setImg(filename);
//            dao.updateImg(currAcc.getUserName(),filename );
//        }
//accountdao.editAccount1(firstName, lastName, gmail, phone, address, gmail, userName);
//        response.sendRedirect("views/Check.jsp");
//        
//    }
//  
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//         processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//    
//    
//    
//    
//}
////
////    @Override
////    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
////            throws ServletException, IOException {
////        req.getRequestDispatcher("views/EditProfile.jsp").forward(req, resp);
////    }
////
////    
////    @Override
////    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
////            throws ServletException, IOException {
////        String userName = req.getParameter("userName");
////        String firstName = req.getParameter("firstName");
////        String lastName = req.getParameter("lastName");
////        String phone = req.getParameter("phone");
////        String address = req.getParameter("address");
////        String img = req.getParameter("img");
////        String gmail = req.getParameter("gmail");
////        HttpSession ses = req.getSession();
////        Account a = (Account) ses.getAttribute("account");
////        AccountService accountService = new AccountService();
////        String mess = accountService.editProfile(userName, firstName, lastName, gmail, phone, address, img);
////        EditProfileDiracter(mess,req,resp);
////    }
//
////   
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
////}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

