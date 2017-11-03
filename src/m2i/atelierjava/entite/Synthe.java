/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author Administrateur
 */
public class Synthe {
    protected boolean on;
    protected String instrument;
    protected int volume;
    private Synthesizer synth;
    private MidiChannel[]channels;
    private Instrument[]instrus;

    public Synthe(boolean on, String instrument, int volume, Synthesizer synth, MidiChannel[] channels, Instrument[] instrus) {
        this.on = on;
        this.instrument = instrument;
        this.volume = volume;
        this.synth = MidiSystem.getSynthesizer().open();
        this.channels = synth.getChannels();
        this.instrus = synth.getDefaultSoundbank().getInstruments();
        this.synth = synth.loadAllInstruments(synth.getDefaultSoundbank());
    }
    
           
    public void synthTest() throws MidiUnavailableException, InterruptedException{
        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();
        MidiChannel[]channels = synth.getChannels();
        Instrument[]instrus = synth.getDefaultSoundbank().getInstruments();
        synth.loadAllInstruments(synth.getDefaultSoundbank());
        
        
        channels[5].programChange(12);
        channels[5].noteOn(30,600);
        channels[5].noteOff(40,650);
        Thread.sleep(2000);
        
    }

    public boolean isOn() {
        return on;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getVolume() {
        return volume;
    }
   
    
   public void allumage(){
        if(on == true){
            on = false;
            instrument = "piano";
            volume = 3;
        }else{
            on = true;    
        }
    }
    
   
        public void monterVolume(){
            if(on){
            
                if(volume <10){
                    volume++;
                }
            }
        
        }
        public void baisserVolume(){
            if(on){
            
                if(volume > 0){
                    volume--;
                }
            }
        
        }
        public void note(String note){
            if (on){
                System.out.println(note);
                   }
        }
        public void afficher(){
            String affiche = String.format("On : %s, Instrument %s, Volume %d ",on,instrument,volume);
            System.out.println(affiche); 
        }
    
        
}

           
           
