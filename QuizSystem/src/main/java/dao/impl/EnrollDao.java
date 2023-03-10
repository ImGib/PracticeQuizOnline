/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.IEnrollDao;
import java.util.List;
import mapper.EnrollMapper;
import model.Enroll;

public class EnrollDao extends AbstractDao<Enroll> implements IEnrollDao {

    @Override
    public int getNumberEnrollByIdSub(int idSub) {
        String sql = "select COUNT(*) from Enroll\n"
                + "where idSub = ?";
        return count(sql, idSub);
    }

    @Override
    public List<Enroll> checkEnroll(String username, int idSub) {
        String sql = "select * from Enroll\n"
                + "where userName = ? and idSub = ?";
        return query(sql, new EnrollMapper(), username, idSub);
    }

    @Override
    public void insertEnroll(String string, int i) {
        String sql = "insert into Enroll (userName, idSub) values (?, ?)";
        insert(sql, string, i);
    }

}
