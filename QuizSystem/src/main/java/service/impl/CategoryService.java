/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import dao.impl.CategoryDao;
import java.util.List;
import model.Category;
import service.ICategoryService;
import utils.PageUtil;


public class CategoryService implements ICategoryService{
    
    private CategoryDao categoryDao;
    
    private CategoryService(){
        categoryDao = new CategoryDao();
    }
    
    private static CategoryService instance = null;
    
    public static CategoryService getInstance(){
        if(instance == null){
            instance = new CategoryService();
        }
        return instance;
    }
    @Override
    public List<Category> getAllCate() {
        return categoryDao.getAllCate();
    }

    @Override
    public List<Category> getCateBySubId(int id) {
        return categoryDao.getCateBySubID(id);
    }
    
    @Override
    public List<Category> getCateByPaging(PageUtil p){
        return categoryDao.getCategoryByPaging(p);
    }
    
    @Override
    public int getNumberCateByPaging(PageUtil p) {
        return categoryDao.getNumberCateByPaging(p);
    }
    
    @Override
    public void addNewCate(String name){
        categoryDao.addNewCate(name);
    }
    
    @Override
    public void delete(String id){
        categoryDao.delete(id);
    }
    
    @Override
    public void updateCate(String id, String name){
        categoryDao.updateCate(id, name);
    }
    
    @Override
    public List<Category> getCateByCateName(String name){
        return categoryDao.getCateByCateName(name);
    }
}
