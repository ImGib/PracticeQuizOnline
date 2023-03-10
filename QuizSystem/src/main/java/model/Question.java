/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import service.impl.AnswerService;

/**
 *
 * @author Gib
 */
public class Question {

    private int id;
    private int idSub;
    private String question;
    private boolean isPublic;

    public Question() {
    }

    public Question(int id, int idSub, String question, boolean isPublic) {
        this.id = id;
        this.idSub = idSub;
        this.question = question;
        this.isPublic = isPublic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSub() {
        return idSub;
    }

    public void setIdSub(int idSub) {
        this.idSub = idSub;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isIsPublic() {
        return isPublic;
    }

    public void setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }

    public List<Answer> allAnswer() {
        List<Answer> answers = AnswerService.getInstance().getAnswerByIdQues(this.id);
        return answers;
    }

    public Answer rightAnswer() {
        Answer ans = AnswerService.getInstance().getRightAns(this.id);
        return ans;
    }

    @Override
    public String toString() {
        return "Question{" + "id=" + id + ", idSub=" + idSub + ", question=" + question + ", isPublic=" + isPublic + '}';
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
