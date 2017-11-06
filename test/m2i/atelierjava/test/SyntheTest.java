/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import javax.sound.midi.MidiUnavailableException;
import junit.framework.Assert;
import m2i.atelierjava.entite.Synthe;
import org.junit.Test;
import static sun.security.ssl.Debug.isOn;

/**
 *
 * @author Administrateur
 */
public class SyntheTest {

    public SyntheTest() {
        
    }
    
       
    
    @Test
    public void testSynthe() throws MidiUnavailableException, InterruptedException{
        Synthe s1 = new Synthe(false, "Piano", 5);
        s1.allumage();
        s1.monterVolume();
        s1.monterVolume();
        s1.monterVolume();
        s1.baisserVolume();
        s1.setInstrument("Guitare");
        s1.afficher();
        s1.synthTest(5, "DO", 10);// DO
        s1.synthTest(5, "RE", 10);// RE
        s1.melodie("DO RE MI FA SOL LA SI DO");
//        s1.synthTest(5, 64, 10);// MI
//        s1.synthTest(5, 65, 10);// FA
//        s1.synthTest(5, 67, 10);// SOL
//        s1.synthTest(5, 69, 10);// LA
//        s1.synthTest(5, 71, 10);// SI
//        s1.synthTest(5, 72, 10);// DO
//        s1.synthTest(5, 71, 10);
//        s1.synthTest(5, 69, 10);
//        s1.synthTest(5, 67, 10);
//        s1.synthTest(5, 65, 10);
//        s1.synthTest(5, 64, 10);
//        s1.synthTest(5, 62, 10);
//        s1.synthTest(5, 60, 10);
    }
    //@Test
    public void testAllumage() throws MidiUnavailableException, InterruptedException{
       Synthe s2 = new Synthe(false, "Piano", 5);
       s2.allumage();
       Assert.assertTrue(s2.isOn());
       s2.allumage();
       Assert.assertFalse(s2.isOn());
    }
    
    //@Test
    public void testSon() throws MidiUnavailableException, InterruptedException {
        Synthe s3 = new Synthe(false, "Piano",5);
        Assert.assertEquals(5, s3.getVolume());
    }
}
