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
import model.Category;
import service.impl.CategoryService;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/expert-update-cate"})
public class ExpertUpdateCateGory extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String id = req.getParameter("id");
        List<Category> list = CategoryService.getInstance().getCateByCateName(name);
        if (list.isEmpty()) {
            CategoryService.getInstance().updateCate(id, name);
            resp.sendRedirect("expert-category-management?index=1&&search=");
        }
        else{
            resp.sendRedirect("expert-category-management?index=1&&search=&&nameClass=alert alert-warning&&mess=Category is already exist!!!");
        }
    }
    
}
