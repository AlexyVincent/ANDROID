/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import com.vaadin.data.util.BeanItem;
import com.vaadin.data.util.BeanItemContainer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Vehicule implements java.io.Serializable {

    private int id;
    private String marque;
    private String modele;
    private double prix;
    private static BeanItemContainer<Vehicule> vehicules = new BeanItemContainer<>(Vehicule.class);
    private static BeanItemContainer<Vehicule> vehiculesPC = new BeanItemContainer<>(Vehicule.class);

    /**
     *constructeur vide obligatoire pour le xml
     */
    public Vehicule() {
    }

    /**
     *constructeur pour ajouter un vehicule
     * @param id
     * @param marque
     * @param modele
     * @param prix
     */
    public Vehicule(int id, String marque, String modele, double prix) {
        this.id = id;
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
        this.vehicules.addBean(this);
    }
    
    /**
     *calcul prix majore en fct marque
     * @return
     */
    public double getPrixMajore(){
        double majR= 1.05;
        double majP= 1.10;
        double result = this.prix;
        if( this.marque.equals("Renault")){
           result= result * majR;
        }
        
        if( this.marque.equals("Peugeot")){
           result= result * majP;
        }
        
        return result;
    }

    /**
     *getter marque
     * @return
     */
    public String getMarque() {
        return marque;
    }

    /**
     *getter modèle
     * @return
     */
    public String getModele() {
        return modele;
    }

    /**
     *getter prix
     * @return
     */
    public double getPrix() {
        return prix;
    }

    /**
     *setter marque
     * @param marque
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     *setter modele
     * @param modele
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     *setter prix
     * @param prix
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     *getter id
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *setter id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *getter bean vehicule
     * @return
     */
    public static BeanItemContainer<Vehicule> getVehicules() {
        return vehicules;
    }

    /**
     *getter bean prix
     * @param prix
     * @return
     */
    public static BeanItemContainer<Vehicule> getPb(int prix) {

        List<Vehicule> lv;
        lv = (List<Vehicule>) vehicules.getItemIds();

        for (Vehicule unV : lv) {
            if (unV.getPrix() < prix) {
                vehiculesPC.addBean(unV);
            }
        }
        return vehiculesPC;
    }

}
