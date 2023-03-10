package service;

import java.util.List;
import model.Account;
import model.Subject;
import utils.PageUtil;

public interface ISubjectService {

    List<Subject> getTopThree();

    public int getNumberSubject();
    
    public List<Subject> getAllSubjectByAccount(Account a);
    
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

    List<Subject> getSubject_subName(String search, int pageIndex, int nrpp);

    int count_subName(String search);

    List<Subject> getAllSubject();

    List<Subject> getEnrollByUsername(String username, int pageIndex, int nrpp);

    int countEnrollByUsername(String username);

    Subject getSubjectById(int id);

    List<Subject> getSubject_Cate(String search, int pageIndex, int nrpp);
    int count_Cate(String search);
}
