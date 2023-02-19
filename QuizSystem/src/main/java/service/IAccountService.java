/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

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
    
    public Account loginWithEmail(UserGoogleDto user);
}
