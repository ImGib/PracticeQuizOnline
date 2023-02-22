/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.IAccountDao;
import mapper.AccountMapper;
import model.Account;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class AccountDao extends AbstractDao<Account> implements IAccountDao {

    @Override
    public List<Account> findAccountByEmailAndPass(String email, String pass) {
        String sql = "select * from Account \n"
                + "where gmail = ? and [password] = ? and isActive = 1";
        return query(sql, AccountMapper.getInstance(), email, pass);
    }

    @Override
    public List<Account> findAccountByEmail(String email) {
        String sql = "select * from Account where gmail = ? and isActive = 1";
        return query(sql, AccountMapper.getInstance(), email);
    }

    @Override
    public void addAccount(Account a) {
        String sql = "insert into Account (userName, password, gmail, role, isActive) values (?, ?, ?, ?, ?)";
        insert(sql, a.getUserName(), a.getPassword(), a.getGmail(), a.getRole(), 1);
    }

    @Override
    public List<Account> findAccountByUserName(String userName) {
        String sql = "select * from Account where userName = ? and isActive = 1";
        return query(sql, AccountMapper.getInstance(), userName);
    }

    @Override
    public void changePass(String email, String pass) {
        String sql = "update Account set password = ? where gmail = ? and isActive = 1";
        update(sql, pass, email);
    }

    @Override
    public void editAccount(String userName, String firstName, String lastName, String gmail, String phone, String address, String img) {
        String sql = "update Account set userName = ?,firstName = ?,lastName = ?,gmail = ?,phone = ?,address = ?,img = ? where gmail = ?";
        update(sql, userName, firstName, lastName, gmail, phone, address, img, gmail);
    }

    @Override
    public List<Account> SearchAccountByUserName_Name_Gmail_Phone(String txt) {
        String sql = "select * from Account\n"
                + "where userName LIKE ? or \n"
                + "	firstName LIKE ? or\n"
                + "	lastName LIKE ? or\n"
                + "	gmail LIKE ? or\n"
                + "	phone LIKE ? ;";
        txt = "%" + txt + "%";
        return query(sql, AccountMapper.getInstance(), txt, txt, txt, txt, txt);
    }

    @Override
    public void ChangeRoleByUserName(String username, int id) {
        String sql = "update Account\n"
                + "set role =?\n"
                + "where userName=?";
        update(sql, id, username);
    }

    @Override
    public List<Account> FilterRole(int role) {
        String sql = "select * from Account where role=?";
        return query(sql, AccountMapper.getInstance(), role);
    }

    @Override
    public int getNumberStaff() {
        String sql = "select count(userName)\n"
                + "from Account\n"
                + "where role <> 1";
        return count(sql);
    }

    @Override
    public int getNumberStudent() {
        String sql = "select count(userName)\n"
                + "from Account\n"
                + "where role = 1";
        return count(sql);
    }
}
