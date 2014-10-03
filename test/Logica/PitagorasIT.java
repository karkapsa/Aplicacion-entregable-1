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
public class PitagorasIT {
    
    public PitagorasIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of CalcularHipotenusa method, of class Pitagoras.
     */
    @Test
    public void testCalcularHipotenusa() {
        System.out.println("CalcularHipotenusa");
        double lado1 = 2.0;
        double lado2 = 3.0;
        Pitagoras instance = new Pitagoras();
        double expResult = 3.605551275463989;
        double result = instance.CalcularHipotenusa(lado1, lado2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
