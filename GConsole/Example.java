public class Example extends GObject
{
    public void update()
    {
        // you to override this method!! please do
        for(int i = 0; i<getLen() ; i++)
        {
            for(int j = 0 ; j<getWid() ;j++)
            {
                write(i,j,'*'); 
            }
        }    
    }

    public static void main(String args[])
    {
        Example g = new Example();
        Example.ripper(g);
        g.start();
    }
}
