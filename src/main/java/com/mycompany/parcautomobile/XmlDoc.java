/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

/**
 *
 * @author vincent
 */
public class XmlDoc {

    /**
     * xml decoder
     */
    public XMLDecoder decoder = null;

    /**
     * xml encoder
     */
    public XMLEncoder encoder = null;

    /**
     * constructeur vide
     */
    public XmlDoc() {

    }

    /**
     * encode xml avec array visiteur
     *
     * @param lp
     */
    public void encodXML(ArrayList<Visiteur> lp) {

        try {
            encoder = new XMLEncoder(new BufferedOutputStream(
                    new FileOutputStream("utilisateur.xml")));

            encoder.writeObject(lp);
            encoder.flush();

        } catch (final java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if (encoder != null) {
                encoder.close();
            }
        }

    }

    /**
     * fct decode fichier xml
     */
    public void decodXML() {

        XMLDecoder decoder = null;

        try {
            decoder = new XMLDecoder(new FileInputStream("utilisateur.xml"));
            Visiteur.setLPersonnes((ArrayList<Visiteur>) decoder.readObject());
            //final Visiteur visiteur = (Visiteur) decoder.readObject();
            for (Visiteur uv : Visiteur.getLPersonnes()) {
                System.out.println(uv.getPrenom());
            }
        } catch (final Exception e) {
            e.printStackTrace();
        } finally {
            if (decoder != null) {
                decoder.close();
            }
        }
    }

}
