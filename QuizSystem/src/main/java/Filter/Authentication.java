///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Filter;
//
//import java.io.IOException;
//import java.io.PrintStream;
//import java.io.PrintWriter;
//import java.io.StringWriter;
//import jakarta.servlet.Filter;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.FilterConfig;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.ServletRequest;
//import jakarta.servlet.ServletResponse;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//import model.Account;
//
//public class Authentication implements Filter{
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        Filter.super.init(filterConfig); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
//    }
//
//    @Override
//    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
//        HttpServletRequest req = (HttpServletRequest)sr;
//        HttpServletResponse res = (HttpServletResponse) sr1;
//        HttpSession ses = req.getSession();
//        Object obj = ses.getAttribute("account");
//        int role;
//        if (obj == null){
//            obj = 1;
//        } else {
//            Account acc = (Account) obj;
//            obj = acc.getRole();
//        }
//        String url = req.getRequestURI();
//        if(url.contains(".jsp")){
//            res.sendRedirect("home");
//        }
//        
//        role = (int) obj;
//        
//        switch (role) {
//            case 0:
//                
//                break;
//            case 2:
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            default:
//                throw new AssertionError();
//        }
//    }
//
//    @Override
//    public void destroy() {
//        Filter.super.destroy(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
//    }
//    
//}
