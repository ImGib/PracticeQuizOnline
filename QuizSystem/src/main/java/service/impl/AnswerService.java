/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import dao.impl.AnswerDao;
import dao.impl.SubjectDAO;
import java.util.List;
import model.Answer;
import service.IAnswerService;

/**
 *
 * @author Gib
 */
public class AnswerService implements IAnswerService{

    private AnswerDao answerDao;
    
    private AnswerService(){
        answerDao = new AnswerDao();
    }
    
    public static AnswerService instance = null;
    
    public static AnswerService getInstance(){
        if(instance == null){
            instance = new AnswerService();
        }
        return instance;
    }
    
    @Override
    public List<Answer> getAnswerByIdQues(int idQues) {
        return answerDao.getAnswerByIdQues(idQues);
    }

    @Override
    public Answer getRightAns(int i) {
        List<Answer> ansList= answerDao.getAnswerByIdQues(i);
        if(ansList == null || ansList.isEmpty()) return null;
        return ansList.get(0);
    }
    
}
