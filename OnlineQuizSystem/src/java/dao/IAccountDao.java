/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.Account;

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
