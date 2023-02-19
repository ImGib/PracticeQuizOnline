/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import dao.impl.AccountDao;
import model.Account;
import service.IAccountService;
import utils.CheckUtil;
import java.util.List;
import model.UserGoogleDto;

/**
 *
 * @author Lenovo
 */
public class AccountService implements IAccountService {

    private AccountDao accountDao;
    
    private static AccountService instance = null;
    
    public static AccountService getInstance(){
        if(instance == null){
            instance = new AccountService();
        }
        return instance;
    }

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
        CheckUtil check = new CheckUtil();
        List<Account> list = accountDao.findAccountByEmail(a.getGmail());
        if (!list.isEmpty()) {
            return ("Account is already exist!");
        }
        if (!check.checkEmail(a.getGmail())) {
            return ("Wrong format of mail!");
        }
        list = accountDao.findAccountByUserName(a.getUserName());
        if (!list.isEmpty()) {
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
        if (list.isEmpty()) {
            return "Account is not exist!";
        }
        return null;
    }

    @Override
    public String changePassWord(String email, String pass, String rePass, String code, String sessionCode, int timeInput) {
        if (timeInput > 3) {
            return "You have been wrong more 3 times. Please request forget password again!";
        }
        if (!pass.equals(rePass)) {
            return "Password and Re-password must be the same!";
        }
        if (!code.equals(sessionCode)) {
            return "Wrong verify code!";
        }
        accountDao.changePass(email, pass);
        return null;
    }
    @Override
    public String editProfile(String userName, String firstName, String lastName, String gmail, String phone, String address, String img) {
        CheckUtil check = new CheckUtil();
        if (!check.checkEmail(gmail)) {
            return ("Wrong format of mail!");
        }
        if (check.isContainSpace(userName)) {
            return ("User name or password can not contain space!");
        }
        accountDao.editAccount(userName, firstName, lastName, gmail, phone, address, img);
        return null;
    }

    @Override
    public Account loginWithEmail(UserGoogleDto user) {
        Account a = new Account(user.getEmail(), user.getEmail(), user.getEmail(), 0, true);
        if (accountDao.findAccountByEmail(user.getEmail()).isEmpty()) {
            accountDao.addAccount(a);
        } else {
            System.out.println("kkkkk");
        }
        return a;
    }

}
