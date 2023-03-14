/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import dao.impl.QuestionDao;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.Question;
import service.IQuestionService;
import utils.PageUtil;


public class QuestionService implements IQuestionService {

    private QuestionDao questionDao;

    private QuestionService() {
        questionDao = new QuestionDao();
    }

    private static QuestionService instance = null;

    public static QuestionService getInstance() {
        if (instance == null) {
            instance = new QuestionService();
        }
        return instance;
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
    public String createNewQuestion(int idSub, String q, List<String> answer, String[] c) {
        if (idSub == 0) {
            return "Please choose subject of question!";
        }
        if (c == null || c.length != 1) {
            return "Please choose 1 correct answer!";
        }
        if ((answer.get(0).isEmpty() && c[0].equals("answer1"))
                || (answer.get(1).isEmpty() && c[0].equals("answer2"))
                || (answer.get(2).isEmpty() && c[0].equals("answer3"))
                || (answer.get(3).isEmpty() && c[0].equals("answer4"))) {
            return "The correct answer must not be empty!";
        }
        if(checkDuplicateAnswer(answer)){
            return "2 answer must be difficult!!";
        }
        int id = questionDao.addNewQuestion(idSub, q);
        return id + "";
    }

    @Override
    public Question getQuestionById(String id) {
        List<Question> list = questionDao.getQuestionById(id);
        return (Question) (list.isEmpty() ? "null" : list.get(0));
    }

    @Override
    public int getNumberQuestionByUserName(String userName) {
        return questionDao.getNumberQuestionByUserName(userName);
    }

    @Override
    public List<Question> findAll(PageUtil p) {
        if (p.getIdSub() > 0) {
            if ("".equals(p.getSearch())) {
                return questionDao.getListQuestionByUserNameAndIdSub(p);
            } else {
                return questionDao.getListQuestionBySearchAndUserNameAndIdSub(p);
            }
        } else {
            if (p.getSearch() == "") {
                return questionDao.getAllQuestionByUserName(p);
            } else {
                return questionDao.getListQuestionBySearchAndUserName(p);
            }
        }
    }

    @Override
    public int getNumberQuestionByAll(PageUtil p) {
        if (p.getIdSub() > 0) {
            if (p.getSearch() == "") {
                return questionDao.getNumberQuestionByIdSubAndUserName(p);
            } else {
                return questionDao.getNumberQuestionBySearchAndUserNameAndIdSub(p);
            }
        } else {
            if (p.getSearch() == "") {
                return questionDao.getNumberQuestionByUserName(p.getUserName());
            } else {
                return questionDao.getNumberQuestionBySearchAndUserName(p);
            }
        }
    }

    @Override
    public void deleteQuestion(String id) {
        questionDao.deleteQuestion(id);
    }
    

    @Override
    public void updateQuestion(String idQ, String q) {
        questionDao.updateQuestion(idQ, q);
    }

    @Override
    public List<Question> getAllQuestionBySubId(int subId) {
        return questionDao.getAllQuestionBySubId(subId);
    }

    @Override
    public List<Question> getRandomQuestion(int n, int idSub) {
        List<Question> list = questionDao.getAllQuestionBySubId(idSub);
        Random rand = new Random();
        
        List<Question> newList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int randomIndex = rand.nextInt(list.size());
 
            newList.add(list.get(randomIndex));
 
            list.remove(randomIndex);
        }
        return newList;
    }

}
