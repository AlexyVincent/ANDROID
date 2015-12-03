/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import com.vaadin.data.util.BeanItemContainer;
import java.util.ArrayList;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vincent
 */
public class VisiteurTest {
    
    public VisiteurTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }


    /**
     * Test of getTypeVisiteur method, of class Visiteur.
     */
    @Test
    public void testGetTypeVisiteur() {
        System.out.println("getTypeVisiteur");
        Visiteur instance = new Visiteur(888,"TestVisiteur", "Billy","Docteur");
        String expResult = "Docteur";
        String result = instance.getTypeVisiteur();
        assertEquals(expResult, result);
    }
}
