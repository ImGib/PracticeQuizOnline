//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
// */
//package AccountDao_Test;
//
//import dao.impl.AccountDao;
//import java.util.Random;
//import model.Account;
//import org.junit.After;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import service.impl.AccountService;
//import utils.RandomAccountUtil;
//import utils.RandomUtil;
//
///**
// *
// * @author asus
// */
//public class AccountDao_Test {
//    AccountDao accountDao=new AccountDao();
//    Account account=RandomAccountUtil.getAccount();
//    
//    RandomUtil RandomUtil = new RandomUtil();
//    
//   
//   
//   @Test
//   public void test_searchAccountByUserName_Name_Gmail_PhoneTrueCase(){
//       String expected="@#$%^";
//       account.setUserName(expected);
//       AccountService.getInstance().addAccountByAdmin(account);
//       
//       String actual=accountDao.searchAccountByUserName_Name_Gmail_Phone(expected).get(0).getUserName();
//       accountDao.deleteAccountForever(account.getUserName());
//       assertEquals(expected,actual);
//   }
//   @Test
//   public void test_searchAccountByUserName_Name_Gmail_PhoneWrongCase(){
//       String data="@@@@@@@@@";
//       int expected=0;
//       
//       int actual=accountDao.searchAccountByUserName_Name_Gmail_Phone(data).size();
//       assertEquals(expected,actual);
//   }
//   @Test
//   public void test_changeRoleByUserName(){
//       account.setRole(1);
//       int expected=2;
//       AccountService.getInstance().addAccountByAdmin(account);
//       
//       accountDao.changeRoleByUserName(account.getUserName(), expected);
//       int actual=accountDao.findAccountByUserName(account.getUserName()).get(0).getRole();
//       accountDao.deleteAccountForever(account.getUserName());
//       assertEquals(expected,actual);
//   }
//  
//   @Test
//   public void test_deleteAccount(){
//       
//       account.setIsActive(true);
//       
//       AccountService.getInstance().addAccountByAdmin(account);
//       
//       accountDao.deleteAccount(account.getUserName());
//       int actual=accountDao.findAccountByUserName(account.getUserName()).size();
//       accountDao.deleteAccountForever(account.getUserName());
//       assertEquals(0,actual);
//   }
//   
//   @Test
//   public void test_loadAccount_Pagination(){
//       
//       int expected=2;
//       int actual=accountDao.loadAccount_Pagination("v", 1, expected).size();
//       assertTrue(actual<=expected);
//   }
//   @Test
//   public void test_loadAccount_PaginationByRole(){
//       
//       int expected=2;
//       int actual=accountDao.loadAccount_PaginationByRole(2, 1, expected).size();
//       assertTrue(actual<=expected);
//   }
//   @Test
//   public void test_findAccountByRole(){
//       
//       account.setRole(123);
//       String expected=account.getUserName();
//       AccountService.getInstance().addAccountByAdmin(account);
//       
//       String actual=accountDao.findAccountByRole(123).get(0).getUserName();
//       accountDao.deleteAccountForever(account.getUserName());
//       assertEquals(expected,actual);
//   }
//   @Test
//   public void test_findAccountByPhone(){
//       
//       account.setPhone(account.getPhone()+"test");
//       AccountService.getInstance().addAccountByAdmin(account);
//       
//       int actual=accountDao.findAccountByPhone(account.getPhone()).size();
//       accountDao.deleteAccountForever(account.getUserName());
//       assertNotSame(0,actual);
//   }
//   @Test
//   public void test_addAccountByAdmin(){
//       
//       accountDao.addAccountByAdmin(account);
//       Account actual=accountDao.findAccountByUserName(account.getUserName()).get(0);
//       assertEquals(account.getUserName(),actual.getUserName());
//   }
//
//   
//}
