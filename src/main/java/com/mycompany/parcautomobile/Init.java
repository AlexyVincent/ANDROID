/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import com.sun.jndi.cosnaming.IiopUrl.Address;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Table;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

/**
 * The type Init.
 *
 * @author vincent
 */
public class Init {

    private static Init uniqueInstance;

    private Init() {
        XmlDoc doc = new XmlDoc();
        TestPollution testPollution = new TestPollution();

        Type infirmier = new Type("Infirmier");

        Type pediatre = new Type("Docteur", "Pediatre");


        Visiteur vincent = new Visiteur(1, "Mazet", "Vincent");
        Visiteur marlon = new Visiteur(2, "Chattillon", "Marlon");
        Visiteur alexy = new Visiteur(3, "vercruysse", "Alexy");
        Visiteur guillaume = new Visiteur(4, "Grellet", "Guillaume", infirmier);
        Visiteur yannick = new Visiteur(5, "Moreau", "Yannick", pediatre);

        MarqueVehicule renault = new MarqueVehicule("Renault",65);
        MarqueVehicule peugeot = new MarqueVehicule("Peugeot",45);
        MarqueVehicule volkswagen = new MarqueVehicule("VW",80);
        MarqueVehicule ford = new MarqueVehicule("Ford",72);


        Vehicule vehicule1 = new Vehicule(1,  "Clio", 10000,renault.getLibelle(),renault.getTauxDeReference());
        Vehicule vehicule2 = new Vehicule(2,  "Golf", 12500,volkswagen.getLibelle(),250);
        Vehicule vehicule3 = new Vehicule(3,  "206", 15005,peugeot.getLibelle(),40);
        Vehicule vehicule4 = new Vehicule(4,  "Megane", 12500,renault.getLibelle(),65);
        Vehicule vehicule5 = new Vehicule(5,  "406", 8765,peugeot.getLibelle(),43);
        Vehicule vehicule6 = new Vehicule(6, "mustang", 58500,ford.getLibelle(),85);
        Vehicule vehicule7 = new Vehicule(7,  "Koleos", 19500,renault.getLibelle(),67);
        Vehicule vehicule8 = new Vehicule(8,  "Fiesta", 8850,ford.getLibelle(),62);

        testPollution.testVehicule(vehicule1,renault);
        testPollution.testVehicule(vehicule2,volkswagen);
        testPollution.testVehicule(vehicule3,peugeot);
        testPollution.testVehicule(vehicule4,renault);
        testPollution.testVehicule(vehicule5,peugeot);
        testPollution.testVehicule(vehicule6,ford);
        testPollution.testVehicule(vehicule7,renault);
        testPollution.testVehicule(vehicule8,ford);

        vincent.setTypeVisiteur(pediatre);
        marlon.setTypeVisiteur(pediatre);
        alexy.setTypeVisiteur(infirmier);

        alexy.addVehicule(vehicule4);
        marlon.addVehicule(vehicule2);
        guillaume.addVehicule(vehicule6);
        vincent.addVehicule(vehicule7);
        yannick.addVehicule(vehicule8);

        testPollution.enleverVehicule(alexy,vehicule4,renault);
        testPollution.enleverVehicule(marlon,vehicule2,volkswagen);
        testPollution.enleverVehicule(guillaume,vehicule6,ford);
        testPollution.enleverVehicule(vincent,vehicule7,renault);
        testPollution.enleverVehicule(yannick,vehicule8,ford);

        doc.encodXML(Visiteur.getLPersonnes());
        doc.decodXML();

    }

    /**
     * lancement instance programme
     *
     * @return uniqueInstance instance
     */
    public static Init getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Init();
        }
        return uniqueInstance;
    }
}
