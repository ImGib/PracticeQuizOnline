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
import service.impl.AccountService;
import service.impl.PostService;

/**
 *
 * @author Lenovo
 */
@WebServlet(urlPatterns = {"/hello"})
public class HiContoller extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<String> data = new ArrayList<>();
        data.add("Viet nam");        
        data.add("Viet nam2");
        data.add("Viet nam3");
        data.add("Viet nam4");
        data.add("Viet nam5");
        data.add("Viet nam6");

        String json = new Gson().toJson(data);       

        req.setAttribute("values", json);
        req.getRequestDispatcher("views/student/home.jsp").forward(req, resp);

    }
}
