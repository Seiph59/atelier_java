/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import javax.sound.midi.MidiUnavailableException;
import m2i.atelierjava.entite.Synthe;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class SyntheTest {

    public SyntheTest() {
        
    }
    
       
    
    @Test
    public void testSynthe() throws MidiUnavailableException, InterruptedException{
        Synthe s1 = new Synthe();
        s1.allumage();
        s1.monterVolume();
        s1.monterVolume();
        s1.monterVolume();
        s1.baisserVolume();
        s1.setInstrument("Guitare");
        s1.afficher();
        s1.synthTest();
        s1.synthTest();
        s1.synthTest();
        s1.synthTest();
    }
    
    
}
