/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dinhson.quizsystem.main.java.service;

import com.dinhson.quizsystem.main.java.model.Account;


/**
 *
 * @author Lenovo
 */
public interface IAccountService {
    
    public Account findAccountByEmailAndPass(String email, String pass);
    
    public String addAccount(Account a, String rePass);
    
    public String forgetPass(String email);
    
    
}
