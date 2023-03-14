/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import model.SubType;
import dao.ISubjectTypeDao;
import java.util.List;
import mapper.SubTypeMapper;

/**
 *
 * @author Lenovo
 */
public class SubjectTypeDao extends AbstractDao<SubType> implements ISubjectTypeDao{

    @Override
    public int addNewSubType(int idSub, int idCate) {
        String sql = "insert into SubType values (?, ?)";
        return insert(sql, idSub, idCate);
    }

    @Override
    public List<SubType> getListCategoryIdBySubId(String subId) {
        String sql = "select * from SubType where idSub = ?";
        return query(sql, new SubTypeMapper(), subId);
    }

    @Override
    public void deleteSubTypeBySubId(int subId) {
        String sql = "delete from SubType where idSub = ?";
        update(sql, subId);
    }
    
    @Override
    public void deleteByCateId(String id){
        String sql = "delete from SubType where idCate = ?";
        update(sql, id);
    }
    
}
