package service;

import java.util.List;
import model.Subject;

public interface ISubjectService {

    List<Subject> getTopThree();

    int getNumberSubject();

    List<Subject> getSubject_subName(String search, int pageIndex, int nrpp);

    int count_subName(String search);

    List<Subject> getAllSubject();

    List<Subject> getEnrollByUsername(String username, int pageIndex, int nrpp);

    int countEnrollByUsername(String username);

    Subject getSubjectById(int id);

    List<Subject> getSubject_Cate(String search, int pageIndex, int nrpp);
    int count_Cate(String search);
}
