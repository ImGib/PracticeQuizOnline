/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.ArrayList;
import model.Account;
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
    void editAccount(String userName, String firstName, String lastName, String gmail, String phone, String address, String img);
    List<Account> SearchAccountByUserName_Name_Gmail_Phone(String txt);
    
    void ChangeRoleByUserName (String username, int id);
    
    List<Account> FilterRole(int role);
    
    void EditAccount(Account account);
    
    void DeleteAccount(String user);
    
    List<Account> LoadAccount_Pagination(String txt,int pageIndex, int nrpp);
}
