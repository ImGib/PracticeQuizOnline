///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
// */
//package serviceTest;
//
//import dao.impl.AccountDao;
//import model.Account;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import service.impl.AccountService;
//import utils.CheckUtil;
//
///**
// *
// * @author Lenovo
// */
//public class AccountServiceTest {
//    
//    public AccountServiceTest() {
//    }
//    
//    @Test
//    public void testFindAccountByEmailAndPassWithTrueData(){
//        String expected = "dinson";
//        String actual = AccountService.getInstance().findAccountByEmailAndPass("dinhson1032001@gmail.com", CheckUtil.MD5Encryption("123")).getUserName();
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testFindAccountByEmailAndPassWithWrongEmailReturnFalse(){
//        Account expected = null;
//        Account actual = AccountService.getInstance().findAccountByEmailAndPass("dinhson01@gmail.com", CheckUtil.MD5Encryption("123"));
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testFindAccountByEmailAndPassWithWrongPassReturnFalse(){
//        Account expected = null;
//        Account actual = AccountService.getInstance().findAccountByEmailAndPass("dinhson1032001@gmail.com", "heldfdflo");
//        assertEquals(expected, actual);
//    }
//    
//    //@Test
//    public void testAddAccountWithTrueData(){
//        Account a = new Account("dinhssonnguyen", "123", "dinhson111@gmail.com", 1, true);
//        String expected = null;
//        String actual= AccountService.getInstance().addAccount(a, "123");
//        assertEquals(expected, actual);
//    }
//    
//    
//    @Test
//    public void testAddAccountWithUserNameExist(){
//        Account a = new Account("dinson", "123", "dinhsondssđ111@gmail.com", 1, true);
//        String expected = "User name is already exist!";
//        String actual= AccountService.getInstance().addAccount(a, "123");
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testAddAccountWithGmailExist(){
//        Account a = new Account("dinhssonnguydsden", "123", "dinhson1032001@gmail.com", 1, true);
//        String expected = "Account is already exist!";
//        String actual= AccountService.getInstance().addAccount(a, "123");
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testForgetPassWithTrueData(){
//        String expected = null;
//        String actual = AccountService.getInstance().forgetPass("dinhson1032001@gmail.com");
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testForgetPassWithWrongData(){
//        String expected = null;
//        String actual = AccountService.getInstance().forgetPass("dinhdsfsdson111@gmail.com");
//        assertNotEquals(expected, actual);
//    }
//    
//    //@Test
//    public void testChangePassWithTrueData(){
//        String expected = null;
//        String actual = AccountService.getInstance().changePassWord("dinhson123@gmail.com",
//                "123", "123", "123", "123", 0);
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testChangePassWithWrongCode(){
//        String expected = "Wrong verify code!";
//        String actual = AccountService.getInstance().changePassWord("dinhson1032001@gmail.com",
//                "123", "123", "1233", "123", 0);
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testChangePassWithWrongPass(){
//        String expected = "Password and Re-password must be the same!";
//        String actual = AccountService.getInstance().changePassWord("dinhson1032001@gmail.com",
//                "123111", "123", "123", "123", 0);
//        assertEquals(expected, actual);
//    }
//    
//    @Test
//    public void testChangePassWithTimeInputMoreThanThree(){
//        String expected = "You have been wrong more 3 times. Please request forget password again!";
//        String actual = AccountService.getInstance().changePassWord("dinhson1032001@gmail.com",
//                "123", "123", "123", "123", 4);
//        assertEquals(expected, actual);
//    }
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
//    @Test
//    public void test_checkValidateAddAccount_EmailExist() {
//        
//        accountDao.addAccountByAdmin(account);
//        account.setUserName("test");
//        String expected = "This Email already exist!!!";
//        String actual = AccountService.getInstance().checkValidateAddAccount(account);
//        AccountService.getInstance().deleteAccountForever(account.getUserName());
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void test_checkValidateAddAccount_PhoneExist() {
//        
//        accountDao.addAccountByAdmin(account);
//        account.setUserName("test");
//        account.setGmail("test");
//        String expected = "This Phone already exist!!!";
//        String actual = AccountService.getInstance().checkValidateAddAccount(account);
//        AccountService.getInstance().deleteAccountForever(account.getUserName());
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void test_checkValidateAddAccount_TrueCase() {
//        
//        accountDao.addAccountByAdmin(account);
//        account.setUserName("test");
//        account.setGmail("test");
//        account.setPhone("test");
//        String actual = AccountService.getInstance().checkValidateAddAccount(account);
//        AccountService.getInstance().deleteAccountForever(account.getUserName());
//        assertTrue(actual == null);
//    }
//}
