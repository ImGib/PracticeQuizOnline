/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import dao.impl.AbstractDao;
/**
 *
 * @author Gib
 */
public class Test {
    public static void main(String[] args) {
        AbstractDao dao = new AbstractDao();
        try {
            dao.getConnection();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
