/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.*;
import mapper.CategoryMapper;
import java.util.List;
import model.Category;

public class CategoryDao extends AbstractDao<Category> implements ICategoryDao {

    @Override
    public List<Category> getAllCate() {
        String sql = "select * from Category";
        return query(sql, new CategoryMapper());
    }

    @Override
    public List<Category> getCateBySubID(int i) {
        String sql = "select Category.* from Category,\n"
                + "(Select idCate from SubType where idSub = ?) as t1\n"
                + "where t1.idCate = Category.id";
        return query(sql, new CategoryMapper(), i);
    }
}
