/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import dao.impl.AccountDao;
import java.util.List;
import model.Account;

/**
 *
 * @author asus
 */
public class Test_ChucNang {
    public static void main(String[] args) {
        AccountDao ad=new AccountDao();
        List<Account> list= ad.SearchAccountByUserName_Name_Gmail_Phone("");
        for (Account a : ad.LoadAccount_Pagination("v",1, 2)) {
            System.out.println(a);
        }
    }
}
