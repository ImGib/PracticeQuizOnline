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

    Account account;
    AccountDao accountDao = new AccountDao();
    AccountService accountService;

    @Test
    public void test_checkValidateAddAccount_UserExist() {
        account = RandomAccountUtil.getAccount();
        accountDao.addAccount(account);
        String expected = "This User already exist!!!";
        String actual = accountService.checkValidateAddAccount(account);
        assertEquals(expected, actual);
    }

    @Test
    public void test_checkValidateAddAccount_EmailExist() {
        account = RandomAccountUtil.getAccount();
        accountDao.addAccount(account);
        account.setUserName("test");
        String expected = "This Email already exist!!!";
        String actual = accountService.checkValidateAddAccount(account);
        assertEquals(expected, actual);
    }

    @Test
    public void test_checkValidateAddAccount_PhoneExist() {
        account = RandomAccountUtil.getAccount();
        accountDao.addAccount(account);
        account.setUserName("test");
        account.setGmail("test");
        String expected = "This Phone already exist!!!";
        String actual = accountService.checkValidateAddAccount(account);
        assertEquals(expected, actual);
    }

    @Test
    public void test_checkValidateAddAccount_TrueCase() {
        account = RandomAccountUtil.getAccount();
        accountDao.addAccount(account);
        account.setUserName("test");
        account.setGmail("test");
        account.setPhone("test");
        String actual = accountService.checkValidateAddAccount(account);
        assertTrue(actual == null);
    }

}
