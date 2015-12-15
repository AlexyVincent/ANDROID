package com.mycompany.parcautomobile;

import com.vaadin.data.util.BeanItemContainer;

/**
 * Created by vincent on 15/12/15.
 */
public class MarqueVehicule {
    private String libelle;
    private double tauxDeReference;
    private static BeanItemContainer<MarqueVehicule> marqueVehicule = new BeanItemContainer<>(MarqueVehicule.class);

    /**
     * Instantiates a new Marque vehicule.
     *
     * @param unLibelle         the un libelle
     * @param unTauxDeReference the un taux de reference
     */
    public MarqueVehicule(String unLibelle, double unTauxDeReference){
        this.libelle = unLibelle;
        this.tauxDeReference = unTauxDeReference;
        this.marqueVehicule.addBean(this);

    }

    /**
     * Set libelle.
     *
     * @param unLibelle the un libelle
     */
    public void setLibelle(String unLibelle){
        this.libelle=unLibelle;

    }

    /**
     * Get libelle string.
     *
     * @return the string
     */
    public String getLibelle(){
        return  libelle;
    }

    /**
     * Set taux de reference.
     *
     * @param unTauxDeReference the un taux de reference
     */
    public void setTauxDeReference(double unTauxDeReference){
        this.tauxDeReference = unTauxDeReference;

    }

    /**
     * Get taux de reference double.
     *
     * @return the double
     */
    public double getTauxDeReference(){
        return  tauxDeReference;
    }

    /**
     * getter bean vehicule
     *
     * @return vehicules vehicules
     */
    public static BeanItemContainer<MarqueVehicule> getMarqueVehicule() {
        return marqueVehicule;
    }

}
