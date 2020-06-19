import java.awt.image.*;
import java.io.File;
import java.awt.*;
import javax.imageio.ImageIO;
public class MakingImage
{
    public static void main(String args[]) throws Exception
    {
        BufferedImage b = new BufferedImage(255,255,BufferedImage.TYPE_INT_ARGB);
        Graphics g = b.getGraphics();
        for(int i = 0 ; i<=255 ; i++)
            for(int j = 0 ; j<=255 ; j++)
            {
                g.setColor(new Color(i%255,j%255,(i*j)%255));
                g.drawLine(i,j,i,j);
            }
        ImageIO.write(b,"jpg",new File("hello.jpg"));
    }
}
