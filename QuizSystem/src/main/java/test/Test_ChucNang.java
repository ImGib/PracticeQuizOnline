/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dao.impl.AbstractDao;
import dao.impl.AccountDao;
import dao.impl.PostDao;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.*;
import model.Account;
import model.Post;
import model.Slide;
import org.bouncycastle.pqc.math.linearalgebra.RandUtils;
import service.impl.AccountService;
import service.impl.PostService;
import service.impl.SlideService;
import utils.DateUtil;
import utils.RandomAccountUtil;
import utils.RandomUtil;
import utils.SessionUtil;

/**
 *
 * @author asus
 */
public class Test_ChucNang {

    public static void main(String[] args) {
        PostDao postDao=new PostDao();
//        Post p=new Post(999, "title", "2023-01-01", "", "", "linhchi", 1);
        
        Post p = postDao.findPostById(5).get(0);
        System.out.println(p.getTittle());
        
    }
}
