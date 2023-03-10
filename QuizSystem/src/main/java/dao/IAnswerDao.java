/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Answer;

/**
 *
 * @author Gib
 */
public interface IAnswerDao extends GenericDao<Answer>{
    List<Answer> getAnswerByIdQues(int id);
    List<Answer> getTrueAnswer(int idQues);
}
