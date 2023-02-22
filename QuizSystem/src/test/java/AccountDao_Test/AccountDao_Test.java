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
//
//    AccountDao accountDao = new AccountDao();
//    Account account;
//
//    @Test
//    public void test_searchAccountByUserName_Name_Gmail_PhoneTrueCase() {
//        String data = "xxx";
//        String expected = "xxx";
//        String actual = accountDao.searchAccountByUserName_Name_Gmail_Phone(data).get(0).getUserName();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void test_searchAccountByUserName_Name_Gmail_PhoneWrongCase() {
//        String data = "xxxx";
//        String expected = "@#$%";
//        String actual = accountDao.searchAccountByUserName_Name_Gmail_Phone(data).get(0).getUserName();
//        assertTrue(actual.contains(expected));
//    }
//
//    @Test
//    public void test_changeRoleByUserName() {
//        account = RandomAccountUtil.getAccount();
//        int expected = account.getRole();
//        accountDao.changeRoleByUserName(account.getUserName(), expected);
//        int actual = accountDao.findAccountByUserName(account.getUserName()).get(0).getRole();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void test_deleteAccount() {
//        account = RandomAccountUtil.getAccount();
//        account.setIsActive(true);
//        boolean expected = true;
//        accountDao.deleteAccount(account.getUserName());
//        boolean actual = accountDao.findAccountByUserName(account.getUserName()).get(0).isIsActive();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void test_loadAccount_Pagination() {
//
//        int expected = 2;
//        int actual = accountDao.loadAccount_Pagination("v", 1, expected).size();
//        assertTrue(actual <= expected);
//    }
//
//    @Test
//    public void test_loadAccount_PaginationByRole() {
//        int expected = 2;
//        int actual = accountDao.loadAccount_PaginationByRole(2, 1, expected).size();
//        assertTrue(actual <= expected);
//    }
//
//    @Test
//    public void test_findAccountByRole() {
//        account = RandomAccountUtil.getAccount();
//        account.setRole(123);
//        String expected = account.getUserName();
//        String actual = accountDao.findAccountByRole(123).get(0).getUserName();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void test_findAccountByPhone() {
//        account = RandomAccountUtil.getAccount();
//        account.setPhone(account.getPhone() + "test");
//        String expected = account.getUserName();
//        String actual = accountDao.findAccountByPhone(account.getPhone()).get(0).getUserName();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void test_addAccountByAdmin() {
//        Account actual = RandomAccountUtil.getAccount();
//        accountDao.addAccountByAdmin(account);
//        Account expected = accountDao.findAccountByUserName(actual.getUserName()).get(0);
//        assertEquals(expected, actual);
//    }
//}
