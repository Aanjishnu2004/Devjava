public class GObject extends GEngine implements Runnable
{
    public GObject()    
    {
        super(10,20);
        super.fps = 60;
        super.DEBUG = false;
    }

    public void update()
    {
        // you to override this method!! please do
        boolean bool = true;
        for(int i = 0; i<getLen() ; i++)
        {
            for(int j = 0 ; j<getWid() ;j++)
            {
                if(bool)
                    write(i,j,'*'); 
                bool = !bool ;
            }
        }
    }
    
    public void run()
    {
        while(renderLoop)
        {
            int r = 0;
            try{r = System.in.read();}catch(Exception e){};
            if(r == 'q')
            {
                renderLoop = false;
            }
        }
    }

    public static void ripper(GObject g)
    {
        if(!g.DEBUG)
        {
            Thread t = new Thread(g);
            t.start();
        }
    }
}