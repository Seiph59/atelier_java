/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import java.util.Date;

/**
 *
 * @author Administrateur
 */
public class Serie {

    
    
    public void initialise (String titre, String synopsis, int anneeSortie, int nombreSaison){
        this.titre = titre;
        this.synopsis = synopsis;
        this.anneeSortie = anneeSortie;
        this.nombreSaison = nombreSaison;
        }


    private String titre;
    private String synopsis;
    private int anneeSortie;
    private int nombreSaison;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(int anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public int getNombreSaison() {
        return nombreSaison;
    }

    public void setNombreSaison(int nombreSaison) {
        this.nombreSaison = nombreSaison;
    }

    public void afficheSerie() {

        System.out.println(titre + " " + synopsis + " " + anneeSortie + " " + nombreSaison);

    }

    public void init(){
        
    }
}
