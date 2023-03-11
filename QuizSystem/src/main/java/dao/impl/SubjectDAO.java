/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.ISubjectDAO;
import java.util.List;
import model.Subject;
import mapper.SubjectMapper;
import model.Account;
import utils.PageUtil;

/**
 *
 * @author Gib
 */
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
    public List<Subject> getAllSubjectByAccount(Account a) {
        String sql = "select * from Subject where idAuthor = ?";
        return query(sql, SubjectMapper.getInstance(), a.getUserName());
    }

    @Override
    public int addNewSubject(Subject subject) {
        String sql = "insert into Subject ([name], img, [description], publicDate, idAuthor) values (?, ?, ?, ?, ?) ";
        return insert(sql, subject.getName(), subject.getImg(), subject.getDescription(), subject.getPublicdate(), subject.getIdAuthor());
    }

    @Override
    public List<Subject> getSubjectById(String id) {
        String sql = "select * from Subject where id = ?";
        return query(sql, SubjectMapper.getInstance(), id);
    }

    @Override
    public void editSubject(Subject s) {
        String sql = "update Subject\n"
                + "set [name] = ?, img = ?, [description] = ?\n"
                + "where id = ?";
        update(sql, s.getName(), s.getImg(), s.getDescription(), s.getId());
    }

    @Override
    public void editPublic(String isPublic, String id) {
        String sql = "update Subject set isPublic = ? where id = ?";
        update(sql, isPublic, id);
    }

    @Override
    public int getNumberSubjectByUserName(String userName) {
        String sql = "select count(id)\n"
                + "from Subject where idAuthor = ?";
        return count(sql, userName);
    }

    @Override
    public List<Subject> getListSubjectAndNumberQuestionByUserName(String userName) {
        String sql = "select a.id, a.name, a.img, a.description, a.publicDate, a.idAuthor, a.isPublic, COUNT(q.id)\n"
                + "from Question q right join (select * \n"
                + "from Subject where idAuthor = ?) as a\n"
                + "on q.idSub = a.id\n"
                + "group by a.id, a.name, a.img, a.description, a.publicDate, a.idAuthor, a.isPublic";
        return query(sql, SubjectMapper.getInstance(), userName);
    }

    @Override
    public int getNumberStudentByIdAuthor(String userName) {
        String sql = "select COUNT(q.userName)\n"
                + "from Enroll q right join (select * \n"
                + "from Subject where idAuthor = ?) as a\n"
                + "on q.idSub = a.id";
        return count(sql, userName);
    }

    @Override
    public List<Subject> getAllSubjectAndNumberEnroll() {
        String sql = "select  id, Subject.[name], img, [description], publicDate, idAuthor, isPublic, count(idSub) as numberEnroll\n"
                + "                from Subject\n"
                + "                left join Enroll\n"
                + "                on Subject.id = Enroll.idSub\n"
                + "                group by id, Subject.[name], img, [description], publicDate, idAuthor, isPublic";
        return query(sql, SubjectMapper.getInstance());
    }

    @Override
    public List<Subject> getAllSubjectAndNumberEnrollBySearchAndUserName(PageUtil p) {
        String sql = "select  id, Subject.[name], img, [description], publicDate, idAuthor, isPublic, count(idSub) as numberEnroll\n"
                + "                               from Subject\n"
                + "                               left join Enroll\n"
                + "                               on Subject.id = Enroll.idSub\n"
                + "				  where name like ? and idAuthor = ?\n"
                + "                		  group by id, Subject.[name], img, [description], publicDate, idAuthor, isPublic\n"
                + "				  order by id asc\n"
                + "				  offset ? rows fetch next ? rows only";
        return query(sql, SubjectMapper.getInstance(), "%" + p.getSearch() + "%", p.getUserName(), p.getOffSet(), p.getNrpp());
    }

    @Override
    public int getNumberSubjectBySearchAndUserName(PageUtil p) {
        String sql = "select count(id)\n"
                + "from Subject where name like ? and idAuthor = ?";
        return count(sql, "%" + p.getSearch() + "%", p.getUserName());
    }

    @Override
    public List<Subject> findSubjectByName(String name) {
        String sql = "Select * from Subject where name = ?";
        return query(sql, SubjectMapper.getInstance(), name);
    }
    
    @Override
    public List<Subject> subjectPagintion_subName(String txt, int pageIndex, int nrpp) {
        String sql = "select Subject.* from Subject,\n"
                + "                Account\n"
                + "                where Subject.idAuthor = Account.userName\n"
                + "                    and isActive='True'\n"
                + "                    and Subject.isPublic = 'True'\n"
                + "                   and Subject.name like ?\n"
                + "                order by publicDate DESC\n"
                + "                OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        txt = "%" + txt + "%";
        return query(sql, SubjectMapper.getInstance(), txt, (pageIndex - 1) * nrpp, nrpp);
    }

    @Override
    public int count_subName(String txt) {
        String sql = "select Count(*) from Subject,\n"
                + "Account\n"
                + "                where Subject.idAuthor = Account.userName\n"
                + "                    and isActive='True'\n"
                + "                    and Subject.isPublic = 'True'\n"
                + "                   and Subject.name like ?";
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
                + "and Subject.isPublic = 1\n"
                + "order by Subject.publicDate desc\n"
                + "OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        return query(sql, SubjectMapper.getInstance(), string, (pageIndex - 1) * nrpp, nrpp);
    }

    @Override
    public int countEnrollByUsername(String username) {
        String sql = "select COUNT(*) from \n"
                + "	Subject right join\n"
                + "    (Select idSub from Enroll\n"
                + "	where Enroll.userName = ? ) as t1\n"
                + "on Subject.id = t1.idSub\n"
                + "	and Subject.isPublic = 1";
        return count(sql, username);
    }

    @Override
    public Subject getSubjectById(int id) {
        String sql = "select * from Subject where id = ?";
        return query(sql, SubjectMapper.getInstance(), id).get(0);
    }

    @Override
    public List<Subject> subjectPagination_Cate(String txt, int pageIndex, int nrpp) {
        String sql = "select distinct Subject.* from \n"
                + "	Subject,\n"
                + "    (select idSub from SubType\n"
                + "		where SubType.idCate = ?) as t1,\n"
                + "	Account\n"
                + "where\n"
                + "    Subject.id = t1.idSub\n"
                + "    and isPublic = 1 \n"
                + "	and Account.userName = Subject.idAuthor\n"
                + "    and Account.isActive = 1\n"
                + "order by publicDate DESC\n"
                + "OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
        return query(sql, SubjectMapper.getInstance(), txt, (pageIndex - 1) * nrpp, nrpp);
    }

    @Override
    public int count_Cate(String txt) {
        String sql = "select COUNT(*) from \n"
                + "	Subject,\n"
                + "    (select idSub from SubType\n"
                + "		where SubType.idCate = ?) as t1,\n"
                + "	Account\n"
                + "where\n"
                + "    Subject.id = t1.idSub\n"
                + "    and isPublic = 1 \n"
                + "	and Account.userName = Subject.idAuthor\n"
                + "    and Account.isActive = 1";
        return count(sql, txt);
    }
    
    @Override
    public List<Subject> getAllSubject() {
        String sql = "select * from Subject";
        return query(sql, SubjectMapper.getInstance());
    }

}
