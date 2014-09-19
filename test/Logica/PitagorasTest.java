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
public class PitagorasTest {
    
    public PitagorasTest() {
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
     * Test of CalcularHipotenusa method, of class Pitagoras.
     */
    @Test
    public void testCalcularHipotenusa() {
        System.out.println("CalcularHipotenusa");
        double lado1 = 2;
        double lado2 = 2;
        Pitagoras instance = new Pitagoras();
        double expResult = 2.8284271247461903;
        double result = instance.CalcularHipotenusa(lado1, lado2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
