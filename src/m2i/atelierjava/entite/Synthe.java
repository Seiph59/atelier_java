/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import java.util.HashMap;
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
    HashMap<String,Integer> map = new HashMap<String,Integer>();

    public Synthe(boolean on, String instrument, int volume ) throws MidiUnavailableException, InterruptedException{
        this.on = on;
        this.instrument = instrument;
        this.volume = volume;
        this.synth = MidiSystem.getSynthesizer();
        this.synth.open();
        this.channels = synth.getChannels();
        this.instrus = synth.getDefaultSoundbank().getInstruments();
        synth.loadAllInstruments(synth.getDefaultSoundbank());
        this.definition();
    }
    
    public void definition(){
        map.put("DO",60);
        map.put("RE",62);
        map.put("MI",64);
        map.put("FA",65);
        map.put("SOL",67);
        map.put("LA",69);
        map.put("SI",71);
        map.put("DO2",72);
    }
           
    public void synthTest(int channel, String bnote,int instru) throws MidiUnavailableException, InterruptedException{
               
        int note = map.get(bnote);
        channels[channel].programChange(instru);
        channels[channel].noteOn(note,600);
        channels[channel].noteOff(note,600);
        Thread.sleep(500);
        
    }
    
    public void melodie(String b) throws MidiUnavailableException, InterruptedException{
        String s11[] = b.split(" ");
           for (int i =0; i<s11.length;i++){
               synthTest(5,s11[i],10);
           }
    
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

           
           
