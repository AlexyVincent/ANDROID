/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vincent
 */
public class TypeTest {
    
    public TypeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     * Test of setLibelle method, of class Type.
     */
    @Test
    public void testSetLibelle() {
        System.out.println("setLibelle");
        String unLibelle = "Pediatre";
        Type instance = new Type();
        instance.setLibelle(unLibelle);
        
    }

    /**
     * Test of getLibelle method, of class Type.
     */
    @Test
    public void testGetLibelle() {
        System.out.println("getLibelle");
        Type instance = new Type("Docteur","Pediatre");;
        String expResult = "Docteur";
        String result = instance.getLibelle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSpecialisation method, of class Type.
     */
    @Test
    public void testSetSpecialisation() {
        System.out.println("setSpecialisation");
        String unLibelle = "Pediatre";
        Type instance = new Type();
        instance.setSpecialisation(unLibelle);
    }

    /**
     * Test of getSpecialisation method, of class Type.
     */
    @Test
    public void testGetSpecialisation() {
        System.out.println("getSpecialisation");
        Type instance = new Type("Docteur","Pediatre");
        String expResult = "Pediatre";
        String result = instance.getSpecialisation();
        assertEquals(expResult, result);
    }
    
}
