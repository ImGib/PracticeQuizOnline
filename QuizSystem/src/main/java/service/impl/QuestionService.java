/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import dao.impl.QuestionDao;
import dao.impl.SubjectDAO;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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

    @Override
    public List<Question> getRandomQuestion(int n, int idSub) {
        List<Question> list = questionDao.getAllQuestionBySubId(idSub);
        Random rand = new Random();
 
        // create a temporary list for storing
        // selected element
        List<Question> newList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
 
            // take a random index between 0 to size
            // of given List
            int randomIndex = rand.nextInt(list.size());
 
            // add element in temporary list
            newList.add(list.get(randomIndex));
 
            // Remove selected element from original list
            list.remove(randomIndex);
        }
        return newList;
    }

}
