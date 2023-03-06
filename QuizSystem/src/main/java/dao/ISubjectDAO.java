/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.Subject;

public interface ISubjectDAO extends GenericDao<Subject> {

    List<Subject> getTopThree();

    public int getNumberSubject();

    public List<Subject> getAllSubject();

    public List<Subject> subjectPagintion_subName(String txt, int pageIndex, int nrpp);

    public int count_subName(String txt);

    public List<Subject> subjectPagination_Cate(String txt, int pageIndex, int nrpp);

    public int count_Cate(String txt);

    public List<Subject> getAllSubjectAndNumberEnroll();

    List<Subject> getEnrollByUsernamePagination(String username, int pageIndex, int nrpp);

    int countEnrollByUsername(String username);

    Subject getSubjectById(int id);
}
