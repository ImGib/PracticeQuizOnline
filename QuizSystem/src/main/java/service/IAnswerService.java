/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Answer;

/**
 *
 * @author Gib
 */
public interface IAnswerService{
    List<Answer> getAnswerByIdQues(int idQues);
    Answer getRightAns(int idQues);
}
