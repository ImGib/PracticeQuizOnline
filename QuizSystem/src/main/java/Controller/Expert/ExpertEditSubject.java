/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.Expert;

import static Controller.Marketing.Post_Edit.img;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import java.io.IOException;
import java.util.List;
import model.Category;
import model.SubType;
import model.Subject;
import service.impl.CategoryService;
import service.impl.SubjectService;
import service.impl.SubjectTypeService;
import utils.UpImgToGGUntil;

/**
 *
 * @author Lenovo
 */
@MultipartConfig()
@WebServlet(urlPatterns = {"/expert-edit-subject"})
public class ExpertEditSubject extends HttpServlet{
    public static String img;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        Subject s = SubjectService.getInstance().getSubjectById(id);
        List<Category> listC = CategoryService.getInstance().getAllCate();
        List<SubType> listSubType = SubjectTypeService.getInstance().getListCategoryIdBtSubId(id);
        img=s.getImg();
        req.setAttribute("img", img);
        req.setAttribute("listS", listSubType);
        req.setAttribute("listC", listC);
        req.setAttribute("subject", s);
        req.getRequestDispatcher("views/expert/Expert-Edit-Subject.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("subName");
        String description = req.getParameter("description");
        Part file = req.getPart("img");
        String filename = file.getSubmittedFileName();
        if(!filename.isEmpty()){
            img=UpImgToGGUntil.makeLink(file, req);
        }
        String[] cateIds = req.getParameterValues("checkBox");
        Subject s = new Subject();
        s.setId(id);
        s.setDescription(description);
        s.setImg(img);
        s.setName(name);
        SubjectService.getInstance().editSubject(s);
        SubjectTypeService.getInstance().editSubType(id, cateIds);
        resp.sendRedirect("expert-subject-management?index=1&&search=");
    }
    
    
    
}
