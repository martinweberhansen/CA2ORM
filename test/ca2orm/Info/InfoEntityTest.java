/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca2orm.Info;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MASA
 */
public class InfoEntityTest {
    
    public InfoEntityTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class InfoEntity.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        InfoEntity instance = new InfoEntity();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class InfoEntity.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        InfoEntity instance = new InfoEntity();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class InfoEntity.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        InfoEntity instance = new InfoEntity();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class InfoEntity.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        InfoEntity instance = new InfoEntity();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
