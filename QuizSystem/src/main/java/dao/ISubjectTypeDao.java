/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.SubType;

/**
 *
 * @author Lenovo
 */
public interface ISubjectTypeDao extends GenericDao<SubType>{
    public int addNewSubType(int idSub, int idCate);
    
    public List<SubType> getListCategoryIdBySubId(String subId);
    
    public void deleteSubTypeBySubId(int idSub);
    
    public void deleteByCateId(String id);
}
