/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.Question;

/**
 *
 * @author Gib
 */
public interface IQuestionServive {
    List<Question> getAllQuestionBySubId(int subId);
}
