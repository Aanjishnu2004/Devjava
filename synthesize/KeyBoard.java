import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
public class KeyBoard extends JPanel implements KeyListener
{
    Synth s ;
    int oct = 60;
    int vol = 1000;
    Map<Integer,Boolean> pressed;
    public KeyBoard()
    {
        addKeyListener(this);
        pressed = new HashMap<Integer,Boolean>();
        setFocusable(true);
        requestFocus();
        s = new Synth();
        init();
    }

    void init()
    {
        pressed.put(KeyEvent.VK_1 , false);
        pressed.put(KeyEvent.VK_Q , false);
        pressed.put(KeyEvent.VK_2 , false);
        pressed.put(KeyEvent.VK_W , false);
        pressed.put(KeyEvent.VK_3 , false);
        pressed.put(KeyEvent.VK_E , false);
        pressed.put(KeyEvent.VK_R , false);
        pressed.put(KeyEvent.VK_5 , false);
        pressed.put(KeyEvent.VK_T , false);
        pressed.put(KeyEvent.VK_6 , false);
        pressed.put(KeyEvent.VK_Y , false);
        pressed.put(KeyEvent.VK_U , false);
        pressed.put(KeyEvent.VK_8 , false);
        pressed.put(KeyEvent.VK_I , false);
        pressed.put(KeyEvent.VK_9 , false);
        pressed.put(KeyEvent.VK_O , false);
        pressed.put(KeyEvent.VK_0 , false);
        pressed.put(KeyEvent.VK_P , false);
        pressed.put(KeyEvent.VK_Z , false);
        pressed.put(KeyEvent.VK_S , false);
        pressed.put(KeyEvent.VK_X , false);
        pressed.put(KeyEvent.VK_D , false);
        pressed.put(KeyEvent.VK_C , false);
        pressed.put(KeyEvent.VK_V , false);
        pressed.put(KeyEvent.VK_G , false);
        pressed.put(KeyEvent.VK_B , false);
        pressed.put(KeyEvent.VK_H , false);
        pressed.put(KeyEvent.VK_N , false);
        pressed.put(KeyEvent.VK_J , false);
        pressed.put(KeyEvent.VK_M , false);
        pressed.put(KeyEvent.VK_COMMA , false);
        pressed.put(KeyEvent.VK_L , false);
        pressed.put(KeyEvent.VK_PERIOD , false);
        pressed.put(KeyEvent.VK_SEMICOLON , false);
        pressed.put(KeyEvent.VK_SLASH , false);
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.clearRect(0,0,getWidth(),getHeight());
        g.drawRect(0,0,500,500);
    }

    public void keyPressed(KeyEvent e)
    {
        
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_1:
            if(!pressed.get(KeyEvent.VK_1))
            s.playNote(oct-18,vol);
            pressed.replace(KeyEvent.VK_1, true);
            break;
            
            case KeyEvent.VK_Q:
            if(!pressed.get(KeyEvent.VK_Q))
            s.playNote(oct-17,vol);
            pressed.replace(KeyEvent.VK_Q , true);
            break;
            
            case KeyEvent.VK_2:
            if(!pressed.get(KeyEvent.VK_2))
            s.playNote(oct-16,vol);
            pressed.replace(KeyEvent.VK_2 , true);
            break;
            
            case KeyEvent.VK_W:
            if(!pressed.get(KeyEvent.VK_W))
            s.playNote(oct-15,vol);
            pressed.replace(KeyEvent.VK_W, true);
            break;
            
            case KeyEvent.VK_3:
            if(!pressed.get(KeyEvent.VK_3))
            s.playNote(oct-14,vol);
            pressed.replace(KeyEvent.VK_3, true);
            break;
            
            case KeyEvent.VK_E:
            if(!pressed.get(KeyEvent.VK_E))
            s.playNote(oct-13,vol);
            pressed.replace(KeyEvent.VK_E , true);
            break;
            
            case KeyEvent.VK_R:
            if(!pressed.get(KeyEvent.VK_R))
            s.playNote(oct-12,vol);
            pressed.replace(KeyEvent.VK_R , true);
            break;
            
            case KeyEvent.VK_5:
            if(!pressed.get(KeyEvent.VK_5))
            s.playNote(oct-11,vol);
            pressed.replace(KeyEvent.VK_5 , true);
            break;
            
            case KeyEvent.VK_T:
            if(!pressed.get(KeyEvent.VK_T))
            s.playNote(oct-10,vol);
            pressed.replace(KeyEvent.VK_T , true);
            break;
            
            case KeyEvent.VK_6:
            if(!pressed.get(KeyEvent.VK_6))
            s.playNote(oct-9,vol);
            pressed.replace(KeyEvent.VK_6 , true);
            break;
            
            case KeyEvent.VK_Y:
            if(!pressed.get(KeyEvent.VK_Y))
            s.playNote(oct-8,vol);
            pressed.replace(KeyEvent.VK_Y , true);
            break;
            
            case KeyEvent.VK_U:
            if(!pressed.get(KeyEvent.VK_U))
            s.playNote(oct-7,vol);
            pressed.replace(KeyEvent.VK_U , true);
            break;
            
            case KeyEvent.VK_8:
            if(!pressed.get(KeyEvent.VK_8))
            s.playNote(oct-6,vol);
            pressed.replace(KeyEvent.VK_8 , true);
            break;
            
            case KeyEvent.VK_I:
            if(!pressed.get(KeyEvent.VK_I))
                s.playNote(oct-5,vol);
            pressed.replace(KeyEvent.VK_I , true);
            break;
            
            case KeyEvent.VK_9:
            if(!pressed.get(KeyEvent.VK_9))
            s.playNote(oct-4,vol);
            pressed.replace(KeyEvent.VK_9 , true);
            break;
            
            case KeyEvent.VK_O:
            if(!pressed.get(KeyEvent.VK_O))
            s.playNote(oct-3 ,vol);
            pressed.replace(KeyEvent.VK_O , true);
            break;
            
            case KeyEvent.VK_0:
            if(!pressed.get(KeyEvent.VK_0))
            s.playNote(oct-2,vol);
            pressed.replace(KeyEvent.VK_0 , true);
            break;
            
            case KeyEvent.VK_P:
            if(!pressed.get(KeyEvent.VK_P))
            s.playNote(oct-1,vol);
            pressed.replace(KeyEvent.VK_P , true);
            break;
            
            case KeyEvent.VK_Z:
            if(!pressed.get(KeyEvent.VK_Z))
                s.playNote(oct,vol);
            pressed.replace(KeyEvent.VK_Z , true);
            break;
            
            case KeyEvent.VK_S:
            if(!pressed.get(KeyEvent.VK_S))
            s.playNote(oct+1,vol);
            pressed.replace(KeyEvent.VK_S, true);
            break;
            
            case KeyEvent.VK_X:
            if(!pressed.get(KeyEvent.VK_X))
            s.playNote(oct+2,vol);
            pressed.replace(KeyEvent.VK_X , true);
            break;
            
            case KeyEvent.VK_D:
            if(!pressed.get(KeyEvent.VK_D))
            s.playNote(oct+3,vol);
            pressed.replace(KeyEvent.VK_D , true);
            break;
            
            case KeyEvent.VK_C:
            if(!pressed.get(KeyEvent.VK_C))
            s.playNote(oct+4,vol);
            pressed.replace(KeyEvent.VK_C, true);
            break;
            
            case KeyEvent.VK_V:
            if(!pressed.get(KeyEvent.VK_V))
            s.playNote(oct+5,vol);
            pressed.replace(KeyEvent.VK_V, true);
            break;
            
            case KeyEvent.VK_G:
            if(!pressed.get(KeyEvent.VK_G))
            s.playNote(oct+6,vol);
            pressed.replace(KeyEvent.VK_G , true);
            break;
            
            case KeyEvent.VK_B:
            if(!pressed.get(KeyEvent.VK_B))
            s.playNote(oct+7,vol);
            pressed.replace(KeyEvent.VK_B , true);
            break;
            
            case KeyEvent.VK_H:
            if(!pressed.get(KeyEvent.VK_H))
            s.playNote(oct+8,vol);
            pressed.replace(KeyEvent.VK_H , true);
            break;
            
            case KeyEvent.VK_N:
            if(!pressed.get(KeyEvent.VK_N))
            s.playNote(oct+9,vol);
            pressed.replace(KeyEvent.VK_N , true);
            break;
            
            case KeyEvent.VK_J:
            if(!pressed.get(KeyEvent.VK_J))
            s.playNote(oct+10,vol);
            pressed.replace(KeyEvent.VK_J , true);
            break;
            
            case KeyEvent.VK_M:
            if(!pressed.get(KeyEvent.VK_M))
            s.playNote(oct+11,vol);
            pressed.replace(KeyEvent.VK_M , true);
            break;
            
            case KeyEvent.VK_COMMA:
            if(!pressed.get(KeyEvent.VK_COMMA))
            s.playNote(oct+12,vol);
            pressed.replace(KeyEvent.VK_COMMA , true);
            break;
            
            case KeyEvent.VK_L:
            if(!pressed.get(KeyEvent.VK_L))
            s.playNote(oct+13,vol);
            pressed.replace(KeyEvent.VK_L , true);
            break;
            
            case KeyEvent.VK_PERIOD:
            if(!pressed.get(KeyEvent.VK_PERIOD))
            s.playNote(oct+14,vol);
            pressed.replace(KeyEvent.VK_PERIOD , true);
            break;
            
            case KeyEvent.VK_SEMICOLON:
            if(!pressed.get(KeyEvent.VK_SEMICOLON))
                s.playNote(oct+15,vol);
            pressed.replace(KeyEvent.VK_SEMICOLON , true);
            break;
            
            case KeyEvent.VK_SLASH:
            if(!pressed.get(KeyEvent.VK_SLASH))
            s.playNote(oct+16,vol);
            pressed.replace(KeyEvent.VK_SLASH , true);
            break;
        }

        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
            s.close();
    }

    public void keyTyped(KeyEvent e)
    {

    }

    public void keyReleased(KeyEvent e)
    {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_1:
            s.stopNote(oct-18,vol);
            pressed.replace(KeyEvent.VK_1, false);
            break;
            
            case KeyEvent.VK_Q:
            s.stopNote(oct-17,vol);
            pressed.replace(KeyEvent.VK_Q , false);
            break;
            
            case KeyEvent.VK_2:
            s.stopNote(oct-16,vol);
            pressed.replace(KeyEvent.VK_2 , false);
            break;
            
            case KeyEvent.VK_W:
            s.stopNote(oct-15,vol);
            pressed.replace(KeyEvent.VK_W, false);
            break;
            
            case KeyEvent.VK_3:
            s.stopNote(oct-14,vol);
            pressed.replace(KeyEvent.VK_3, false);
            break;
            
            case KeyEvent.VK_E:
            s.stopNote(oct-13,vol);
            pressed.replace(KeyEvent.VK_E , false);
            break;
            
            case KeyEvent.VK_R:
            s.stopNote(oct-12,vol);
            pressed.replace(KeyEvent.VK_R , false);
            break;
            
            case KeyEvent.VK_5:
            s.stopNote(oct-11,vol);
            pressed.replace(KeyEvent.VK_5 , false);
            break;
            
            case KeyEvent.VK_T:
            s.stopNote(oct-10,vol);
            pressed.replace(KeyEvent.VK_T , false);
            break;
            
            case KeyEvent.VK_6:
            s.stopNote(oct-9,vol);
            pressed.replace(KeyEvent.VK_6 , false);
            break;
            
            case KeyEvent.VK_Y:
            s.stopNote(oct-8,vol);
            pressed.replace(KeyEvent.VK_Y , false);
            break;
            
            case KeyEvent.VK_U:
            s.stopNote(oct-7,vol);
            pressed.replace(KeyEvent.VK_U , false);
            break;
            
            case KeyEvent.VK_8:
            s.stopNote(oct-6,vol);
            pressed.replace(KeyEvent.VK_8 , false);
            break;
            
            case KeyEvent.VK_I:
            s.stopNote(oct-5,vol);
            pressed.replace(KeyEvent.VK_I , false);
            break;
            
            case KeyEvent.VK_9:
            s.stopNote(oct-4,vol);
            pressed.replace(KeyEvent.VK_9 , false);
            break;
            
            case KeyEvent.VK_O:
            s.stopNote(oct-3 ,vol);
            pressed.replace(KeyEvent.VK_O , false);
            break;
            
            case KeyEvent.VK_0:
            s.stopNote(oct-2,vol);
            pressed.replace(KeyEvent.VK_0 , false);
            break;
            
            case KeyEvent.VK_P:
            s.stopNote(oct-1,vol);
            pressed.replace(KeyEvent.VK_P , false);
            break;
            
            case KeyEvent.VK_Z:
            s.stopNote(oct,vol);
            pressed.replace(KeyEvent.VK_Z , false);
            break;
            
            case KeyEvent.VK_S:
            s.stopNote(oct+1,vol);
            pressed.replace(KeyEvent.VK_S, false);
            break;
            
            case KeyEvent.VK_X:
            s.stopNote(oct+2,vol);
            pressed.replace(KeyEvent.VK_X , false);
            break;
            
            case KeyEvent.VK_D:
            s.stopNote(oct+3,vol);
            pressed.replace(KeyEvent.VK_D , false);
            break;
            
            case KeyEvent.VK_C:
            s.stopNote(oct+4,vol);
            pressed.replace(KeyEvent.VK_C, false);
            break;
            
            case KeyEvent.VK_V:
            s.stopNote(oct+5,vol);
            pressed.replace(KeyEvent.VK_V, false);
            break;
            
            case KeyEvent.VK_G:
            s.stopNote(oct+6,vol);
            pressed.replace(KeyEvent.VK_G , false);
            break;
            
            case KeyEvent.VK_B:
            s.stopNote(oct+7,vol);
            pressed.replace(KeyEvent.VK_B , false);
            break;
            
            case KeyEvent.VK_H:
            s.stopNote(oct+8,vol);
            pressed.replace(KeyEvent.VK_H , false);
            break;
            
            case KeyEvent.VK_N:
            s.stopNote(oct+9,vol);
            pressed.replace(KeyEvent.VK_N , false);
            break;
            
            case KeyEvent.VK_J:
            s.stopNote(oct+10,vol);
            pressed.replace(KeyEvent.VK_J , false);
            break;
            
            case KeyEvent.VK_M:
            s.stopNote(oct+11,vol);
            pressed.replace(KeyEvent.VK_M , false);
            break;
            
            case KeyEvent.VK_COMMA:
            s.stopNote(oct+12,vol);
            pressed.replace(KeyEvent.VK_COMMA , false);
            break;
            
            case KeyEvent.VK_L:
            s.stopNote(oct+13,vol);
            pressed.replace(KeyEvent.VK_L, false);
            break;
            
            case KeyEvent.VK_PERIOD:
            s.stopNote(oct+14,vol);
            pressed.replace(KeyEvent.VK_PERIOD , false);
            break;
            
            case KeyEvent.VK_SEMICOLON:
            s.stopNote(oct+15,vol);
            pressed.replace(KeyEvent.VK_SEMICOLON , false);
            break;
            
            case KeyEvent.VK_SLASH:
            s.stopNote(oct+16,vol);
            pressed.replace(KeyEvent.VK_SLASH , false);
            break;
            
        }
    }

    public static void main(String args[])
    {
        KeyBoard k = new KeyBoard();
        JFrame j  = new JFrame("...");
        j.setSize(700,700);
        j.getContentPane().add(k);
        j.setVisible(true);
    }
}
