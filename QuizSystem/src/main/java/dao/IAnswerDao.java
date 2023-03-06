/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.Answer;

/**
 *
 * @author Lenovo
 */
public interface IAnswerDao extends GenericDao<Answer>{
    public int addAnswer(int idQ, String isCorrect, String answer);
    
    public List<Answer> getAnswerByIdQues(String id);
    
    public List<Answer> getAnswerByIdAns(String idAns);
    
    public void deleteAnswer(String id);
    
    public void updateAnswer(String id, String answer, boolean isCorrect);
}
