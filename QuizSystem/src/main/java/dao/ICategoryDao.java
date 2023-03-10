/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Category;

public interface ICategoryDao extends GenericDao<Category>{
    List<Category> getAllCate();
    List<Category> getCateBySubID(int id);
}
