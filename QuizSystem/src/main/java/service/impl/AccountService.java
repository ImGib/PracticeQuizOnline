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

    private AccountService() {
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
        List<Account> list = accountDao.findAccountByEmail(a.getGmail());
        if (!list.isEmpty()) {
            return ("Account is already exist!");
        }
        list = accountDao.findAccountByUserName(a.getUserName());
        if (!list.isEmpty()) {
            return "User name is already exist!";
        }
        if (!a.getPassword().equals(rePass)) {
            return ("Re-Password must be the same with password!");
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

    @Override
    public List<Account> findAccountByEmail(String email) {
        return accountDao.findAccountByEmail(email);
    }

    @Override
    public List<Account> findAccountByUserName(String userName) {
        return accountDao.findAccountByUserName(userName);
    }

    @Override
    public void addAccount(Account a) {
        accountDao.addAccount(a);
    }

    @Override
    public List<Account> searchAccountByUserName_Name_Gmail_Phone(String txt) {
        return accountDao.searchAccountByUserName_Name_Gmail_Phone(txt);
    }

    @Override
    public void deleteAccount(String user) {
        accountDao.deleteAccount(user);
    }

        @Override
    public List<Account> loadAccount_Pagination(String txt,int pageIndex, int nrpp) {
        if(txt.contains("Search_Role_")){
            txt=txt.replace("Search_Role_", "");
            return loadAccount_PaginationByRole(Integer.parseInt(txt), pageIndex, nrpp);
        }
        return accountDao.loadAccount_Pagination(txt, pageIndex, nrpp);
    }

    @Override
    public String checkValidateAddAccount(Account a) {
        if(!findAccountByUserName(a.getUserName()).isEmpty()){
            return "This User already exist!!!";
            
        }
        if(!findAccountByEmail(a.getGmail()).isEmpty()){
            return "This Email already exist!!!";
            
        }
        if(!accountDao.findAccountByPhone(a.getPhone()).isEmpty()){
            return "This Phone already exist!!!";
        }
        
        return null;
    }

    @Override
    public List<Account> loadAccount_PaginationByRole(int role,int pageIndex, int nrpp) {
        if(role!=5){
        return accountDao.loadAccount_PaginationByRole(role,pageIndex,nrpp);
        }else{
            return accountDao.searchAccountByUserName_Name_Gmail_Phone("");
        }
    }

    @Override
    public void changeRoleByUserName(String string, int i) {
        accountDao.changeRoleByUserName(string, i);
    }

    @Override
    public List<Account> findAccountByRole(int i) {
        return accountDao.findAccountByRole(i);
    }

    @Override
    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }
    

}
