/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import dao.impl.AbstractDao;
import dao.impl.QuestionDao;
import java.util.List;
import model.Question;
import utils.PageUtil;
/**
 *
 * @author Gib
 */
public class Test {
    public static void main(String[] args) {
        QuestionDao q = new QuestionDao();
        PageUtil p = new PageUtil();
        p.setIndex(1);
        p.setSearch("s");
        p.setNrpp(6);
        p.setUserName("dinson");
        List<Question> list = q.getListQuestionBySearchAndUserName(p);
        for (Question question : list) {
            System.out.println(question.getQuestion());
        }
    }
}
