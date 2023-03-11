/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package daoTest;

import dao.impl.SubjectDAO;
import model.Subject;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.PageUtil;

/**
 *
 * @author Lenovo
 */
public class SubjectDaoTest {
    
    public SubjectDaoTest() {
    }
    
    private SubjectDAO s = new SubjectDAO();
    
    @Test
    public void testGetNumberSubject(){
        boolean expected = true;
        boolean actual = s.getNumberSubject() > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetAllSubject(){
        boolean expected = false;
        boolean actual = s.getAllSubject().isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetAllSubjectAndNumberEnroll(){
        boolean expected = false;
        boolean actual = s.getAllSubjectAndNumberEnroll().isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test(expected = Exception.class)
    public void testAddNewSubjectWithTrue(){
        Subject sub = null;
        s.addNewSubject(sub);
    }
    
    //@Test
    public void tesAddNewSubjectWithTrue(){
        Subject sub = new Subject();
        sub.setName("pprrs");
        sub.setImg("sdfsdf");
        sub.setDescription("ddfsdf");
        sub.setPublicdate("3/5/2023");
        sub.setIdAuthor("dinson");
        boolean expected = true;
        boolean actual = s.addNewSubject(sub) != -1;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetSubjectByIdWithTrueId(){
        String id = "1";
        boolean expected = false;
        boolean actual = s.getSubjectById(id).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetSubjectByIdWithIdNotExist(){
        String id = "1223";
        boolean expected = true;
        boolean actual = s.getSubjectById(id).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberSubjectByUserNameWithTrue(){
        String userName = "dinson";
        boolean expected = true;
        boolean actual = s.getNumberSubjectByUserName(userName) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberSubjectByUserNameWithUsernameNotExist(){
        String userName = "dinsdfsdf3son";
        boolean expected = false;
        boolean actual = s.getNumberSubjectByUserName(userName) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetListSubjectAndNumberQuestionByUserNameWithTrue(){
        String userName = "dinson";
        boolean expected = false;
        boolean actual = s.getListSubjectAndNumberQuestionByUserName(userName).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetListSubjectAndNumberQuestionByUserNameWithUsernameNotExist(){
        String userName = "dinsfsdf3on";
        boolean expected = true;
        boolean actual = s.getListSubjectAndNumberQuestionByUserName(userName).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberStudentByIdAuthorWithTrue(){
        String userName = "dinson";
        boolean expected = true;
        boolean actual = s.getNumberStudentByIdAuthor(userName) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberStudentByIdAuthorWithUsernameNotExist(){
        String userName = "dinsdsfsdfon";
        boolean expected = false;
        boolean actual = s.getNumberStudentByIdAuthor(userName) > 0;
        assertEquals(expected, actual);
    }
    
    private PageUtil p = new PageUtil(1, 6, 12, "s", "dinson", 1);
    
    @Test
    public void testGetAllSubjectAndNumberEnrollBySearchAndUserNameWithTrue(){
        boolean expected = false;
        boolean actual = s.getAllSubjectAndNumberEnrollBySearchAndUserName(p).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetAllSubjectAndNumberEnrollBySearchAndUserNameWithUsernameWrong(){
        p.setUserName("dsfsdf33");
        boolean expected = true;
        boolean actual = s.getAllSubjectAndNumberEnrollBySearchAndUserName(p).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetAllSubjectAndNumberEnrollBySearchAndUserNameWithSearchWrong(){
        p.setUserName("dinson");
        p.setSearch("sdfsdf3434");
        boolean expected = true;
        boolean actual = s.getAllSubjectAndNumberEnrollBySearchAndUserName(p).isEmpty();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberSubjectBySearchAndUserNameWithTrue(){
        p.setUserName("dinson");
        p.setSearch("s");
        boolean expected = true;
        boolean actual = s.getNumberSubjectBySearchAndUserName(p) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberSubjectBySearchAndUserNameWithUsernameWrong(){
        p.setUserName("sdfsdf332432");
        p.setSearch("s");
        boolean expected = false;
        boolean actual = s.getNumberSubjectBySearchAndUserName(p) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetNumberSubjectBySearchAndUserNameWithSearchWrong(){
        p.setUserName("dinson");
        p.setSearch("s213213");
        boolean expected = false;
        boolean actual = s.getNumberSubjectBySearchAndUserName(p) > 0;
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGetTopThreeWithEixtingValue(){
        boolean expected = false;
        boolean actual = s.getTopThree().isEmpty();
        assertEquals(expected, actual);
    }
}
