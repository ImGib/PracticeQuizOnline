///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package serviceTest;
//
//import dao.impl.PostDao;
//import model.Post;
//import static org.junit.Assert.*;
//import org.junit.Test;
//import service.impl.PostService;
///**
// *
// * @author asus
// */
//public class PostServiceTest {
//    PostDao postDao=new PostDao();
//    Post p=new Post(999, "title", "2023-01-01", "", "", "linhchi", 1);
//    
//    @Test 
//    public void checkValidPostForEdit_TestTitleValid(){
//        postDao.addNewPost(p);
//        String actual= PostService.getInstance().checkValidPostForEdit(postDao.getLastIdPost(), p.getTittle());
//        postDao.deletePost(postDao.getLastIdPost());
//        assertNotNull(actual);
//    }
//    
//    @Test 
//    public void checkValidPostForEdit_TestTrueCase(){
//        postDao.addNewPost(p);
//        String actual= PostService.getInstance().checkValidPostForEdit(postDao.getLastIdPost(), "wqwer");
//        postDao.deletePost(postDao.getLastIdPost());
//        assertNull(actual);
//    }
//}
