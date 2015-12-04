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
 *
 * @author vincent
 */
public class Init {

    private static Init uniqueInstance;

    private Init() {
        XmlDoc doc = new XmlDoc();

        Type infirmier = new Type("Infirmier");
        String i = infirmier.getLibelle();
        Type pediatre = new Type("Docteur", "Pediatre");
        String p = pediatre.getLibelle();

        Visiteur vincent = new Visiteur(1, "Mazet", "Vincent");
        Visiteur marlon = new Visiteur(2, "Chattillon", "Marlon");
        Visiteur alexy = new Visiteur(3, "vercruysse", "Alexy");
        Visiteur guillaume = new Visiteur(4, "Grellet", "Guillaume", i);
        Visiteur yannick = new Visiteur(5, "Moreau", "Yannick", p);

        Vehicule vehicule1 = new Vehicule(1, "Renault", "Clio", 10000);
        Vehicule vehicule2 = new Vehicule(2, "Audi", "A8", 12500);
        Vehicule vehicule3 = new Vehicule(3, "Toyota", "Yaris", 15005);
        Vehicule vehicule4 = new Vehicule(4, "Renault", "Megane", 12500);
        Vehicule vehicule5 = new Vehicule(5, "Peugeot", "406", 8765);
        Vehicule vehicule6 = new Vehicule(6, "Fiat", "Punto", 8500);
        Vehicule vehicule7 = new Vehicule(7, "Citroen", "c3", 9500);
        Vehicule vehicule8 = new Vehicule(8, "Ford", "Fiesta", 8850);

        vincent.setTypeVisiteur(p);
        marlon.setTypeVisiteur(p);
        alexy.setTypeVisiteur(i);

        alexy.addVehicule(vehicule4);
        marlon.addVehicule(vehicule1);
        marlon.addVehicule(vehicule2);
        guillaume.addVehicule(vehicule6);
        vincent.addVehicule(vehicule7);
        yannick.addVehicule(vehicule8);

        doc.encodXML(Visiteur.getLPersonnes());
        doc.decodXML();

    }

    /**
     * lancement instance programme
     *
     * @return
     */
    public static Init getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Init();
        }
        return uniqueInstance;
    }
}
