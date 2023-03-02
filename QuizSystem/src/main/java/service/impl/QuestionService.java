/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import dao.impl.QuestionDao;
import dao.impl.SubjectDAO;
import java.util.List;
import model.Question;
import service.IQuestionServive;

/**
 *
 * @author Gib
 */
public class QuestionService implements IQuestionServive {

    private QuestionDao questionDao;

    private QuestionService() {
        questionDao = new QuestionDao();
    }

    public static QuestionService instance = null;

    public static QuestionService getInstance() {
        if (instance == null) {
            instance = new QuestionService();
        }
        return instance;
    }

    @Override
    public List<Question> getAllQuestionBySubId(int subId) {
        return questionDao.getAllQuestionBySubId(subId);
    }

}
