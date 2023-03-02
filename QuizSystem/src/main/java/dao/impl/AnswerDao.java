/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao.impl;

import dao.IAnswerDao;
import java.util.List;
import mapper.AnswerMapper;
import model.Answer;

/**
 *
 * @author Gib
 */
public class AnswerDao extends AbstractDao<Answer> implements IAnswerDao {

    @Override
    public List<Answer> getAnswerByIdQues(int id) {
        String sql = "select Answer.* from Answer\n"
                + "where idQues = ?";
        return query(sql, new AnswerMapper(), id);
    }

    @Override
    public List<Answer> getTrueAnswer(int i) {
        String sql = "select Answer.* from Answer\n"
                + "where idQues = ? and isCorrect = 1";
        return query(sql, new AnswerMapper(), i);
    }

}
