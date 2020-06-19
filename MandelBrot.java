import javax.swing.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.awt.*;
public class MandelBrot extends JPanel
{
    int sh = 1000 , sw = 1000 ;
    //BufferedImage i = new BufferedImage(sw,sh,BufferedImage.TYPE_INT_ARGB);
    Color[][] pixBuff = new Color[sw][sh];
    //int ma = 0; int mb = 0;
    double ca =  0.285 , cb = 0.01;

    double map(double x , double a , double b , double c , double d )
    {
        double y = (x-a)*(d-c)/(b-a)+c;
        return y;
    }

    void mand()
    {
        for(int y = 0; y< sh ; y++)
        {
            for(int x = 0; x< sw ; x++)
            {
                double a = map(x , 0 , sw , -1.5 , 1.5);
                double b = map(y , 0 , sh , -1.5 , 1.5);

                //double ca = a , cb = b;

                int i = 0;

                for(;i<100;i++)
                {
                    double aa = a*a - b*b ;
                    double bb = 2*a*b ;

                    a = aa + ca ; 
                    b = bb + cb ;

                    if(Math.abs(a + b) > 16)
                    {break;}
                }

                //int cc = (int)map(i,0,100,0,255);

                pixBuff[x][y] = color_map(i);
            }    
        }
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        //Graphics2D g3 = (Graphics2D)i.getGraphics();
        g2.translate(sw/2 , sh/2);
        mand();
        for(int y = -sh/2; y< sh/2 ; y++)
        {
            for(int x = -sw/2; x< sw/2 ; x++)
            {
                g2.setColor(pixBuff[x+sw/2][y+sh/2]);
                g2.drawLine(x,y,x,y);
            }    
        }
        repaint();
    }

    public static void main(String args[]) throws Exception
    {
        MandelBrot m = new MandelBrot();
        JFrame j = new JFrame("...");
        j.setSize(m.sw,m.sh);
        j.setLocation(100,100);
        j.getContentPane().add(m);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Color color_map(int n)
    {
        /* 66  30  15 # brown 3
        25   7  26 # dark violett
        9   1  47 # darkest blue
        4   4  73 # blue 5
        0   7 100 # blue 4
        12  44 138 # blue 3
        24  82 177 # blue 2
        57 125 209 # blue 1
        134 181 229 # blue 0
        211 236 248 # lightest blue
        241 233 191 # lightest yellow
        248 201  95 # light yellow
        255 170   0 # dirty yellow
        204 128   0 # brown 0
        153  87   0 # brown 1
        106  52   3 # brown 2
         */
        switch(n%16)
        {
            case 0:
            return new Color(66, 30, 15);
            case 1:
            return new Color(25, 7, 26);
            case 2:
            return new Color(9, 1, 47);
            case 3:
            return new Color(4, 4, 73);
            case 4:
            return new Color(0, 7, 100);
            case 5:
            return new Color(12, 44, 138);
            case 6:
            return new Color(24, 82, 177);
            case 7:
            return new Color(57, 125, 209);
            case 8:
            return new Color(134, 181, 229);
            case 9:
            return new Color(248, 236, 211);
            case 10:
            return new Color(241, 233, 191);
            case 11:
            return new Color(248, 201, 95);
            case 12:
            return new Color(255, 170, 0);
            case 13:
            return new Color(204, 128, 0);
            case 14:
            return new Color(153, 87, 0);
            case 15:
            return new Color(106, 52, 3);
        }
        return null;
    }
}