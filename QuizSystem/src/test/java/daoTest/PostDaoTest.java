/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoTest;

import dao.impl.PostDao;
import model.Post;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author asus
 */
public class PostDaoTest {
    PostDao postDao=new PostDao();
    Post p=new Post(999, "title", "2023-01-01", "", "", "linhchi", 1);
    
    @Test
    public void getTopTwo_Test(){
        int actual= postDao.getTopTwo().size();
        assertTrue(actual<=2);
    }
    
//    @Test
//    public void getNumberPost_Test(){
//        
//    }
    @Test
    public void findPostByTitleAndAuthor_TestFindByTitle(){
        p.setTittle("test1234");
        postDao.addNewPost(p);
        
        String actual=postDao.findPostByTitleAndAuthor(p.getTittle()).get(0).getTittle();
        postDao.deletePost(postDao.getLastIdPost());
        assertEquals(p.getTittle(), actual);
    }
    @Test
    public void findPostByTitleAndAuthor_TestFindByAuthor(){
        p.setIdAuthor("linhchi");
        postDao.addNewPost(p);
        
        int actual=postDao.findPostByTitleAndAuthor(p.getIdAuthor()).size();
        postDao.deletePost(postDao.getLastIdPost());
        assertNotSame(0, actual);
    }
    
    @Test  
    public void addNewPost_Test(){
        
        
        postDao.addNewPost(p);
        int actual=postDao.findPostById(postDao.getLastIdPost()).size();
        postDao.deletePost(postDao.getLastIdPost());
        assertNotSame(0, actual);
        
    }
    @Test
    public void findPostById_Test(){
        
        
        postDao.addNewPost(p);
        
        int actual=postDao.findPostById(postDao.getLastIdPost()).size();
        postDao.deletePost(postDao.getLastIdPost());
        assertNotSame(0, actual);
    }
    @Test
    public void findPostByTitle_Test(){
        p.setTittle("test123123123");
        String expected=p.getTittle();
        postDao.addNewPost(p);
        
        String actual=postDao.findPostByTitle(p.getTittle()).get(0).getTittle();
        postDao.deletePost(postDao.getLastIdPost());
        assertEquals(expected, actual);
    }
    @Test 
    public void findPostByTextAndPagination_Test(){
        int actual=postDao.findPostByTextAndPagination("", 1, 4).size();
        assertTrue(actual<=4);
    }
    @Test
    public void editPost_TestEditImg(){
        postDao.addNewPost(p);
        postDao.editPost(postDao.getLastIdPost(), "test", "test", "test");
        String actual=postDao.findPostById(postDao.getLastIdPost()).get(0).getImg();
        postDao.deletePost(postDao.getLastIdPost());
        assertEquals("test", actual);
    }
    @Test
    public void editPost_TestEditTitle(){
        postDao.addNewPost(p);
        postDao.editPost(postDao.getLastIdPost(), "test", "test", "test");
        String actual=postDao.findPostById(postDao.getLastIdPost()).get(0).getTittle();
        postDao.deletePost(postDao.getLastIdPost());
        assertEquals("test", actual);
    }
    @Test
    public void editPost_TestEditDetail(){
        postDao.addNewPost(p);
        postDao.editPost(postDao.getLastIdPost(), "test", "test", "test");
        String actual=postDao.findPostById(postDao.getLastIdPost()).get(0).getDetails();
        postDao.deletePost(postDao.getLastIdPost());
        assertEquals("test", actual);
    }
   
}
