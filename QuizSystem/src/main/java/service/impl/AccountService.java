/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import dao.impl.AccountDao;
import model.Account;
import service.IAccountService;
import utils.Check;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class AccountService implements IAccountService {

    private AccountDao accountDao;

    public AccountService() {
        accountDao = new AccountDao();
    }

    @Override
    public Account findAccountByEmailAndPass(String userName, String pass) {
        List<Account> list = accountDao.findAccountByEmailAndPass(userName, pass);
        if (list == null || list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public String addAccount(Account a, String rePass) {
        Check check = new Check();
        List<Account> list = accountDao.findAccountByEmail(a.getGmail());
        if (!list.isEmpty()) {
            return ("Account is already exist!");
        }
        if (!check.checkEmail(a.getGmail())) {
            return ("Wrong format of mail!");
        }
        list = accountDao.findAccountByUserName(a.getUserName());
        if(!list.isEmpty()){
            return "User name is already exist!";
        }
        if (!a.getPassword().equals(rePass)) {
            return ("Re-Password must be the same with password!");
        }
        if (check.isContainSpace(rePass) || check.isContainSpace(a.getUserName())) {
            return ("User name or password can not contain space!");
        }
        accountDao.addAccount(a);
        return null;
    }

    @Override
    public String forgetPass(String email) {
        List<Account> list = accountDao.findAccountByEmail(email);
        if(list.isEmpty()){
            return "Account is not exist!";
        }
        return null;
    }

}
