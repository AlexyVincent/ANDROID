/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcautomobile;

/**
 *
 * @author vincent
 */
public class Type {
    
    private String libelle;
    private String specialisation;
    
    /**
     *constructeur Type
     * @param unLibelle
     */
    public Type(String unLibelle){
        this.libelle = unLibelle;
    }

    /**
     *constructeur type libelle + specialisation
     * @param unLibelle
     * @param uneSpecialisation
     */
    public Type(String unLibelle , String uneSpecialisation){
        this.libelle = unLibelle;
        this.specialisation = uneSpecialisation;
    }
    
    /**
     * setter libelle
     * @param unLibelle
     */
    public void setLibelle(String unLibelle){
        this.libelle = unLibelle;
    }
    
    /**
     *getter libelle
     * @return
     */
    public String getLibelle(){
        return libelle;
    }
    
    /**
     *setterspecialisation
     * @param unLibelle
     */
    public void setSpecialisation(String unLibelle){
        this.libelle = unLibelle;   
    }
    
    /**
     *getter specialisation
     * @return
     */
    public String getSpecialisation(){
        return specialisation;
    }
    
    
    
}
