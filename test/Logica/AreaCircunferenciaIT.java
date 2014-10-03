/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andres
 */
public class AreaCircunferenciaIT {
    
    public AreaCircunferenciaIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Areacircun method, of class AreaCircunferencia.
     */
    @Test
    public void testAreacircun() {
        System.out.println("Areacircun");
        double Radio = 7.0;
        AreaCircunferencia instance = new AreaCircunferencia();
        double expResult = 153.93804002589985;
        double result = instance.Areacircun(Radio);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
