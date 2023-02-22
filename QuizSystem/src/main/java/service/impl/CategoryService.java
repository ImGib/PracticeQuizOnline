/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import dao.impl.CategoryDao;
import java.util.List;
import model.Category;
import service.ICategoryService;

/**
 *
 * @author Gib
 */
public class CategoryService implements ICategoryService{
    
    private CategoryDao categoryDao;
    
    public CategoryService(){
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
        List<Category> list = categoryDao.getAllCate();
        if (list == null || list.isEmpty()) {
            return null;
        } else {
            return list;
        }
    }
    
}
