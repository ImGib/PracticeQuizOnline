/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package AccountDao_Test;

import dao.impl.AccountDao;
import model.Account;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import service.impl.AccountService;

/**
 *
 * @author asus
 */
public class AccountDao_Test {
    
   @Test
   public void test_findAccountByEmailAndPass(){
       String expected="vinh123";
       String actual=new AccountDao().findAccountByEmailAndPass("vinhnqhe163166@fpt.edu.vn", "123").get(0).getUserName();
       
       assertEquals(expected, actual);
   }
   
}
