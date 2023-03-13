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
//import service.impl.AccountService;
//import utils.CheckUtil;
//import utils.RandomAccountUtil;
//import utils.RandomUtil;
//
//public class AccountDaoTest {
//
//    public AccountDaoTest() {
//    }
//
//    private final AccountDao accountDao = new AccountDao();
//
//    Account account = RandomAccountUtil.getAccount();
//
//    RandomUtil RandomUtil = new RandomUtil();
//
//    @Test
//    public void testFindAccountByEmailAndPassWithTrueDataReturnWell() {
//        boolean expected = false;
//        boolean actual = accountDao.findAccountByEmailAndPass("dinhson1032001@gmail.com", CheckUtil.MD5Encryption("123")).isEmpty();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindAccountByEmailAndPassWithWrongEmailReturnFalse() {
//        boolean expected = true;
//        boolean actual = accountDao.findAccountByEmailAndPass("ddinhson1032001@gmail.com", CheckUtil.MD5Encryption("123")).isEmpty();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindAccountByEmailAndPassWithWrongPassReturnFalse() {
//        boolean expected = true;
//        boolean actual = accountDao.findAccountByEmailAndPass("dinhson1032001@gmail.com", "12345").isEmpty();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindAccountByEmailWithTrueData() {
//        String expected = "dinhson1032001@gmail.com";
//        String actual = accountDao.findAccountByEmail("dinhson1032001@gmail.com").get(0).getGmail();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindAccountByEmailWithWrongData() {
//        boolean expected = true;
//        boolean actual = accountDao.findAccountByEmail("dinhson11@gmail.com").isEmpty();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testAddAccountWithTrueData() {
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
//    public void testAddAccountWithUserNameExist() {
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
//    public void testFindAccountByUserNameWithUserNameExist() {
//        boolean expected = false;
//        boolean actual = accountDao.findAccountByUserName("dinson").isEmpty();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testFindAccountByUserNameWithUserNameNotExist() {
//        boolean expected = false;
//        boolean actual = accountDao.findAccountByUserName("dindfdfhson123").isEmpty();
//        assertNotEquals(expected, actual);
//    }
//
//    @Test
//    public void testChangePassReturnWell() {
//        String newPass = "1234567";
//        String email = "dinhson123@gmail.com";
//        accountDao.changePass(email, newPass);
//        boolean expected = false;
//        boolean actual = accountDao.findAccountByEmailAndPass(email, newPass).isEmpty();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void test_searchAccountByUserName_Name_Gmail_PhoneTrueCase() {
//        String expected = "@#$%^";
//        account.setUserName(expected);
//        AccountService.getInstance().addAccountByAdmin(account);
//
//        String actual = accountDao.searchAccountByUserName_Name_Gmail_Phone(expected).get(0).getUserName();
//        accountDao.deleteAccountForever(account.getUserName());
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void test_searchAccountByUserName_Name_Gmail_PhoneWrongCase() {
//        String data = "@@@@@@@@@";
//        int expected = 0;
//
//        int actual = accountDao.searchAccountByUserName_Name_Gmail_Phone(data).size();
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void test_changeRoleByUserName() {
//        account.setRole(1);
//        int expected = 2;
//        AccountService.getInstance().addAccountByAdmin(account);
//
//        accountDao.changeRoleByUserName(account.getUserName(), expected);
//        int actual = accountDao.findAccountByUserName(account.getUserName()).get(0).getRole();
//        accountDao.deleteAccountForever(account.getUserName());
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void test_deleteAccount() {
//
//        account.setIsActive(true);
//
//        AccountService.getInstance().addAccountByAdmin(account);
//
//        accountDao.deleteAccount(account.getUserName());
//        int actual = accountDao.findAccountByUserName(account.getUserName()).size();
//        accountDao.deleteAccountForever(account.getUserName());
//        assertEquals(0, actual);
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
//
//        int expected = 2;
//        int actual = accountDao.loadAccount_PaginationByRole(2, 1, expected).size();
//        assertTrue(actual <= expected);
//    }
//
//    @Test
//    public void test_findAccountByRole() {
//
//        account.setRole(123);
//        String expected = account.getUserName();
//        AccountService.getInstance().addAccountByAdmin(account);
//
//        String actual = accountDao.findAccountByRole(123).get(0).getUserName();
//        accountDao.deleteAccountForever(account.getUserName());
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void test_findAccountByPhone() {
//
//        account.setPhone(account.getPhone() + "test");
//        AccountService.getInstance().addAccountByAdmin(account);
//
//        int actual = accountDao.findAccountByPhone(account.getPhone()).size();
//        accountDao.deleteAccountForever(account.getUserName());
//        assertNotSame(0, actual);
//    }
//
//    @Test
//    public void test_addAccountByAdmin() {
//
//        accountDao.addAccountByAdmin(account);
//        Account actual = accountDao.findAccountByUserName(account.getUserName()).get(0);
//        assertEquals(account.getUserName(), actual.getUserName());
//    }
//}
