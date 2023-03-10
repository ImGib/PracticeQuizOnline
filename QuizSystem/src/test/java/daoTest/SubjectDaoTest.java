///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package daoTest;
//
//import dao.impl.SubjectDAO;
//import org.junit.Test;
//import static org.junit.Assert.*;
///**
// *
// * @author Gib
// */
//public class SubjectDaoTest {
//    
//    public SubjectDaoTest(){}
//    
//    private SubjectDAO subjectDao = new SubjectDAO();
//    
//    @Test
//    public void subjectPagintionTest(){
//        int expected = 6;
//        int actual = subjectDao.subjectPagintion("", 1, 9).size();
//        assertEquals(expected, actual);
//    }
//    @Test
//    public void getTopThreeTest(){
//        int expected = 3;
//        int actual = subjectDao.getTopThree().size();
//        assertEquals(expected, actual);
//    }
//    
//}
