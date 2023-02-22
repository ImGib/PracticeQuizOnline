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

    private SubjectDAO subjectDAO;

    public SubjectService() {
        subjectDAO = new SubjectDAO();
    }

    private static SubjectService instance = null;

    public static SubjectService getInstance() {
        if (instance == null) {
            instance = new SubjectService();
        }
        return instance;
    }

    @Override
    public List<Subject> getTopThree() {
        List<Subject> list = subjectDAO.getTopThree();
        if (list == null || list.isEmpty()) {
            return null;
        } else {
            return list;
        }
    }
}
