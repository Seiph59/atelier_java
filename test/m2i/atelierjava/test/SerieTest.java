/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Serie;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class SerieTest {
    
    
    @Test
    public void nouvelleSerie() {
        Serie s1 = new Serie();
        s1.initialise("Dexter", "blabla", 2001, 3);
        
        s1.afficheSerie();
    }
    
    
    
}
