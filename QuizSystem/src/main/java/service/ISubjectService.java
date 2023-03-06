
package service;

import java.util.List;
import model.Subject;
import utils.PageUtil;

/**
 *
 * @author Gib
 */
public interface ISubjectService {
    public List<Subject> getTopThree();
    public int getNumberSubject();
    
    public List<Subject> getAllSubject();
    
    public int createNewSubject(Subject s);
    
    public Subject getSubjectById(String id);
    
    public void editSubject(Subject s);
    
    public void changePublic(boolean isPublic, String id);
    
    public int getNumberSubjectByUserName(String userName);
    
    public List<Subject> getListSubjectAndNumberQuestionByUserName(String userName);
    
    public int getNumberStudentByIdAuthor(String userName);
    
    public List<Subject> getAllSubjectAndNumberEnoll();
    
    public List<Subject> getAllSubjectAndNumberEnrollBySearchAndUserName(PageUtil p);
    
    public int getNumberSubjectBySearchAndUserName(PageUtil p) ;
}
