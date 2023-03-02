package service;

import java.util.List;
import model.Subject;

public interface ISubjectService {

    public List<Subject> getTopThree();

    public int getNumberSubject();

    public List<Subject> getSubjectPagination(String search, int pageIndex, int nrpp);

    public int countAllSubjectPagination(String search);

    public List<Subject> getAllSubject();

    List<Subject> getEnrollByUsername(String username, int pageIndex, int nrpp);

    int countEnrollByUsername(String username);
    
    Subject getSubjectById(int id);
}
