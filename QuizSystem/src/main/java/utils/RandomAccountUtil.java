/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Random;
import model.Account;

/**
 *
 * @author asus
 */
public class RandomAccountUtil {
   
    private static Account account= new Account();
    static RandomUtil RandomUtil=new RandomUtil();
    static int NumberOfCharactor=8;
    public RandomAccountUtil() {
        
    }

    public static Account getAccount() {
        account.setUserName(RandomUtil.randomAlphaNumeric(NumberOfCharactor));
        account.setPassword(RandomUtil.randomAlphaNumeric(NumberOfCharactor));
        account.setFirstName(RandomUtil.randomAlphaNumeric(NumberOfCharactor));
        account.setLastName(RandomUtil.randomAlphaNumeric(NumberOfCharactor));
        account.setGmail(RandomUtil.randomAlphaNumeric(NumberOfCharactor));
        account.setAddress(RandomUtil.randomAlphaNumeric(NumberOfCharactor));
        account.setImg(RandomUtil.randomAlphaNumeric(NumberOfCharactor));
        account.setPhone(RandomUtil.randomNumberString(10));
        account.setRole(RandomUtil.randomNumber(1, 4));
        account.setIsActive(RandomUtil.getGenerator().nextBoolean());
        return account;
    }
   
    
    
}
