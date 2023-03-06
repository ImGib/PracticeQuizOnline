/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package daoTest;

import dao.impl.QuestionDao;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.PageUtil;

/**
 *
 * @author Lenovo
 */
public class QuestionDaoTest {
    
    public QuestionDaoTest() {
    }
    
    
    private QuestionDao q = new QuestionDao();
    private PageUtil p = new PageUtil(1, 6, 12, "hello", "dinson", 1);
    
    //@Test(expected = Exception.class)
    public void testGetAllQuestionByUserNameWithNull(){
        PageUtil pg = null;
        q.getAllQuestionByUserName(pg);
    }
    
    //@Test
    public void testGetAllQuestionByUserNameWithTrueData(){
        boolean expected = false;
        boolean actual = q.getAllQuestionByUserName(p).isEmpty();
        assertEquals(expected, actual);
    }
    
    //@Test
    public void testGetAllQuestionByUserNameWithUsernameNotExist(){
        p.setUserName("fsdfsdfds");
        boolean expected = true;
        boolean actual = q.getAllQuestionByUserName(p).isEmpty();
        assertEquals(expected, actual);
    }
    
    //@Test
    public void testAddNewQuestion(){
        int idSubject = 1;
        String question = "what is your name?";
        boolean expected = true;
        boolean actual = q.addNewQuestion(idSubject, question) != -1;
        assertEquals(expected, actual);
    }
    
    //@Test
    public void testAddNewQuestionWithIdSubjectNotExist(){
        int idSubject = 12222;
        String question = "what is your name?";
        boolean expected = true;
        boolean actual = q.addNewQuestion(idSubject, question) == -1;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetQuestionByIdWithIdExist(){
        String id = "4";
        boolean expected = false;
        boolean actual = q.getQuestionById(id).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetQuestionByIdWithIdNotExist(){
        String id = "4222";
        boolean expected = true;
        boolean actual = q.getQuestionById(id).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberQuestionByUsernameWithUsernameExist(){
        String userName = "dinson";
        boolean expected = true;
        boolean actual = q.getNumberQuestionByUserName(userName) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberQuestionByUsernameWithUsernameNotExist(){
        String userName = "ddddinson";
        boolean expected = false;
        boolean actual = q.getNumberQuestionByUserName(userName) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetListQuestionBySearchAndUserNameWithTrueData(){
        p.setUserName("dinson");
        p.setSearch("s");
        boolean expected = false;
        boolean actual = q.getListQuestionBySearchAndUserName(p).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetListQuestionBySearchAndUserNameWithSearchNotExist(){
        p.setUserName("dinson");
        p.setSearch("nguyen dinhhhhh son");
        boolean expected = true;
        boolean actual = q.getListQuestionBySearchAndUserName(p).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetListQuestionBySearchAndUserNameWithUsernameNotExist(){
        p.setUserName("ddddinson");
        p.setSearch("s");
        boolean expected = true;
        boolean actual = q.getListQuestionBySearchAndUserName(p).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetListQuestionBySearchAndUserNameAndIdSubWithDataTrue(){
        p.setIdSub(1);
        p.setSearch("s");
        p.setUserName("dinson");
        boolean expected = false;
        boolean acutal = q.getListQuestionBySearchAndUserNameAndIdSub(p).isEmpty();
        assertEquals(expected, acutal);
    }
    
    @Test
    public void testGetListQuestionBySearchAndUserNameAndIdSubWithSearchNotExist(){
        p.setIdSub(1);
        p.setSearch("s111123 dio");
        p.setUserName("dinson");
        boolean expected = true;
        boolean acutal = q.getListQuestionBySearchAndUserNameAndIdSub(p).isEmpty();
        assertEquals(expected, acutal);
    }
    
    @Test
    public void testGetListQuestionBySearchAndUserNameAndIdSubWithUsernameNotExist(){
        p.setIdSub(1);
        p.setSearch("s");
        p.setUserName("dinsdfdsfsdon");
        boolean expected = true;
        boolean acutal = q.getListQuestionBySearchAndUserNameAndIdSub(p).isEmpty();
        assertEquals(expected, acutal);
    }
    
    @Test
    public void testGetListQuestionBySearchAndUserNameAndIdSubWithIsDubNotExist(){
        p.setIdSub(1333);
        p.setSearch("s");
        p.setUserName("dinson");
        boolean expected = true;
        boolean acutal = q.getListQuestionBySearchAndUserNameAndIdSub(p).isEmpty();
        assertEquals(expected, acutal);
    }
    
    @Test
    public void testGetListQuestionByUserNameAndIdSubWithDataTrue(){
        p.setIdSub(1);
        p.setUserName("dinson");
        boolean expected = false;
        boolean actual = q.getListQuestionByUserNameAndIdSub(p).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetListQuestionByUserNameAndIdSubWithIdSubWrong(){
        p.setIdSub(12122);
        p.setUserName("dinson");
        boolean expected = true;
        boolean actual = q.getListQuestionByUserNameAndIdSub(p).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetListQuestionByUserNameAndIdSubWithUsenameWrong(){
        p.setIdSub(1);
        p.setUserName("dinsddddddon");
        boolean expected = true;
        boolean actual = q.getListQuestionByUserNameAndIdSub(p).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberQuestionBySearchAndUserNameWithDataTrue(){
        p.setSearch("s");
        p.setUserName("dinson");
        boolean expected = true;
        boolean actual = q.getNumberQuestionBySearchAndUserName(p) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberQuestionBySearchAndUserNameWithSearchWrong(){
        p.setSearch("1234s");
        p.setUserName("dinson");
        boolean expected = false;
        boolean actual = q.getNumberQuestionBySearchAndUserName(p) > 0;
        assertEquals(expected, actual);
    }
    
    @Test 
    public void testGetNumberQuestionBySearchAndUserNameWithUsernameWrong(){
        p.setSearch("s");
        p.setUserName("dindd333son");
        boolean expected = false;
        boolean actual = q.getNumberQuestionBySearchAndUserName(p) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberQuestionByIdSubAndUserNameWithDataTrue(){
        p.setIdSub(1);
        p.setUserName("dinson");
        boolean expected = true;
        boolean actual = q.getNumberQuestionByIdSubAndUserName(p) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberQuestionByIdSubAndUserNameWithIdSubWrong(){
        p.setIdSub(12222);
        p.setUserName("dinson");
        boolean expected = false;
        boolean actual = q.getNumberQuestionByIdSubAndUserName(p) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberQuestionByIdSubAndUserNameWithUsenameWrong(){
        p.setIdSub(1);
        p.setUserName("dinsdddd3on");
        boolean expected = false;
        boolean actual = q.getNumberQuestionByIdSubAndUserName(p) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberQuestionBySearchAndUserNameAndIdSubWithDataTrue(){
        p.setIdSub(1);
        p.setUserName("dinson");
        p.setSearch("s");
        boolean expected = true;
        boolean actual = q.getNumberQuestionBySearchAndUserNameAndIdSub(p) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberQuestionBySearchAndUserNameAndIdSubWithIdSubWrong(){
        p.setIdSub(1111);
        p.setUserName("dinson");
        p.setSearch("s");
        boolean expected = false;
        boolean actual = q.getNumberQuestionBySearchAndUserNameAndIdSub(p) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberQuestionBySearchAndUserNameAndIdSubWithUsernameWrong(){
        p.setIdSub(1);
        p.setUserName("dindddd3son");
        p.setSearch("s");
        boolean expected = false;
        boolean actual = q.getNumberQuestionBySearchAndUserNameAndIdSub(p) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberQuestionBySearchAndUserNameAndIdSubWithSearchWrong(){
        p.setIdSub(1);
        p.setUserName("dinson");
        p.setSearch("sdsfsd3334");
        boolean expected = false;
        boolean actual = q.getNumberQuestionBySearchAndUserNameAndIdSub(p) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testDeleteQuestion(){
        String id = "1";
        q.deleteQuestion(id);
        boolean expected = true;
        boolean actual = q.getQuestionById(id).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testUpdateQuestion(){
        String id = "2";
        String question = "what is your name";
        q.updateQuestion(id, question);
        String actual = q.getQuestionById(id).get(0).getQuestion();
        assertEquals(question, actual);
    }
}
