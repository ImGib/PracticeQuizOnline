/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccountService_Test;

import dao.impl.AccountDao;
import model.Account;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.RandomAccountUtil;
import service.impl.AccountService;
/**
 *
 * @author asus
 */
public class AccountService_Test {
    Account Account;
    AccountDao accountDao;
    AccountService accountService;
    @Test
    public void test_checkValidateAddAccount_UserExist(){
        Account=new RandomAccountUtil().getAccount();
        accountDao.addAccount(Account);
        String expected="This User already exist!!!";
        String actual=accountService.checkValidateAddAccount(Account);
        assertEquals(expected,actual);
    }
    @Test
    public void test_checkValidateAddAccount_EmailExist(){
        Account=new RandomAccountUtil().getAccount();
        accountDao.addAccount(Account);
        Account.setUserName("test");
        String expected="This Email already exist!!!";
        String actual=accountService.checkValidateAddAccount(Account);
        assertEquals(expected,actual);
    }
    @Test
    public void test_checkValidateAddAccount_PhoneExist(){
        Account=new RandomAccountUtil().getAccount();
        accountDao.addAccount(Account);
        Account.setUserName("test");
        Account.setGmail("test");
        String expected="This Phone already exist!!!";
        String actual=accountService.checkValidateAddAccount(Account);
        assertEquals(expected,actual);
    }
    @Test
    public void test_checkValidateAddAccount_TrueCase(){
        Account=new RandomAccountUtil().getAccount();
        accountDao.addAccount(Account);
        Account.setUserName("test");
        Account.setGmail("test");
        Account.setPhone("test");
        
        String actual=accountService.checkValidateAddAccount(Account);
        assertTrue(actual==null);
    }
    
   
}
