/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import dao.impl.AccountDao;

/**
 *
 * @author asus
 */
public class TestChucNang {
    public static void main(String[] args) {
        AccountDao dao=new AccountDao();
        System.out.println(dao.Search("dinson", 0, 1).size());
    }
}
