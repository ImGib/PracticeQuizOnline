/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Category;
import model.SubType;

/**
 *
 * @author Lenovo
 */
public interface ISubjectTypeService {
    public void createNewSubType(String[] idCates, int idSub);
    
    public List<SubType> getListCategoryIdBtSubId(String idSub);
    
    public void editSubType(int idSub, String[] cateIds);
}
