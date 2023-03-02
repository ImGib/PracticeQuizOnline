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
        String sql = "select Question.* from Question\n"
                + "where idSub = ?";
        return query(sql, new QuestionMapper(), idSub);
    }

}
