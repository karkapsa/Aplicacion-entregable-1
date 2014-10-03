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
public class CtoSerieIT {
    
    public CtoSerieIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getR1 method, of class CtoSerie.
     */
    @Test
    public void testGetR1() {
        System.out.println("getR1");
        CtoSerie instance = new CtoSerie();
        double expResult = 0.0;
        double result = instance.getR1();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       //  fail("The test case is a prototype.");
    }

    /**
     * Test of setR1 method, of class CtoSerie.
     */
    @Test
    public void testSetR1() {
        System.out.println("setR1");
        double r1 = 0.0;
        CtoSerie instance = new CtoSerie();
        instance.setR1(r1);
        // TODO review the generated test code and remove the default call to fail.
       //  fail("The test case is a prototype.");
    }

    /**
     * Test of getR2 method, of class CtoSerie.
     */
    @Test
    public void testGetR2() {
        System.out.println("getR2");
        CtoSerie instance = new CtoSerie();
        double expResult = 0.0;
        double result = instance.getR2();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       //  fail("The test case is a prototype.");
    }

    /**
     * Test of setR2 method, of class CtoSerie.
     */
    @Test
    public void testSetR2() {
        System.out.println("setR2");
        double r2 = 0.0;
        CtoSerie instance = new CtoSerie();
        instance.setR2(r2);
        // TODO review the generated test code and remove the default call to fail.
       //  fail("The test case is a prototype.");
    }

    /**
     * Test of getR3 method, of class CtoSerie.
     */
    @Test
    public void testGetR3() {
        System.out.println("getR3");
        CtoSerie instance = new CtoSerie();
        double expResult = 0.0;
        double result = instance.getR3();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       //  fail("The test case is a prototype.");
    }

    /**
     * Test of setR3 method, of class CtoSerie.
     */
    @Test
    public void testSetR3() {
        System.out.println("setR3");
        double r3 = 0.0;
        CtoSerie instance = new CtoSerie();
        instance.setR3(r3);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of calcircu method, of class CtoSerie.
     */
    @Test
    public void testCalcircu() {
        System.out.println("calcircu");
        double r1 = 3.0;
        double r2 = 4.0;
        double r3 = 5.0;
        CtoSerie instance = new CtoSerie();
        double expResult = 7.833333333333331;
        double result = instance.calcircu(r1, r2, r3);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
