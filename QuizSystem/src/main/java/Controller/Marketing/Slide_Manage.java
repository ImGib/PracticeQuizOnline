/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Controller.Marketing;

import static Controller.Marketing.Post_Edit.img;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.util.List;
import model.Account;
import model.Slide;
import service.impl.AccountService;
import service.impl.PostService;
import service.impl.SlideService;
import utils.PagginationUtil;
import utils.SessionUtil;
import utils.UpImgToGGUntil;

/**
 *
 * @author asus
 */
@MultipartConfig()
@WebServlet(name="SlideManage", urlPatterns={"/marketing-slide"})
public class Slide_Manage extends HttpServlet {
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        
    } 

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        
        
        //flag =1 show add popup modal
        //flag =2 show edit popup modal
        //flag =3 show delete popup modal
        List<Slide> list=SlideService.getInstance().findAllSlide();
        //------------------------Phan Trang----------------------------------------------
        int size = list.size(); 
        int pageIndex=1;
        try {
            pageIndex = Integer.parseInt(req.getParameter("pageIndex"));
        } catch (NumberFormatException e) {
        }
        pageIndex= PagginationUtil.getInstance().pageIndex(pageIndex, size);
        list=SlideService.getInstance().loadSlidePagination(pageIndex, PagginationUtil.getInstance().getNrpp());
 //-----------------------------------------------------------------------------------       
        req.setAttribute("totalPage", PagginationUtil.getInstance().getTotalPage());
        req.setAttribute("size", size);
        req.setAttribute("pageIndex",pageIndex);
        req.setAttribute("list", list);
        req.getRequestDispatcher("views/marketing/Marketing-Slide-Management.jsp").forward(req, resp);
    } 
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
        String txt=req.getParameter("txt");
        if(txt=="add"){
            add(req, resp);
        }
        String id=req.getParameter("id");
        add(req, resp);
    }
    
    protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int flag=1;
//        SessionUtil.getInstance().putValue(req, "account", AccountService.getInstance()
//                .findAccountByRole(1).get(0));
        Account a = (Account) SessionUtil.getInstance().getValue(req, "account");
        Part file = req.getPart("img");
        String filename = file.getSubmittedFileName();
        String img="";
        if(!filename.isEmpty()){
           img=UpImgToGGUntil.makeLink(file, req);
        }
        String hlink=req.getParameter("hlink");
        SlideService.getInstance().addSlide(new Slide(img, hlink, a.getUserName()));
        
        req.setAttribute("img", img);
        req.setAttribute("hlink", hlink);
        req.setAttribute("flag", flag);
        req.setAttribute("successText", "Add Successfull!!!");
        doGet(req, resp);
    }

}
