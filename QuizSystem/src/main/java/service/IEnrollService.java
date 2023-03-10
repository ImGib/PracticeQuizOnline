/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Gib
 */
public interface IEnrollService {
    int getNumberEnrollByIdSub(int idSub);
    int checkEnroll(String username, int idSub);
    void enroll(String username, int idSub);
}
