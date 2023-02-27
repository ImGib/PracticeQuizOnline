/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.IEnrollDao;
import mapper.EnrollMapper;
import model.Enroll;

public class EnrollDao extends AbstractDao<Enroll> implements IEnrollDao {

    @Override
    public int getNumberEnrollByIdSub(int idSub) {
        String sql = "select COUNT(*) from Enroll\n"
                + "where idSub = ?";
        return count(sql, idSub);
    }

}
