/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.IQuestionDao;
import java.util.List;
import mapper.QuestionMapper;
import model.Question;
import utils.PageUtil;
import jakarta.servlet.DispatcherType;

/**
 *
 * @author Gib
 */
public class QuestionDao extends AbstractDao<Question> implements IQuestionDao {

    @Override
    public List<Question> getAllQuestionByUserName(PageUtil p) {
        String sql = "select q.id, q.idSub, q.question, s.name\n"
                + "from Question q join Subject s\n"
                + "on q.idSub = s.id where idAuthor = ? and q.isPublic = 1\n"
                + "order by q.id asc\n"
                + "offset ? rows fetch next ? rows only";
        return query(sql, new QuestionMapper(), p.getUserName(), p.getOffSet(), p.getNrpp());
    }

    @Override
    public int addNewQuestion(int idS, String question) {
        String sql = "insert into Question (idSub, question, isPublic) values (?, ?, ?) ";
        return insert(sql, idS, question, 1);

    }

    @Override
    public List<Question> getQuestionById(String id) {
        String sql = "select * from Question where id = ? and isPublic = 1";
        return query(sql, new QuestionMapper(), id);
    }

    @Override
    public int getNumberQuestionByUserName(String userName) {
        String sql = "select COUNT(q.id)\n"
                + "from Question q right join (select * \n"
                + "from Subject where idAuthor = ?) as a\n"
                + "on q.idSub = a.id where q.isPublic = 1";
        return count(sql, userName);
    }

    @Override
    public List<Question> getListQuestionBySearchAndUserName(PageUtil p) {
        String sql = "select q.id, q.idSub, q.question, a.name\n"
                + "from Question q join (select * \n"
                + "from Subject where idAuthor = ?) as a\n"
                + "on q.idSub = a.id\n"
                + "where q.question like ? and q.isPublic = 1\n"
                + "order by q.id asc\n"
                + "offset ? rows fetch next ? rows only";
        return query(sql, new QuestionMapper(), p.getUserName(),"%"+ p.getSearch() +"%", p.getOffSet(), p.getNrpp());

    }

    @Override
    public int getNumberQuestionBySearchAndUserName(PageUtil p) {
        String sql = "select COUNT(q.id)\n"
                + "from Question q join (select * \n"
                + "from Subject where idAuthor = ?) as a\n"
                + "on q.idSub = a.id\n"
                + "where q.question like ? and q.isPublic = 1";
        return count(sql, p.getUserName(),"%"+ p.getSearch()+"%");
    }

    @Override
    public List<Question> getListQuestionBySearchAndUserNameAndIdSub(PageUtil p) {
        String sql = "select q.id, q.idSub, q.question, a.name\n"
                + "from Question q join (select * \n"
                + "from Subject where idAuthor = ?) as a\n"
                + "on q.idSub = a.id\n"
                + "where q.idSub = ? and q.question like ? and q.isPublic = 1\n"
                + "order by q.id asc\n"
                + "offset ? rows fetch next ? rows only";
        return query(sql, new QuestionMapper(), p.getUserName(), p.getIdSub(),"%"+ p.getSearch() + "%", p.getOffSet(), p.getNrpp());
    }

    @Override
    public int getNumberQuestionBySearchAndUserNameAndIdSub(PageUtil p) {
        String sql = "select COUNT(q.id)\n"
                + "from Question q join (select * \n"
                + "from Subject where idAuthor = ?) as a\n"
                + "on q.idSub = a.id\n"
                + "where q.idSub = ? and q.question like ? and q.isPublic = 1";
        return count(sql, p.getUserName(), p.getIdSub(),"%"+ p.getSearch() +"%");
    }

    @Override
    public int getNumberQuestionByIdSubAndUserName(PageUtil p) {
        String sql = "select COUNT(q.id)\n"
                + "from Question q join (select * \n"
                + "from Subject where idAuthor = ?) as a\n"
                + "on q.idSub = a.id\n"
                + "where q.idSub = ? and q.isPublic = 1";
        return count(sql, p.getUserName(), p.getIdSub());
    }

    @Override
    public List<Question> getListQuestionByUserNameAndIdSub(PageUtil p) {
        String sql = "select q.id, q.idSub, q.question, a.name\n"
                + "from Question q join (select * \n"
                + "from Subject where idAuthor = ?) as a\n"
                + "on q.idSub = a.id\n"
                + "where q.idSub = ? and q.isPublic = 1\n"
                + "order by q.id asc\n"
                + "offset ? rows fetch next ? rows only";
        return query(sql, new QuestionMapper(),p.getUserName() , p.getIdSub(), p.getOffSet(), p.getNrpp());
    }

    @Override
    public void deleteQuestion(String id) {
        String sql = "update Question set isPublic = 0 where id = ?";
        update(sql, id);
    }

    @Override
    public void updateQuestion(String id, String q) {
        String sql = "update Question set question = ? where id = ?";
        update(sql, q, id);
    }
    public List<Question> getAllQuestionBySubId(int idSub) {
        String sql = "select * from Question, \n"
                + "	(select Question.id from Question,\n"
                + "		Answer\n"
                + "	where\n"
                + "		question.idSub = ?\n"
                + "		and question.isPublic=1\n"
                + "		and Answer.idQues = Question.id\n"
                + "		and Answer.answer != N''\n"
                + "	group by Question.id) as t1\n"
                + "where t1.id = Question.id";
        return query(sql, new QuestionMapper(), idSub);
    }
}
