/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.abuelos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class PrincipalTest {
    
    public PrincipalTest() {
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
     * Test of agregarArbol method, of class Principal.
     */
    @Test
    public void testAgregarArbol() {
        System.out.println("agregarArbol");
        Integer numHijo = null;
        Persona genealogia = null;
        Principal instance = new Principal();
        instance.agregarArbol(numHijo, genealogia);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Buscar method, of class Principal.
     */
    @Test
    public void testBuscar() {
        System.out.println("Buscar");
        Integer key = null;
        Principal instance = new Principal();
        instance.Buscar(key);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Menu method, of class Principal.
     */
    @Test
    public void testMenu() {
        System.out.println("Menu");
        Principal instance = new Principal();
        instance.Menu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
