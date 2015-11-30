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
    
    public Type(String unLibelle){
        this.libelle = unLibelle;
    }
    public Type(String unLibelle , String uneSpecialisation){
        this.libelle = unLibelle;
        this.specialisation = uneSpecialisation;
    }
    
    public void setLibelle(String unLibelle){
        this.libelle = unLibelle;
    }
    
    public String getLibelle(){
        return libelle;
    }
    
    public void setSpecialisation(String unLibelle){
        this.libelle = unLibelle;   
    }
    
    public String getSpecialisation(){
        return specialisation;
    }
    
    
    
}
