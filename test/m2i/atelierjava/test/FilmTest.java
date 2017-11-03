/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.Date;
import m2i.atelierjava.entite.Film;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class FilmTest {
    
    @Test
    public void nouveauFilm(){
        
        
        Film f1 = new Film();
        f1.init("Dracula", "blabla", 1987, new Date() );
        Film f2 = new Film();
        f2.init("Kung", "blabla", 2005 ,new Date());
        
        f1.afficheFilm();
        f2.afficheFilm();
    }
    
}
