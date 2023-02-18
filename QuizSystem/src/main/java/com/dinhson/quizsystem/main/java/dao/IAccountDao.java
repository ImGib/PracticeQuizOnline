/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.dinhson.quizsystem.main.java.dao;

import com.dinhson.quizsystem.main.java.model.Account;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public interface IAccountDao extends GenericDao<Account>{
    List<Account> findAccountByEmailAndPass(String email, String pass);
    List<Account> findAccountByEmail(String email);
    List<Account> findAccountByUserName(String userName);
    void addAccount(Account a);
    void changePass(String email, String pass);
    
}
