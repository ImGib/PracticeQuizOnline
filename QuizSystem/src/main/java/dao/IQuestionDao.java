/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.List;
import model.Question;
import utils.PageUtil;

/**
 *
 * @author Lenovo
 */
public interface IQuestionDao extends GenericDao<Question>{
    public List<Question> getAllQuestionByUserName(PageUtil p);
    
    public int addNewQuestion(int idS, String question);
    
    public List<Question> getQuestionById(String id);
    
    public int getNumberQuestionByUserName(String userName);
    
    public List<Question> getListQuestionBySearchAndUserName(PageUtil p);
    
    public List<Question> getListQuestionBySearchAndUserNameAndIdSub(PageUtil p);
    
    public List<Question> getListQuestionByUserNameAndIdSub(PageUtil p);
    
    public int getNumberQuestionBySearchAndUserName(PageUtil p);
    
    public int getNumberQuestionByIdSubAndUserName(PageUtil p);
    
    public int getNumberQuestionBySearchAndUserNameAndIdSub(PageUtil p);
    
    public void deleteQuestion(String id);
    
    public void updateQuestion(String id, String q);
}
