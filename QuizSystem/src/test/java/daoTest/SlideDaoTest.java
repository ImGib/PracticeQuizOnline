/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daoTest;
import dao.impl.SlideDao;
import model.Slide;
import static org.junit.Assert.*;
import org.junit.Test;
/**
 *
 * @author asus
 */
public class SlideDaoTest {
    Slide s= new Slide("img", "hyperlink", "linhchi");
    SlideDao slideDao=new SlideDao();
    
    @Test
    public void loadSlidePagination_Test(){
        int actual= slideDao.loadSlidePagination(1, 4).size();
        assertTrue(actual<=4);
    }
    @Test
    public void addSlide_Test(){
        int expected=slideDao.findAllSlide().size()+1;
        slideDao.addSlide(s);
        int actual=slideDao.findAllSlide().size();
        slideDao.deleteSlide(s.getId());
        assertEquals(expected, actual);
    }
    @Test
    public void deleteSlide(){
        int expected=slideDao.findAllSlide().size();
        slideDao.addSlide(s);
        slideDao.deleteSlide(s.getId());
        int actual=slideDao.findAllSlide().size();
        assertEquals(expected, actual);
    }
    
    @Test
    public void findSlideById_Test(){
        
        int actual=slideDao.findSlideById(1).size();
        assertNotNull(actual);
    }
    @Test
    public void findAllSlide_Test(){
        int actual=slideDao.findAllSlide().size();
        assertNotNull(actual);
    }
    @Test
    public void editSlide_TestEditImg(){
        slideDao.editSlide(1, "test", "test");
        String actual=slideDao.findSlideById(1).get(0).getImg();
        assertEquals("test", actual);
    }
    @Test
    public void editSlide_TestEditHyperlink(){
        slideDao.editSlide(1, "test", "test");
        String actual=slideDao.findSlideById(1).get(0).getHyperlink();
        assertEquals("test", actual);
    }
}
