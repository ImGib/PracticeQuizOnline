/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import service.impl.AnswerService;

/**
 *
 * @author Lenovo
 */
public class Question {
    private int id;
    private int inSub;
    private String question;
    private String subject;

    public Question() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInSub() {
        return inSub;
    }

    public void setInSub(int inSub) {
        this.inSub = inSub;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    
    public List<Answer> allAnswer() {
        List<Answer> answers = AnswerService.getInstance().getAnswerByIdQues(this.id);
        return answers;
    }

    public Answer rightAnswer() {
        Answer ans = AnswerService.getInstance().getRightAns(this.id);
        return ans;
    }


    public boolean checkAnswer(List<String> answered) {
        System.out.println("checkanswer");
        for (String a : answered) {
            System.out.println(a + " ---- " + String.valueOf(rightAnswer().getIdAns()));
            
            if (a.equalsIgnoreCase(String.valueOf(rightAnswer().getIdAns()))) {
                return true;
            }
        }
        return false;
    }
    
    
}
