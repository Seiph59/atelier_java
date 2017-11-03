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
public class Film {
    
    public void init ( String t, String synopsis, int a, Date dateCreation){
        titre = t;
        this.synopsis = synopsis;
        anneeDeProduction = a;
        this.dateCreation = dateCreation;
        
    }
    private String titre;
    private String synopsis;
    private int anneeDeProduction;
    private Date dateCreation;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String t) {
        titre = t;
    }

    public int getAnneeDeProduction() {
        return anneeDeProduction;
    }

    public void setAnneeDeProduction(int a) {
        anneeDeProduction = a;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    public void afficheFilm(){
        System.out.println(titre +" "+ synopsis + " "+ dateCreation +" "+ anneeDeProduction);
        // string.format %s %s %d %s) 
    }
    
    
}
