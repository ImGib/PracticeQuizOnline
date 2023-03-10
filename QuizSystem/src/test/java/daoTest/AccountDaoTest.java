///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
// */
//package daoTest;
//
//import dao.impl.AccountDao;
//import model.Account;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import utils.CheckUtil;
//
///**
// *
// * @author Lenovo
// */
//public class AccountDaoTest {
//    
//    public AccountDaoTest() {
//    }
//
//    private final AccountDao accountDao = new AccountDao();
//    
//    @Test
//    public void testFindAccountByEmailAndPassWithTrueDataReturnWell(){
//        boolean expected = false;
//        boolean actual = accountDao.findAccountByEmailAndPass("dinhson1032001@gmail.com", CheckUtil.MD5Encryption("123")).isEmpty();
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testFindAccountByEmailAndPassWithWrongEmailReturnFalse(){
//        boolean expected = true;
//        boolean actual = accountDao.findAccountByEmailAndPass("ddinhson1032001@gmail.com", CheckUtil.MD5Encryption("123")).isEmpty();
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testFindAccountByEmailAndPassWithWrongPassReturnFalse(){
//        boolean expected = true;
//        boolean actual = accountDao.findAccountByEmailAndPass("dinhson1032001@gmail.com", "12345").isEmpty();
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testFindAccountByEmailWithTrueData(){
//        String expected = "dinhson1032001@gmail.com";
//        String actual = accountDao.findAccountByEmail("dinhson1032001@gmail.com").get(0).getGmail();
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testFindAccountByEmailWithWrongData(){
//        boolean expected =true;
//        boolean actual = accountDao.findAccountByEmail("dinhson11@gmail.com").isEmpty();
//        assertEquals(expected, actual);
//    }
//    
//    //@Test
//    public void testAddAccountWithTrueData(){
//        String email = "dinhson123@gmail.com";
//        String userName = "dinhson133323";
//        String pass = "123";
//        int role = 1;
//        accountDao.addAccount(new Account(userName, pass, email, role, true));
//        Account a = accountDao.findAccountByEmail(email).get(0);
//        
//        assertEquals(email, a.getGmail());
//        assertEquals(userName, a.getUserName());
//        assertEquals(pass, a.getPassword());
//        assertEquals(role, a.getRole());
//    }
//    
//    @Test
//    public void testAddAccountWithUserNameExist(){
//        String email = "dinhson123dfdf@gmail.com";
//        String userName = "dinson";
//        String pass = "123";
//        int role = 1;
//        accountDao.addAccount(new Account(userName, pass, email, role, true));
//        boolean expected = true;
//        boolean actual = accountDao.findAccountByEmail(email).isEmpty();
//        
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testFindAccountByUserNameWithUserNameExist(){
//        boolean expected = false;
//        boolean actual = accountDao.findAccountByUserName("dinson").isEmpty();
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testFindAccountByUserNameWithUserNameNotExist(){
//        boolean expected = false;
//        boolean actual = accountDao.findAccountByUserName("dindfdfhson123").isEmpty();
//        assertNotEquals(expected, actual);
//    }
//    
//    //@Test
//    public void testChangePassReturnWell(){
//        String newPass = "1234567";
//        String email = "dinhson123@gmail.com";
//        accountDao.changePass(email, newPass);
//        boolean expected = false;
//        boolean actual = accountDao.findAccountByEmailAndPass(email, newPass).isEmpty();
//        assertEquals(expected, actual);
//    }
//    
//}
