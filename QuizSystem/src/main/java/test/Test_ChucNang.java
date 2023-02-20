/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dao.impl.AccountDao;
import java.util.List;
import model.Account;
import service.impl.AccountService;

/**
 *
 * @author asus
 */
public class Test_ChucNang {
    public static void main(String[] args) {
        AccountDao ad=new AccountDao();
//        for(Account a: ad.findAccountByRole(1)){
//            System.out.println(a.getUserName());
//        }
        System.out.println(AccountService.getInstance().searchAccountByUserName_Name_Gmail_Phone("").size());
        
    }
}
