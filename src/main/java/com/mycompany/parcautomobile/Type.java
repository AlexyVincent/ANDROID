/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

/**
 * classe type
 *
 * @author vincent
 */
public class Type {
    
    private String libelle;
    private String specialisation;

    /**
     * constructeur Type
     */
    public Type(){
        
    }

    /**
     * constructeur Type
     *
     * @param unLibelle the un libelle
     */
    public Type(String unLibelle){
        this.libelle = unLibelle;
    }

    /**
     * constructeur type libelle + specialisation
     *
     * @param unLibelle         the un libelle
     * @param uneSpecialisation the une specialisation
     */
    public Type(String unLibelle , String uneSpecialisation){
        this.libelle = unLibelle;
        this.specialisation = uneSpecialisation;
    }

    /**
     * setter libelle
     *
     * @param unLibelle the un libelle
     */
    public void setLibelle(String unLibelle){
        this.libelle = unLibelle;
    }

    /**
     * getter libelle
     *
     * @return string
     */
    public String getLibelle(){
        return libelle;
    }

    /**
     * setterspecialisation
     *
     * @param unLibelle the un libelle
     */
    public void setSpecialisation(String unLibelle){
        this.libelle = unLibelle;   
    }

    /**
     * getter specialisation
     *
     * @return string
     */
    public String getSpecialisation(){
        return specialisation;
    }
}
