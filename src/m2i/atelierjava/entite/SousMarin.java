/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import static com.sun.media.jfxmediaimpl.MediaUtils.error;

/**
 *
 * @author Administrateur
 */
public class SousMarin extends Vehicule {
    
    
    protected boolean monte ; 

    public SousMarin(boolean monte, String marque, boolean utilitaire, String modele, String couleur, int nbPlaces, int x, int y, int z, int vitesse) {
        super(marque, utilitaire, modele, couleur, nbPlaces, x, y, z, vitesse);
        this.monte = monte;
    }
    
   

    public boolean isMonte() {
        return monte;
    }

    public void setMonte(boolean monte) {
        this.monte = monte;
    }

    @Override
    public void avancer() {
        super.avancer(); //To change body of generated methods, choose Tools | Templates.
        this.y = this.y - pas/2;
        
            if(monte == true ){
                y += pas ;
            }else {
                y-= pas;
            }
            if(y>0){
                y = 0;
            }
        
    }    
    @Override
    public void reculer() {
        super.reculer(); //To change body of generated methods, choose Tools | Templates.
    }
    
}

