/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import dao.impl.SubjectTypeDao;
import java.util.List;
import model.Category;
import model.SubType;
import service.ISubjectTypeService;

/**
 *
 * @author Lenovo
 */
public class SubjectTypeService implements ISubjectTypeService{
    
    private SubjectTypeDao typeDao;
    
    private static SubjectTypeService instance = null;
    
    public static SubjectTypeService getInstance(){
        if(instance == null){
            instance = new SubjectTypeService();
        }
        return instance;
    }

    private SubjectTypeService() {
        typeDao = new SubjectTypeDao();
    }

    @Override
    public void createNewSubType(String[] idCates, int idSub) {
        for (String idCate : idCates) {
            int id;
            try {
                id = Integer.parseInt(idCate);
                typeDao.addNewSubType(idSub, id);
            } catch (NumberFormatException e) {
            }
        }
    }

    @Override
    public List<SubType> getListCategoryIdBtSubId(String idSub) {
        return typeDao.getListCategoryIdBySubId(idSub);
    }

    @Override
    public void editSubType(int idS, String[] cateIds) {
        typeDao.deleteSubTypeBySubId(idS);
        createNewSubType(cateIds, idS);
    }
    
}
