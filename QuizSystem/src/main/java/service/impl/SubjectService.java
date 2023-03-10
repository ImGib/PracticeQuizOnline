/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import dao.impl.SubjectDAO;
import java.util.List;
import model.Account;
import model.Subject;
import service.ISubjectService;
import utils.PageUtil;

public class SubjectService implements ISubjectService {
    
    private SubjectDAO subjectDao;
    
    private SubjectService(){
        subjectDao = new SubjectDAO();
    }
    
    private static SubjectService instance = null;
    
    public static SubjectService getInstance(){
        if(instance == null){
            instance = new SubjectService();
        }
        return instance;
    }

    @Override
    public List<Subject> getTopThree() {
        List<Subject> list = subjectDao.getTopThree();
        if (list == null || list.isEmpty()) {
            return null;
        } else {
            return list;
        }
    }
    
    @Override
    public int getNumberSubject() {
        return subjectDao.getNumberSubject();
    }

    @Override
    public List<Subject> getAllSubjectByAccount(Account a) {
        return subjectDao.getAllSubjectByAccount(a);
    }
    
    @Override
    public List<Subject> getAllSubjectAndNumberEnoll() {
       return subjectDao.getAllSubjectAndNumberEnroll();
    }

    private List<Subject> findSubjectByName(String name){
        return subjectDao.findSubjectByName(name);
    }
    
    @Override
    public int createNewSubject(Subject s) {
        if(!findSubjectByName(s.getName()).isEmpty()){
            return -1;
        }
        return subjectDao.addNewSubject(s);
    }

    @Override
    public Subject getSubjectById(String id) {
        List<Subject> list = subjectDao.getSubjectById(id);
        return list.isEmpty() ? null : list.get(0);
    }

    @Override
    public void editSubject(Subject sbjct) {
        subjectDao.editSubject(sbjct);
    }

    @Override
    public void changePublic(boolean isPublic, String id) {
        subjectDao.editPublic(isPublic ? "0" : "1", id);
    }

    @Override
    public int getNumberSubjectByUserName(String userName) {
        return subjectDao.getNumberSubjectByUserName(userName);
    }

    @Override
    public List<Subject> getListSubjectAndNumberQuestionByUserName(String userName) {
        return subjectDao.getListSubjectAndNumberQuestionByUserName(userName);
    }

    @Override
    public int getNumberStudentByIdAuthor(String userName) {
        return subjectDao.getNumberStudentByIdAuthor(userName);
    }

    @Override
    public List<Subject> getAllSubjectAndNumberEnrollBySearchAndUserName(PageUtil p) {
        return subjectDao.getAllSubjectAndNumberEnrollBySearchAndUserName(p);
    }

    @Override
    public int getNumberSubjectBySearchAndUserName(PageUtil p) {
        return subjectDao.getNumberSubjectBySearchAndUserName(p);
    }
   
    
    
}
