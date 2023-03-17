/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Expert;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import model.Account;
import model.Category;
import service.impl.CategoryService;
import utils.PageUtil;
import utils.SessionUtil;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/expert-category-management"})
public class ExpertManagmentCategory extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String search = req.getParameter("search");
        String indexS = req.getParameter("index");
        String nameClass = req.getParameter("nameClass");
        String mess = req.getParameter("mess");
        int index;
        try {
            index = Integer.parseInt(indexS);
        } catch (NumberFormatException e) {
            index = 1;
        }
        PageUtil p = new PageUtil();
        p.setNrpp(3);
        p.setIndex(index);
        p.setSearch(search);
        int numberProduct = CategoryService.getInstance().getNumberCateByPaging(p);
        p.setTotalPage(numberProduct);
        List<Category> listC = CategoryService.getInstance().getCateByPaging(p);
        req.setAttribute("totalPage", p.getTotalPage());
        req.setAttribute("index", p.getIndex());
        req.setAttribute("searchName", search);
        req.setAttribute("listC", listC);
        req.setAttribute("isManageCategory", true);
        req.setAttribute("nameClass", nameClass);
        req.setAttribute("mess", mess);
        req.setAttribute("totalP", numberProduct);
        req.getRequestDispatcher("views/expert/Expert-Category-Management.jsp").forward(req, resp);
    }
    
    
    
}
;