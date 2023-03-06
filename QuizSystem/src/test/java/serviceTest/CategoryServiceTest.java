/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package serviceTest;

import org.junit.Test;
import static org.junit.Assert.*;
import service.impl.CategoryService;

/**
 *
 * @author Lenovo
 */
public class CategoryServiceTest {
    
    public CategoryServiceTest() {
    }
    
    @Test
    public void testGetAllThree(){
        boolean expected = false;
        boolean actual = CategoryService.getInstance().getAllCate().isEmpty();
        assertEquals(expected, actual);
    }
    
}
