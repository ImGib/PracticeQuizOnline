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
//

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
    public List<Account> searchAccountByUserName_Name_Gmail_Phone(String txt,int check) {
        String sql = "select * from Account\n"
                + "where (userName LIKE ? or \n"
                + "	firstName LIKE ? or\n"
                + "	lastName LIKE ? or\n"
                + "	gmail LIKE ? or\n"
                + "	phone LIKE ?)  ";
        if(check==1)sql+="and isActive=1 ";
        txt = "%" + txt + "%";
        return query(sql, AccountMapper.getInstance(), txt, txt, txt, txt, txt);
    }

    @Override
    public void changeRoleByUserName(String username, int id) {
        String sql = "update Account\n"
                + "set role =?\n"
                + "where userName=?";
        update(sql, id, username);
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

    @Override
    public void editAccount(Account a) {
        String sql = "update Account\n"
                + "set \n"
                + "	password=?,\n"
                + "	firstName=?,\n"
                + "	lastName=?,\n"
                + "	gmail=?,\n"
                + "	phone=?,\n"
                + "	role=?,\n"
                + "	address=?,\n"
                + "	isActive=?,\n"
                + "	img=?\n"
                + "where userName=?";
        update(sql, a.getPassword(), a.getFirstName(), a.getLastName(),
                a.getGmail(), a.getPhone(), a.getRole(), a.getAddress(),
                "true", a.getImg(), a.getUserName());
    }

    @Override
    public void deleteAccount(String user,boolean isActive) {
        String sql = "Update Account set isActive="+(isActive?"0":"1")
                + "where userName=?";
        update(sql, user);
    }

    @Override
    public List<Account> loadAccount_Pagination(String txt, int pageIndex, int nrpp,int check) {
        String sql = "select * from Account\n"
                + "                where (userName LIKE ? or \n"
                + "                firstName LIKE ? or\n"
                + "                + lastName LIKE ? or\n"
                + "                +	gmail LIKE ? or\n"
                + "                + 	phone LIKE ? )"+(check==1?"and isActive=1":"")
                + "order by userName\n"
                + "OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        txt = "%" + txt + "%";
        return query(sql, AccountMapper.getInstance(), txt, txt, txt, txt, txt, (pageIndex - 1) * nrpp, nrpp);
    }

    @Override
    public List<Account> loadAccount_PaginationByRole(int role, int pageIndex, int nrpp,int check) {
        String sql = "select * from Account\n"
                + "where role=? "+(check==1?"and isActive=1":"")
                + "order by userName\n"
                + "OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        return query(sql, AccountMapper.getInstance(), role, (pageIndex - 1) * nrpp, nrpp);
    }

    @Override
    public List<Account> findAccountByRole(int role,int check) {
        String sql = "select * from Account\n"
                + "where role=? "+(check==1?"and isActive=1":"");
        return query(sql, AccountMapper.getInstance(), role);
    }

    @Override
    public List<Account> findAccountByPhone(String phone) {
        String sql = "select * from Account\n"
                + "where phone=?";
        return query(sql, AccountMapper.getInstance(), phone);
    }

    @Override
    public List<Account> findAllAccount() {
        String sql = "select * from Account";
        return query(sql, AccountMapper.getInstance());
    }

    @Override
    public void addAccountByAdmin(Account a) {
        String sql = "insert into Account (userName, password, gmail, role, isActive, phone, address) values (?, ?, ?, ?, ?,?,?)";
        insert(sql, a.getUserName(), a.getPassword(), a.getGmail(), a.getRole(), 1, a.getPhone(), a.getAddress());
    }

    @Override
    public void updateProfile(Account a) {
        String sql = "update Account set firstName = ?, lastName = ?, gmail = ?, phone = ?, [address] = ?, img = ? where userName = ?";
        update(sql, a.getFirstName(), a.getLastName(), a.getGmail(), a.getPhone(), a.getAddress(), a.getImg(), a.getUserName());
    }

    @Override
    public void deleteAccountForever(String userName) {
        String sql = "delete from Account\n"
                + "where userName=?";
        update(sql, userName);
    }

}
