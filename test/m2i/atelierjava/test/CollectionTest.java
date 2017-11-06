/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class CollectionTest {
    
    //@Test
    public void testList(){
        List<String> listeFilms = new ArrayList<>();
        listeFilms.add("Dracula");
        listeFilms.add("Matrix");
        listeFilms.add("Winnie  l'ourson");
        listeFilms.remove("Matrix");
        
        for (String film : listeFilms) {
            System.out.println(film);
            
        }
        
        
    }
    @Test
    public void testSommeBelgiqueFranceEspagneItalieEgal4Elements(){
        List<String> liste1 = new ArrayList<>();
        liste1.add("Belgique");
        liste1.add("France");
        List<String> liste2 = new ArrayList<>();
        liste2.add("Espagne");
        liste2.add("Italie");
        
        liste1.addAll(liste2);
        System.out.println(liste1);
        
        Assert.assertEquals(4, liste1.size());
        
        
    }
    
}
