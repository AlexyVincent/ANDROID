/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

import com.vaadin.data.util.BeanItemContainer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vincent
 */
public class Visiteur implements java.io.Serializable {

    private int id;
    private String nom;
    private String prenom;
    private String idVehicule = "0";
    private int leidVehicule;
    private static BeanItemContainer<Visiteur> personnes = new BeanItemContainer<>(Visiteur.class);
    private static ArrayList<Visiteur> lp = new ArrayList<Visiteur>();
    
    /**
     *Constructeur vide - xml
     */
    public Visiteur(){
        
    }

    /**
     *constructeur nv visiteur
     * @param id
     * @param nom
     * @param prenom
     */
    public Visiteur(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.personnes.addBean(this);
        this.lp.add(this);
    }

    /**
     *getter id
     * @return
     */
    public int getID() {
        return id;
    }

    /**
     *setter id
     * @param id
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     *getter nom
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *setter nom
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *getter nom
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *setter prenom
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     *Bean get personnes
     * @return
     */
    public static BeanItemContainer<Visiteur> getPersonnes() {
        return personnes;
    }
    
    /**
     *get array visiteur
     * @return
     */
    public static ArrayList<Visiteur> getLPersonnes() {
        return lp;
    }
    
    /**
     *setter liste personnes
     * @param v
     */
    public static void setLPersonnes(ArrayList<Visiteur> v){
        lp=v;
    }
    
    /**
     *fct add vehicule pr visiteur
     * @param v
     */
    public void addVehicule(Vehicule v) {
        leidVehicule = v.getId();
        if (idVehicule == "0") {
            idVehicule = Integer.toString(leidVehicule);
            personnes.addBean(this);

        } else {
            idVehicule = idVehicule + ',' + Integer.toString(leidVehicule);
            personnes.addBean(this);

        }

    }

    /**
     *getter vehicule utilisé
     * @return
     */
    public String getVehiculeUtilise() {
        return idVehicule;
    }

}
