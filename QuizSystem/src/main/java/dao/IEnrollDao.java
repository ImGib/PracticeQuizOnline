/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Enroll;

public interface IEnrollDao extends GenericDao<Enroll>{
    int getNumberEnrollByIdSub(int idSub);
    List<Enroll> checkEnroll(String username, int idSub);
    void insertEnroll(String username, int idSub);
}
