/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

/**
 *
 * @author Administrateur
 */
public class Vehicule {

    public Vehicule() {
    }

    public Vehicule(String marque, boolean utilitaire, String modele, String couleur, int nbPlaces, int x, int y, int z, int vitesse) {
        this.marque = marque;
        this.utilitaire = utilitaire;
        this.modele = modele;
        this.couleur = couleur;
        this.nbPlaces = nbPlaces;
        this.x = x;
        this.y = y;
        this.z = z;
        this.pas = vitesse;
    }
    
    
    protected String marque;
    protected boolean utilitaire;
    protected String modele;
    protected String couleur;
    protected int nbPlaces;
    protected int x,y,z;
    protected int pas =1;
    
    public void afficher(){
        String txt = String.format("Véhicule: marque = %s utilitaire = %s modele=%s couleur = %s nbPlaces = %d [%d,%d,%d] vitesse: %d", 
                marque, utilitaire, modele, couleur, nbPlaces, x,y,z,pas);
        System.out.println(txt);
    }

    public int getPas() {
        return pas;
    }

    public void setPas(int pas) {
        this.pas = pas;
    }
    
    public void avancer(){
        z+= pas;
    }

    public void reculer(){
        z-= pas;
    }
    
    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public boolean isUtilitaire() {
        return utilitaire;
    }

    public void setUtilitaire(boolean utilitaire) {
        this.utilitaire = utilitaire;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
}
