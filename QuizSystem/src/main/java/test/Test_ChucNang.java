/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dao.impl.AccountDao;
import java.util.List;
import model.Account;
import org.bouncycastle.pqc.math.linearalgebra.RandUtils;
import service.impl.AccountService;
import utils.RandomAccountUtil;
import utils.RandomUtil;

/**
 *
 * @author asus
 */
public class Test_ChucNang {
    public static void main(String[] args) {
        AccountDao ad=new AccountDao();
//        for(Account a: ad.searchAccountByUserName_Name_Gmail_Phone("")){
//            System.out.println(a.getUserName());
//        }
        RandomAccountUtil r=new RandomAccountUtil();
        System.out.println(r.getAccount());
       
    }
}
