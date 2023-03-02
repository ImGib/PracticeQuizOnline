/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import dao.impl.SubjectDAO;
import java.util.List;
import model.Subject;
import service.ISubjectService;

public class SubjectService implements ISubjectService {
    
    private SubjectDAO subjectDao;
    
    private SubjectService(){
        subjectDao = new SubjectDAO();
    }
    
    public static SubjectService instance = null;
    
    public static SubjectService getInstance(){
        if(instance == null){
            instance = new SubjectService();
        }
        return instance;
    }

    @Override
    public List<Subject> getTopThree() {
        return subjectDao.getTopThree();
    }
    public int getNumberSubject() {
        return subjectDao.getNumberSubject();
    }

    @Override
    public List<Subject> getAllSubject() {
        return subjectDao.getAllSubject();
    }

    @Override
    public List<Subject> getSubjectPagination(String search, int pageIndex, int nrpp) {
        return subjectDao.subjectPagintion(search, pageIndex, nrpp);
    }

    @Override
    public int countAllSubjectPagination(String string) {
        return subjectDao.countAllFoundSubject(string);
    }

    @Override
    public List<Subject> getEnrollByUsername(String username, int pageIndex, int nrpp) {
        return subjectDao.getEnrollByUsernamePagination(username, pageIndex, nrpp);
    }

    @Override
    public int countEnrollByUsername(String username) {
        return subjectDao.countEnrollByUsername(username);
    }

    @Override
    public Subject getSubjectById(int id) {
        return subjectDao.getSubjectById(id);
    }
}
