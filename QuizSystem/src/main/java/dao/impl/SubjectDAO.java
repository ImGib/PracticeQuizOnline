/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.ISubjectDAO;
import java.util.List;
import model.Subject;
import mapper.SubjectMapper;

/**
 *
 * @author Gib
 */
public class SubjectDAO extends AbstractDao<Subject> implements ISubjectDAO{

    @Override
    public List<Subject> getTopThree() {
        String sql = "select top 3 * from Subject\n" +
                "order by publicDate desc";
        return query(sql, new SubjectMapper());
    }
    
    public static void main(String[] args) {
        SubjectDAO sd = new SubjectDAO();
        List<Subject> list = sd.getTopThree();
        for(Subject s : list){
            System.out.println(s.getId() + " " + s.getName() + " " + s.getPublicdate());
        }
    }
}
