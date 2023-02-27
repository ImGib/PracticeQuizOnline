/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.ISubjectDAO;
import java.util.List;
import model.Subject;
import mapper.SubjectMapper;

public class SubjectDAO extends AbstractDao<Subject> implements ISubjectDAO {

    @Override
    public List<Subject> getTopThree() {
        String sql = "select top 3 Subject.* from\n"
                + "	Subject,\n"
                + "	Account\n"
                + "where Subject.idAuthor = Account.userName and isActive='True' and Subject.isPublic = 'True'\n"
                + "order by publicDate DESC";
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

    @Override
    public List<Subject> subjectPagintion(String txt, int pageIndex, int nrpp) {
        String sql = "select Subject.* from Subject,\n" +
"                Account\n" +
"                where Subject.idAuthor = Account.userName\n" +
"                		and isActive='True'\n" +
"                		and Subject.isPublic = 'True'\n" +
"                        and Subject.name like ?\n" +
"                order by publicDate DESC\n" +
"                OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        txt = "%" + txt + "%";
        return query(sql, SubjectMapper.getInstance(), txt, (pageIndex - 1) * nrpp, nrpp);
    }

    @Override
    public int countAllFoundSubject(String txt) {
        String sql = "select count(*) from Subject,\n"
                + "Account\n"
                + "where Subject.idAuthor = Account.userName \n"
                + "		and isActive = 'True' \n"
                + "		and Subject.isPublic = 'True'\n"
                + "        and Subject.name like ?";
        txt = "%" + txt + "%";
        return count(sql, txt);
    }

    @Override
    public List<Subject> getEnrollByUsernamePagination(String string, int pageIndex, int nrpp) {
        String sql = "select Subject.* from \n"
                + "	Subject right join\n"
                + "	(Select idSub from Enroll\n"
                + "	where Enroll.userName = ?) as t1\n"
                + "on Subject.id = t1.idSub\n"
                + "order by Subject.publicDate desc\n"
                + "OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        return query(sql, SubjectMapper.getInstance(), string, (pageIndex - 1) * nrpp, nrpp);
    }

    @Override
    public int countEnrollByUsername(String username) {
        String sql = "select count(*) from Subject\n"
                + "where Subject.name like ?";
        username = "%" + username + "%";
        return count(sql, username);
    }

}
