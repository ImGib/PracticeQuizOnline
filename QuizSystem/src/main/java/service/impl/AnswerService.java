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
 * @author Lenovo
 */
public class AnswerService implements IAnswerService {

    private final AnswerDao answerDao;

    private AnswerService() {
        answerDao = new AnswerDao();
    }

    private static AnswerService instance = null;

    public static AnswerService getInstance() {
        if (instance == null) {
            instance = new AnswerService();
        }
        return instance;
    }

    @Override
    public void createNewAnswerForAQuess(int idQ, List<String> answer, String[] c) {
        if (!answer.get(0).isEmpty()) {
            answerDao.addAnswer(idQ, answer.get(0), c[0].equals("answer1") ? "1" : "0");
        }
        if (!answer.get(1).isEmpty()) {
            answerDao.addAnswer(idQ, answer.get(1), c[0].equals("answer2") ? "1" : "0");
        }
        if (!answer.get(2).isEmpty()) {
            answerDao.addAnswer(idQ, answer.get(2), c[0].equals("answer3") ? "1" : "0");
        }
        if (!answer.get(3).isEmpty()) {
            answerDao.addAnswer(idQ, answer.get(3), c[0].equals("answer4") ? "1" : "0");
        }
    }

    @Override
    public List<Answer> getAnswerByIdQues(String id) {
        return answerDao.getAnswerByIdQues(id);
    }

    private void deleteAnswer(String id) {
        answerDao.deleteAnswer(id);
    }

    private void updateAnswer(String id, String answer, boolean isCorrect) {
        answerDao.updateAnswer(id, answer, isCorrect);
    }
    
    private void addAnswer(String idQ, String answer, boolean isCorrect){
        int id = Integer.parseInt(idQ);
        answerDao.addAnswer(id, answer, isCorrect ? "1" : "0");
    }

    private boolean checkDuplicateAnswer(List<String> a){
        int count;
        for (String s : a) {
            count = 0;
            for (String string : a) {
                if(s.equalsIgnoreCase(string) && !s.isEmpty()){
                    count++;
                }
                if(count == 2){
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public String checkAndUpdateAnswer(String idQ, String[] correctA,
            List<String> answer, List<String> idA) {
        int index = Integer.parseInt(correctA[0]);
        if (correctA.length != 1) {
            return "Please choose one correct answer!!!";
        }
        if(checkDuplicateAnswer(answer)){
            return "2 answer must be difficult!!";
        }
        for (int i = 0; i < 4; i++) {
            if (!idA.get(i).isEmpty()) {
                if (answer.get(i).isEmpty()) {
                    //delete
                    if (index == (i+1)) {
                        return "Correct answer can not be empty!!!";
                    }
                    deleteAnswer(idA.get(i));
                } else {
                    //update kiem tra lai correct A
                    updateAnswer(idA.get(i), answer.get(i), (index == (i+1)));
                }
            } else {
                if (!answer.get(i).isEmpty()) {
                    //add kiem tra correct A
                    addAnswer(idQ, answer.get(i), (index == (i + 1)));
                }else{
                    if (index == (i + 1)) {
                        return "Correct answer can not be empty!!!";
                    }
                }
            }
        }
        return null;
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
