/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Avion;
import m2i.atelierjava.entite.SousMarin;
import m2i.atelierjava.entite.Vehicule;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class VehiculeTest {
    
//    @Test
    public void testAvion(){
        Avion a1 = new Avion("Airbus", false,"A380", "Blanc", 250, 0, 0, 0, 300);
        a1.avancer();
        a1.afficher();
        
    }
   public void  testVehicule(){
       
       Vehicule v1 = new Vehicule("Ferrari", false, "F-50" , "rouge", 2, 0, 0, 0,5);
       v1.afficher();
       v1.setPas(4);
       v1.avancer();
       v1.afficher();
       v1.setPas(2);
       v1.reculer();
       v1.afficher();
   }
   @Test
    public void testSousMarin(){
        SousMarin s1 = new SousMarin(true,"Alstom", true, "AS4", "Gris", 100, 0, -10, 0, 10);
                s1.avancer();
                s1.afficher();
                s1.setMonte(true);
                s1.afficher();
                s1.avancer();
                s1.afficher();
                s1.avancer();
                s1.afficher();
                s1.avancer();
                
    }
   
   
    
}
