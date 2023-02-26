/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import com.google.gson.Gson;
import dao.impl.AccountDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.Post;
import model.Slide;
import service.impl.AccountService;
import service.impl.PostService;
import service.impl.SlideService;
import utils.SessionUtil;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/hello"})
public class HiContoller extends HttpServlet{
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
           
    } 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Slide s = SlideService.getInstance().findSlideById(id).get(0);
        String img = s.getImg();
        String hlink = s.getHyperlink();

        req.setAttribute("id", id);
        req.setAttribute("img", img);
        req.setAttribute("hlink", hlink);
           req.getRequestDispatcher("views/Check.jsp").forward(req, resp);
            
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String img = req.getParameter("img");
        String hlink = req.getParameter("hlink");
        SlideService.getInstance().editSlide(id, img, hlink);
        
    }
    
}
