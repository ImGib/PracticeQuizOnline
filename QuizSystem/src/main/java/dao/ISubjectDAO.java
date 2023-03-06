/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.Subject;
import utils.PageUtil;


public interface ISubjectDAO extends GenericDao<Subject>{
    List<Subject> getTopThree();
    
    public int getNumberSubject();
    
    public List<Subject> getAllSubject();
    
    public List<Subject> getAllSubjectAndNumberEnroll();
    
    public int addNewSubject(Subject subject);
    
    public List<Subject> getSubjectById(String id);
    
    public void editSubject(Subject s);
    
    public void editPublic(String isPulic, String id);
    
    public int getNumberSubjectByUserName(String userName);
    
    public List<Subject> getListSubjectAndNumberQuestionByUserName(String userName);
    
    public int getNumberStudentByIdAuthor(String userName);
    
    public List<Subject> getAllSubjectAndNumberEnrollBySearchAndUserName(PageUtil p);
    
    public int getNumberSubjectBySearchAndUserName(PageUtil p);
    
    public List<Subject> findSubjectByName(String name);
}
