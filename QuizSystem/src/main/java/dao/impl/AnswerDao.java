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
 * @author Lenovo
 */
public class AnswerDao extends AbstractDao<Answer> implements IAnswerDao{

    @Override
    public int addAnswer(int idQ, String answer, String isCorrect) {
        String sql = "insert into Answer(idQues, isCorrect, answer) values (?, ?, ?)";
        return insert(sql, idQ, isCorrect, answer);
    }

    @Override
    public List<Answer> getAnswerByIdQues(String id) {
        String sql = "select * from Answer where idQues = ?";
        return query(sql, new AnswerMapper(), id);
    }

    @Override
    public void deleteAnswer(String id) {
        String sql = "delete from Answer where idAns = ?";
        update(sql, id);
    }

    @Override
    public void updateAnswer(String id, String answer, boolean isCorrect) {
        String sql = "update Answer set answer = ?, isCorrect = ? where idAns = ?";
        update(sql, answer, isCorrect ? 1 : 0, id);
    }

    @Override
    public List<Answer> getAnswerByIdAns(String idAns) {
        String sql = "select * from Answer where idAns = ?";
        return query(sql, new AnswerMapper(), idAns);
    }
    
}
