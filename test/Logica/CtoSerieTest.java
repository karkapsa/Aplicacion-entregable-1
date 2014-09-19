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
public class CtoSerieTest {
    
    public CtoSerieTest() {
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

  
    @Test
    public void testCalcircu() {
        System.out.println("calcircu");
        double r1 = 3;
        double r2 = 3;
        double r3 = 3;
        CtoSerie instance = new CtoSerie();
        double expResult = 10;
        double result = instance.calcircu(r1, r2, r3);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
