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
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String gmail;
    private String phone;
    private int role;
    private String address;
    private boolean isActive;
    private String img;
    private Account Account;

    
    RandomUtil RandomUtil=new RandomUtil();
    int NumberOfCharactor=8;
    public RandomAccountUtil() {
        userName=RandomUtil.randomAlphaNumeric(NumberOfCharactor);
        password=RandomUtil.randomAlphaNumeric(NumberOfCharactor);
        firstName=RandomUtil.randomAlphaNumeric(NumberOfCharactor);
        lastName=RandomUtil.randomAlphaNumeric(NumberOfCharactor);
        lastName=RandomUtil.randomAlphaNumeric(NumberOfCharactor);
        gmail=RandomUtil.randomAlphaNumeric(NumberOfCharactor);
        address=RandomUtil.randomAlphaNumeric(NumberOfCharactor);
        img=RandomUtil.randomAlphaNumeric(NumberOfCharactor);
        phone=RandomUtil.randomNumberString(10);
        role=RandomUtil.randomNumber(1, 4);
        isActive=RandomUtil.getGenerator().nextBoolean();
        Account=new Account(userName, password, firstName, lastName, gmail, phone, role, address, isActive, img);
    }

    public Account getAccount() {
        return Account;
    }
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGmail() {
        return gmail;
    }

    public String getPhone() {
        return phone;
    }

    public int getRole() {
        return role;
    }

    public String getAddress() {
        return address;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public String getImg() {
        return img;
    }
    
    
}
