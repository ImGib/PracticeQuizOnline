/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Answer;

/**
 *
 * @author Lenovo
 */
public interface IAnswerService {
    public void createNewAnswerForAQuess(int idQ, List<String> answer, String[] c);
    public List<Answer> getAnswerByIdQues(String id);
    public String checkAndUpdateAnswer(String idQ, String[] correctA, List<String> answer, List<String> idA);
}
