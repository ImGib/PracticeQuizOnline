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
public interface IAccountDao extends GenericDao<Account> {

    List<Account> findAccountByEmailAndPass(String email, String pass);

    List<Account> findAccountByEmail(String email);

    List<Account> findAccountByUserName(String userName);

    void addAccount(Account a);

    void changePass(String email, String pass);

    void editAccount(String userName, String firstName, String lastName, String gmail, String phone, String address, String img);

    void editAccount(Account account);

    List<Account> searchAccountByUserName_Name_Gmail_Phone(String txt,int check);

    void changeRoleByUserName(String username, int id);

    int getNumberStaff();

    int getNumberStudent();

    void deleteAccount(String user,boolean isActive);

    List<Account> loadAccount_Pagination(String txt, int pageIndex, int nrpp,int check);

    List<Account> loadAccount_PaginationByRole(int role, int pageIndex, int nrpp, int check);

    List<Account> findAccountByRole(int role,int check);

    List<Account> findAccountByPhone(String phone);

    List<Account> findAllAccount();

    void addAccountByAdmin(Account a);

    void updateProfile(Account a);

    void deleteAccountForever(String userName);
}
