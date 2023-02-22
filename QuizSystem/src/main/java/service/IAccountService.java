/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Account;
import model.UserGoogleDto;


/**
 *
 * @author Lenovo
 */
public interface IAccountService {
    
    public Account findAccountByEmailAndPass(String email, String pass);
    
    public String addAccount(Account a, String rePass);
    
    public String forgetPass(String email);
    
    public String changePassWord(String email, String pass, String rePass, String code, String sessionCode, int timeInput);
    
    public String editProfile(String userName, String firstName, String lastName, String gmail, String phone, String address, String img);
    
     public String editProfile1(String userName, String firstName, String lastName, String gmail, String phone, String address, String img);
     
    public Account loginWithEmail(UserGoogleDto user);
    
    public String changePassWordUser(String email, String pass, String rePass);

    List<Account> findAccountByEmail(String email);
    List<Account> findAccountByUserName(String userName);
    void addAccount(Account a);
    
    //Vinh-----------------------------------------------------------------------
    List<Account> searchAccountByUserName_Name_Gmail_Phone(String txt);
    void deleteAccount(String user);
    List<Account> loadAccount_Pagination(String txt,int pageIndex, int nrpp);
    
    String checkValidateAddAccount(Account a);
    
    List<Account> loadAccount_PaginationByRole(int role,int pageIndex, int nrpp);
    
    void changeRoleByUserName(String username, int id);
    
    List<Account> findAccountByRole(int role);
    
    List<Account> findAllAccount();
    
    void addAccountByAdmin(Account a);
   
    public Account getAccountByID(String username);
    
    public int getNumberStaff();
    
    public int getNumberStudent();

}
