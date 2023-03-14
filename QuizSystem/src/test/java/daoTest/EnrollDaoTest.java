///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package daoTest;
//
//import dao.impl.EnrollDao;
//import java.util.List;
//import model.Enroll;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Gib
// */
//public class EnrollDaoTest {
//
//    public EnrollDaoTest() {
//
//    }
//
//    private EnrollDao enrollDao = new EnrollDao();
//
//    @Test
//    public void testgetNumberEnrollByIdSub() {
//        int expected = 4;
//        int actual = enrollDao.getNumberEnrollByIdSub(1);
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testCheckEnrollReturnTrue() {
//        boolean expected = false;
//        boolean actual = enrollDao.checkEnroll("maibui", 2).isEmpty();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testCheckEnrollReturnFalse() {
//        boolean expected = true;
//        boolean actual = enrollDao.checkEnroll("maibui", 5).isEmpty();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testInsertEnroll() {
//        String username = "maibui";
//        int id = 6;
//        enrollDao.insertEnroll(username, 6);
//        
//        List<Enroll> es = enrollDao.checkEnroll(username, id);
//        if(es.isEmpty() || es == null)
//            assertEquals(1, 0);
//        assertEquals(username, es.get(0).getUserName());
//        assertEquals(id, es.get(0).getIdSub());
//    }
//}
