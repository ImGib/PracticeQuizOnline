///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package AccountService_Test;
//
//import dao.impl.AccountDao;
//import model.Account;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import utils.RandomAccountUtil;
//import service.impl.AccountService;
//
///**
// *
// * @author asus
// */
//public class AccountService_Test {
//
//    Account account = new Account("Test123", "Test123", "Test123", "Test123", "Test123", "Test123", 1, "Test123", true, "Test123");
//    AccountDao accountDao = new AccountDao();
//    
//
//    @Test
//    public void test_checkValidateAddAccount_UserExist() {
//        
//        AccountService.getInstance().addAccountByAdmin(account);
//        String expected = "This User already exist!!!";
//        String actual = AccountService.getInstance().checkValidateAddAccount(account);
//        AccountService.getInstance().deleteAccountForever(account.getUserName());
//        assertEquals(expected, actual);
//    }
//
////    @Test
////    public void test_checkValidateAddAccount_EmailExist() {
////        
////        accountDao.addAccountByAdmin(account);
////        account.setUserName("test");
////        String expected = "This Email already exist!!!";
////        String actual = accountService.checkValidateAddAccount(account);
////        accountService.deleteAccountForever(account.getUserName());
////        assertEquals(expected, actual);
////    }
////
////    @Test
////    public void test_checkValidateAddAccount_PhoneExist() {
////        
////        accountDao.addAccountByAdmin(account);
////        account.setUserName("test");
////        account.setGmail("test");
////        String expected = "This Phone already exist!!!";
////        String actual = accountService.checkValidateAddAccount(account);
////        accountService.deleteAccountForever(account.getUserName());
////        assertEquals(expected, actual);
////    }
////
////    @Test
////    public void test_checkValidateAddAccount_TrueCase() {
////        
////        accountDao.addAccountByAdmin(account);
////        account.setUserName("test");
////        account.setGmail("test");
////        account.setPhone("test");
////        String actual = accountService.checkValidateAddAccount(account);
////        accountService.deleteAccountForever(account.getUserName());
////        assertTrue(actual == null);
////    }
//
//}
