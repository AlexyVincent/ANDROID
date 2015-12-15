package com.mycompany.parcautomobile;

/**
 * Created by vincent on 15/12/15.
 */
public class TestPollution {

    public void testVehicule(Vehicule unVehicule, MarqueVehicule uneMarqueVehicule){
        if(unVehicule.getTaux()>uneMarqueVehicule.getTauxDeReference()){
            unVehicule.setEnReparation(true);

        }else{
            unVehicule.setEnReparation(false);

        }
    }

    public void enleverVehicule(Visiteur unVisiteur,Vehicule unVehicule, MarqueVehicule uneMarqueVehicule){
        if(unVehicule.getTaux()>uneMarqueVehicule.getTauxDeReference()){
            unVisiteur.setVehiculeUtilise("0");

        }


    }
}
