/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package daoTest;

import dao.impl.AnswerDao;
import model.Answer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class AnswerDaoTest {
    
    public AnswerDaoTest() {
    }
    
    private AnswerDao answerDao = new AnswerDao();
    
    //@Test
    public void testAddNewAnswer(){
        int idQuestion = 14;
        String answer = "heeeeee";
        String isCorrect = "0";
        int expected = -1;
        int actual = answerDao.addAnswer(idQuestion, answer, isCorrect);
        assertNotEquals(expected, actual);
    }
    
    @Test
    public void testGetListAnswerByIdQuestionWithIdExistReturnWell(){
        String idQuestion = "1";
        boolean expected = false;
        boolean actual = answerDao.getAnswerByIdQues(idQuestion).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetListAnswerByQuestionIdWithIdNotExistReturnFalse(){
        String idQuestion = "133333";
        boolean expected = true;
        boolean actual = answerDao.getAnswerByIdQues(idQuestion).isEmpty();
        assertEquals(expected, actual);
    }
    
    //@Test
    public void testDeleteAnswerById(){
        String idAns = "1";
        boolean expected = true;
        answerDao.deleteAnswer(idAns);
        boolean actual = answerDao.getAnswerByIdAns(idAns).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetAnswerByIdWithIdExist(){
        String id = "2";
        boolean expected = false;
        boolean actual = answerDao.getAnswerByIdAns(id).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetAnswerByIdWithIdNotExist(){
        String id = "2222";
        boolean expected = true;
        boolean actual = answerDao.getAnswerByIdAns(id).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUpdateAnswer(){
        String id = "2";
        String newAnswer = "hello";
        boolean isCorrect = false;
        answerDao.updateAnswer(id, newAnswer, isCorrect);
        Answer a = answerDao.getAnswerByIdAns(id).get(0);
        assertEquals(newAnswer, a.getAnswer());
    }
}
