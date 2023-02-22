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
        return query(sql, SubjectMapper.getInstance());
    }

    @Override
    public int getNumberSubject() {
        String sql = "select count(id)\n"
                + "from Subject";
        return count(sql);
    }

    @Override
    public List<Subject> getAllSubject() {
        String sql = "select * from Subject";
        return query(sql, SubjectMapper.getInstance());
    }

    @Override
    public List<Subject> getAllSubjectAndNumberEnroll() {
        String sql = "select  id, Subject.[name], count(id) as numberEnroll\n"
                + "from Subject\n"
                + "inner join Enroll\n"
                + "on Subject.id = Enroll.idSub\n"
                + "group by id, Subject.[name]";
        return query(sql, SubjectMapper.getInstance());// chưa xong
    }

}
