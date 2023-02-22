/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dao.impl.AbstractDao;

/**
 *
 * @author asus
 */
public class Test_ConnectDatabase {
    public static void main(String[] args) {
        AbstractDao ad=new AbstractDao();
        try {
            ad.getConnection();
            System.out.println("Successfull");
        } catch (Exception e) {
            System.out.println("Loi roi cung");
        }
    }
}
