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
 * The type Vehicule.
 *
 * @author user
 */
public class Vehicule implements java.io.Serializable {

    private int id;
    private String modele;
    private double prix;
    private String marque;
    private double taux;
    private boolean enReparation;
    private static BeanItemContainer<Vehicule> vehicules = new BeanItemContainer<>(Vehicule.class);
    private static BeanItemContainer<Vehicule> vehiculesPC = new BeanItemContainer<>(Vehicule.class);

    /**
     * constructeur vide obligatoire pour le xml
     */
    public Vehicule() {
    }

    /**
     * constructeur pour ajouter un vehicule
     *
     * @param id        the id
     * @param modele    the modele
     * @param prix      the prix
     * @param uneMarque the une marque
     * @param taux      the taux
     */
    public Vehicule(int id, String modele, double prix, String uneMarque , double taux) {
        this.id = id;
        this.modele = modele;
        this.prix = prix;
        this.marque = uneMarque;
        this.taux = taux;
        this.vehicules.addBean(this);
    }

    /**
     * calcul prix majore en fct marque
     *
     * @return double double
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
     * Get en reparation boolean.
     *
     * @return the boolean
     */
    public boolean getEnReparation(){
        return enReparation;
    }

    public void setEnReparation(boolean unEnReparation){
        this.enReparation = unEnReparation;
    }


    /**
     * getter modèle
     *
     * @return modele modele
     */
    public String getModele() {
        return modele;
    }

    /**
     * Gets .
     *
     * @return the marque
     */
    public String getmarque() {
        return marque;
    }

    /**
     * Gets taux.
     *
     * @return the taux
     */
    public double getTaux() {
        return taux;
    }

    /**
     * getter prix
     *
     * @return prix prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * setter modele
     *
     * @param modele the modele
     */
    public void setModele(String modele) {
        this.modele = modele;
    }

    /**
     * setter prix
     *
     * @param prix the prix
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * getter id
     *
     * @return id id
     */
    public int getId() {
        return id;
    }

    /**
     * setter id
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * getter bean vehicule
     *
     * @return vehicules vehicules
     */
    public static BeanItemContainer<Vehicule> getVehicules() {
        return vehicules;
    }

    /**
     * getter bean prix
     *
     * @param prix the prix
     * @return pb pb
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
