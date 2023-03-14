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
import service.impl.CategoryService;
import service.impl.SubjectTypeService;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/expert-delete-category"})
public class ExpertDeleteCategory extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        SubjectTypeService.getInstance().deleteByIdCate(id);
        CategoryService.getInstance().delete(id);
        resp.sendRedirect("expert-category-management?index=1&&search=");
    }
    
}
