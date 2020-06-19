import java.io.File;
import java.util.*;
//import java.util.Scanner;
public class Song
{
    Synth synth;
    Scanner sc;
    int oct;
    File f;
    double bmp;
    Map<String,Integer> lookup;
    Song(String f , double bmp)
    {
        synth = new Synth();
        this.oct = 60;
        this.bmp = bmp;
        this.f = new File(f);
        lookup = new HashMap<String,Integer>();
        try{
            sc= new Scanner(this.f);
        }
        catch(Exception e)
        {
            System.out.println(e);
            stopPlay();
        }
        init();
    }

    void init()
    {
        lookup.put("^",-1);
        lookup.put("(",-2);
        lookup.put(")",-3);
        lookup.put("--S",oct-12);
        lookup.put("-R-",oct-11);
        lookup.put("-R",oct-10);
        lookup.put("-G-",oct-9);
        lookup.put("-G",oct-8);
        lookup.put("-M",oct-7);
        lookup.put("-M-",oct-6);
        lookup.put("-P",oct-5);
        lookup.put("-D-",oct-4);
        lookup.put("-D",oct-3);
        lookup.put("-N-",oct-2);
        lookup.put("-N",oct-1);
        lookup.put("S",oct);
        lookup.put("R-",oct+1);
        lookup.put("R",oct+2);
        lookup.put("G-",oct+3);
        lookup.put("G",oct+4);
        lookup.put("M",oct+5);
        lookup.put("M-",oct+6);
        lookup.put("P",oct+7);
        lookup.put("D-",oct+8);
        lookup.put("D",oct+9);
        lookup.put("N-",oct+10);
        lookup.put("N",oct+11);
        lookup.put("+S",oct+12);
        lookup.put("+R-",oct+13);
        lookup.put("+R",oct+14);
        lookup.put("+G-",oct+15);
        lookup.put("+G",oct+16);
        lookup.put("+M",oct+17);
        lookup.put("+M-",oct+18);
        lookup.put("+P",oct+19);
        lookup.put("+D-",oct+20);
        lookup.put("+D",oct+21);
        lookup.put("+N-",oct+22);
        lookup.put("+N",oct+23);
        lookup.put("++S",oct+24);
    }

    public void play()
    {
        boolean chord = false;
        while(sc.hasNext())
        {
            int note;
            try{note = lookup.get(sc.next());}catch(Exception e){continue;}
            if(note > 0)
                {synth.playNote(note,600);}//System.out.println(i);i++;}
            if(note == -2)chord = true;
            if(note == -3)chord = false;
            if(!chord)
            {
                double late = System.nanoTime()/10E9;
                while(System.nanoTime()/10E9 - late < bmp);
            }
        }
    }

    public void stopPlay()
    {
        synth.close();
    }

    public static void main(String args[])
    {
        Song s;
        try{
            s = new Song(args[0] , Double.parseDouble(args[1]));
        }catch(Exception e)
        {s = new Song("photograph.txt" , 0.05);}
        s.play();
        s.stopPlay();
    }
}
