/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dinhson.quizsystem.main.java.dao.impl;


import com.dinhson.quizsystem.main.java.dao.IAccountDao;
import com.dinhson.quizsystem.main.java.mapper.AccountMapper;
import com.dinhson.quizsystem.main.java.model.Account;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class AccountDao extends AbstractDao<Account> implements IAccountDao {

    @Override
    public List<Account> findAccountByEmailAndPass(String email, String pass) {
        String sql = "select * from Account \n"
                + "where gmail = ? and [password] = ?";
        return query(sql, new AccountMapper(), email, pass);
    }

    @Override
    public List<Account> findAccountByEmail(String email) {
        String sql = "select * from Account where gmail = ?";
        return query(sql, new AccountMapper(), email);
    }

    @Override
    public void addAccount(Account a) {
        String sql = "insert into Account (userName, password, gmail, role) values (?, ?, ?, ?)";
        insert(sql, a.getUserName(), a.getPassword(), a.getGmail(), a.getRole());
    }

    @Override
    public List<Account> findAccountByUserName(String userName) {
        String sql = "select * from Account where userName = ?";
        return query(sql, new AccountMapper(), userName);
    }

    @Override
    public void changePass(String email, String pass) {
        String sql = "update Account set password = ? where gmail = ?";
        update(sql, pass, email);
    }
}
