/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.IQuestionDao;
import jakarta.servlet.DispatcherType;
import java.util.List;
import mapper.QuestionMapper;
import model.Question;

/**
 *
 * @author Gib
 */
public class QuestionDao extends AbstractDao<Question> implements IQuestionDao {

    @Override
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

    @Override
    public List<Question> getRandomQuestion(int n, int idSub) {
        String sql = "select TOP ? * from Question\n"
                + "where\n"
                + "    question.idSub = ?\n"
                + "	and question.isPublic = 1\n";
        return query(sql, new QuestionMapper(), n, idSub);
    }

}
