/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Category;
import utils.PageUtil;

public interface ICategoryService {
    public List<Category> getAllCate();
    public List<Category> getCateBySubId(int id);
    public List<Category> getCateByPaging(PageUtil p);
    public int getNumberCateByPaging(PageUtil p) ;
    public void addNewCate(String name);
    public void delete(String id);
    public void updateCate(String id, String name);
    public List<Category> getCateByCateName(String name);
}
