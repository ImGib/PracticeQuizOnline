/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Gib
 */
public class Answer {

    private int idAns;
    private int idQues;
    private boolean isCorrect;
    private String answer;

    public Answer() {
    }

    public Answer(int idAns, int idQues, boolean isCorrect, String answer) {
        this.idAns = idAns;
        this.idQues = idQues;
        this.isCorrect = isCorrect;
        this.answer = answer;
    }

    public int getIdAns() {
        return idAns;
    }

    public void setIdAns(int idAns) {
        this.idAns = idAns;
    }

    public int getIdQues() {
        return idQues;
    }

    public void setIdQues(int idQues) {
        this.idQues = idQues;
    }

    public boolean isIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isChecked(List<String> answered) {
        for(String a : answered)
            if(a.equals(String.valueOf(this.getIdAns())))
                return true;
        return false;
        
    }

}
