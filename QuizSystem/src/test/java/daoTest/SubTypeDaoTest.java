///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
// */
//package daoTest;
//
//import dao.impl.SubjectTypeDao;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
///**
// *
// * @author Lenovo
// */
//public class SubTypeDaoTest {
//    
//    public SubTypeDaoTest() {
//    }
//    
//    private SubjectTypeDao s = new SubjectTypeDao();
//    
//   // @Test
//    public void testAddNewSubTpeWithTrue(){
//        int idS = 5;
//        int idC = 6;
//        boolean expected = true;
//        boolean actual = s.addNewSubType(idS, idC) != -1;
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testAddNewSubTpeWithExist(){
//        int idS = 5;
//        int idC = 1;
//        boolean expected = false;
//        boolean actual = s.addNewSubType(idS, idC) != -1;
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testGetListCategoryIdBySubIdWithTrue(){
//        String idS = "5";
//        boolean expected = false;
//        boolean actual = s.getListCategoryIdBySubId(idS).isEmpty();
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testGetListCategoryIdBySubIdWithIdSubNotExist(){
//        String idS = "5333";
//        boolean expected = true;
//        boolean actual = s.getListCategoryIdBySubId(idS).isEmpty();
//        assertEquals(expected, actual);
//    }
//}
