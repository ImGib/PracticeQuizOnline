/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Question;
import utils.PageUtil;

/**
 *
 * @author Lenovo
 */
public interface IQuestionService {
    public String createNewQuestion(int idSub, String q, List<String> answer, String[] c);
    public Question getQuestionById(String id);
    public int getNumberQuestionByUserName(String userName);
    public List<Question> findAll(PageUtil p);
    public int getNumberQuestionByAll(PageUtil p);
    public void deleteQuestion(String id);
    public void updateQuestion(String idQ, String q);
}
