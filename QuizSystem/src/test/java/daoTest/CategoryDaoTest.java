/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package daoTest;

import dao.impl.CategoryDao;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class CategoryDaoTest {
    
    public CategoryDaoTest() {
    }
    
    private CategoryDao c = new CategoryDao();
    
    @Test
    public void testGetAllCategory(){
        boolean expected = false;
        boolean actual = c.getAllCate().isEmpty();
        assertEquals(expected, actual);
    }
    
}
