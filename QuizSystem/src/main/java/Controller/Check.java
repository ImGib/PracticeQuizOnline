/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import dao.impl.AccountDao;
import dao.impl.QuestionDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import model.Account;
import utils.PageUtil;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/check"})
public class Check extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        int a = new QuestionDao().getNumberQuestionBySearchAndUserName(new PageUtil());
        req.setAttribute("name", a);
        req.getRequestDispatcher("views/Check.jsp").forward(req, resp);
    }
    
}
