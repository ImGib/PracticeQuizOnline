/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller.Marketing;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Account;
import model.Slide;
import service.impl.AccountService;
import service.impl.SlideService;
import utils.SessionUtil;

/**
 *
 * @author asus
 */
@WebServlet(name = "Slide_Add", urlPatterns = {"/marketing-editslide"})
public class Slide_Edit extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

//        int flag = 2;
        int id = Integer.parseInt(req.getParameter("id"));
        Slide s = SlideService.getInstance().findSlideById(id).get(0);
        String img = s.getImg();
        String hlink = s.getHyperlink();

        req.setAttribute("id", id);
        req.setAttribute("img", img);
        req.setAttribute("hlink", hlink);
//        req.setAttribute("flag", flag);

        req.getRequestDispatcher("views/marketing/Marketing-Slide-Edit.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        String img = req.getParameter("img");
        String hlink = req.getParameter("hlink");
        int id = Integer.parseInt(req.getParameter("id"));
        req.setAttribute("img", img);
        req.setAttribute("hlink", hlink);
        req.setAttribute("id", id);
        
        SlideService.getInstance().editSlide(id, img, hlink);
        req.setAttribute("successText", "Edit Successfull!!!");
        req.getRequestDispatcher("views/marketing/Marketing-Slide-Edit.jsp").forward(req, resp);
    }

}
