/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import model.Account;
import service.impl.AccountService;
import sun.awt.KeyboardFocusManagerPeerImpl;
import utils.SessionUtil;
import utils.UpFileToDriveUtil;
import utils.UpImgToGGUntil;
import utils.UploadPathUtitl;

@MultipartConfig()
@WebServlet(urlPatterns = {"/profile", "/admin-infor", "/expert-infor", "/marketing-infor"})
public class UserProfileController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SessionUtil.getInstance().putValue(req, "crPage", "Profile");

        req.getRequestDispatcher("views/UserProfile.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Account acc = (Account) SessionUtil.getInstance().getValue(req, "account");
        if (req.getParameter("inputPhone") != null) {
            acc.setPhone(req.getParameter("inputPhone"));
        }
        System.out.println(req.getParameter("inputPhone"));
        if (req.getParameter("inputFirstName") != null) {
            acc.setFirstName(req.getParameter("inputFirstName"));
        }

        if (req.getParameter("inputLastName") != null) {
            acc.setLastName(req.getParameter("inputLastName"));
        }

        if (req.getParameter("inputLocation") != null) {
            acc.setAddress(req.getParameter("inputLocation"));
        }

        if (req.getParameter("inputEmailAddress") != null) {
            acc.setGmail(req.getParameter("inputEmailAddress"));
        }

        if (req.getPart("inputImg") != null) {

//            System.out.println(filename);
//            
//            String realpath = req.getServletContext().getRealPath("");
//            realpath = realpath.replace("target\\QuizSystem-1.0\\", "src\\main\\webapp\\images\\avt\\");
//            
//            File theDir = new File(realpath);
//            if (!theDir.exists()) {
//                theDir.mkdirs();
//            }
//            
//            UploadPathUtitl.getInstance().uploadPath(file, realpath + "/" + filename);
//            
////            System.out.println(realpath);
//            acc.setImg(filename);
//            src\main\webapp\asset\images\avatar
            Part file = req.getPart("inputImg");
            acc.setImg(UpImgToGGUntil.makeLink(file, req));
        }
        System.out.println(acc.getUserName());
        AccountService.getInstance().updateProfile(acc);
        SessionUtil.getInstance().putValue(req, "account", acc);
        doGet(req, resp);
    }
}
