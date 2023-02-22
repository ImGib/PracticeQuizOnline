/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.Subject;


public interface ISubjectDAO extends GenericDao<Subject>{
    List<Subject> getTopThree();
    
    public int getNumberSubject();
    
    public List<Subject> getAllSubject();
    
    public List<Subject> subjectPagintion(String txt, int pageIndex, int nrpp);
    
    public List<Subject> getAllSubjectAndNumberEnroll();
    
}
