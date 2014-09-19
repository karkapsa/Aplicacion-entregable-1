/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JuanDiego
 */
public class AreaCircunferenciaTest {
    
    public AreaCircunferenciaTest() {
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
     * Test of Areacircun method, of class AreaCircunferencia.
     */
    @Test
    public void testAreacircun() {
        System.out.println("Areacircun");
        double Radio = 3;
        AreaCircunferencia instance = new AreaCircunferencia();
        double expResult = 28.274333882308138;
        double result = instance.Areacircun(Radio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
