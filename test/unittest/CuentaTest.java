/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class CuentaTest {
    
    public CuentaTest() {
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
     * Test of depositar method, of class Cuenta.
     */
    @Test
    public void testDepositar() {
        System.out.println("depositar");
        float deposito = 0.0F;
        Cuenta instance = new Cuenta();
        instance.depositar(deposito);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retirar method, of class Cuenta.
     */
    @Test
    public void testRetirar() {
        System.out.println("retirar");
        float retiro = 0.0F;
        Cuenta instance = new Cuenta();
        instance.retirar(retiro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
