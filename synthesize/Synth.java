import javax.sound.midi.*;
import java.util.Scanner;
public class Synth
{
    Synthesizer sy = null;
    MidiChannel[] m;
    Instrument[] ins;
    public Synth()
    {
        try
        {
            sy = MidiSystem.getSynthesizer();
            sy.open();
            m = sy.getChannels();
            ins = sy.getDefaultSoundbank().getInstruments();
            sy.loadInstrument(ins[90]);
        }
        catch(Exception e){}
    }

    public void playNote(int mote , int vol)
    {
        m[0].noteOn(mote,vol);   
    }

    public void stopNote(int mote , int vol)
    {
        m[0].noteOff(mote,vol);   
    }
    
    public void close()
    {
        sy.close();
    }
}