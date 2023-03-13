/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.*;
import mapper.CategoryMapper;
import java.util.List;
import model.Category;
import utils.PageUtil;

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

    @Override
    public List<Category> getCategoryByPaging(PageUtil p) {
        String sql = "select * \n"
                + "from Category\n"
                + "order by id\n"
                + "offset ? rows \n"
                + "fetch next ? rows only";
        String sql2 = "select * \n"
                + "from Category\n"
                + "where name like ?\n"
                + "order by id\n"
                + "offset ? rows \n"
                + "fetch next ? rows only";
        return p.getSearch().isEmpty()? 
                query(sql, new CategoryMapper(),p.getOffSet(), p.getNrpp()) : 
                query(sql2, new CategoryMapper(), "%" + p.getSearch() + "%", p.getOffSet(), p.getNrpp());
    }

    @Override
    public int getNumberCateByPaging(PageUtil p) {
        String sql = "select count(*) from Category";
        if(!p.getSearch().isEmpty()){
            sql += " where name like ?";
            return count(sql, "%"+p.getSearch()+"%");
        }
        return count(sql);
    }

    
    @Override
    public void addNewCate(String name){
        String sql = "insert into Category(name) values(?)";
        update(sql, name);
    }
    
    @Override
    public void delete(String id){
        String sql = "delete from Category where id = ?";
        update(sql, id);
    }
    
    @Override
    public void updateCate(String id, String name){
        String sql = "update Category set name = ? where id = ?";
        update(sql, name, id);
    }
}
