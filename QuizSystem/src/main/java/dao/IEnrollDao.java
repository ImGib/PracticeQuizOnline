/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Enroll;

public interface IEnrollDao extends GenericDao<Enroll>{
    int getNumberEnrollByIdSub(int idSub);
}
