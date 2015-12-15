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
 * The type Visiteur.
 *
 * @author vincent
 */
public class Visiteur implements java.io.Serializable {

    private int id;
    private String nom;
    private String prenom;
    private String idVehicule = "0";
    private String typeVisiteur = "";
    private int leidVehicule;
    private static BeanItemContainer<Visiteur> personnes = new BeanItemContainer<>(Visiteur.class);
    private static ArrayList<Visiteur> lp = new ArrayList<Visiteur>();

    /**
     * Constructeur vide - xml
     */
    public Visiteur() {

    }

    /**
     * constructeur nv visiteur
     *
     * @param id     the id
     * @param nom    the nom
     * @param prenom the prenom
     */
    public Visiteur(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.personnes.addBean(this);
        this.lp.add(this);
    }

    /**
     * constructeur visiteur + type
     *
     * @param id             the id
     * @param nom            the nom
     * @param prenom         the prenom
     * @param unTypeVisiteur the un type visiteur
     */
    public Visiteur(int id, String nom, String prenom, Type unTypeVisiteur) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.typeVisiteur= unTypeVisiteur.getLibelle();
        this.personnes.addBean(this);
        this.lp.add(this);
    }

    /**
     * getter id
     *
     * @return id
     */
    public int getID() {
        return id;
    }

    /**
     * setter id
     *
     * @param id the id
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * getter nom
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * setter nom
     *
     * @param nom the nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * setter typeVisiteur
     *
     * @param typeVisiteur the type visiteur
     */
    public void setTypeVisiteur(Type typeVisiteur) {
        this.typeVisiteur = typeVisiteur.getLibelle();
    }

    /**
     * getter type Visiteur
     *
     * @return type visiteur
     */
    public String getTypeVisiteur() {
        return typeVisiteur;
    }

    /**
     * getter nom
     *
     * @return prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * setter prenom
     *
     * @param prenom the prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Bean get personnes
     *
     * @return personnes
     */
    public static BeanItemContainer<Visiteur> getPersonnes() {
        return personnes;
    }

    /**
     * get array visiteur
     *
     * @return l personnes
     */
    public static ArrayList<Visiteur> getLPersonnes() {
        return lp;
    }

    /**
     * setter liste personnes
     *
     * @param v the v
     */
    public static void setLPersonnes(ArrayList<Visiteur> v) {
        lp = v;
    }

    /**
     * fct add vehicule pr visiteur
     *
     * @param v the v
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
     * getter vehicule utilisé
     *
     * @return vehicule utilise
     */
    public String getVehiculeUtilise() {
        return idVehicule;
    }

}
