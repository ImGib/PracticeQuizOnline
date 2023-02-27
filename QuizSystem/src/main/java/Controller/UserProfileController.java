/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static com.sun.tools.doclint.Entity.part;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import model.Account;
import service.impl.AccountService;
import utils.SessionUtil;
import utils.UploadPathUtitl;

@MultipartConfig
@WebServlet(urlPatterns = {"/profile"})
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
            Part file = req.getPart("inputImg");
            String uploadPath = getServletContext().getRealPath("/asset/images/avatar/") + file.getSubmittedFileName();
            UploadPathUtitl.getInstance().uploadPath(file, uploadPath);
            System.out.println(uploadPath);
            acc.setImg(file.getSubmittedFileName());
        }

        AccountService.getInstance().updateProfile(acc);
        SessionUtil.getInstance().putValue(req, "account", acc);
        doGet(req, resp);
    }

}
