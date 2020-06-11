public class GEngine
{
    private OutputManager out;        
    private char[][] screenBuffer;
    private int screenLength;
    private int screenWidth;
    protected boolean renderLoop; 
    public boolean DEBUG = false;
    protected int fps = 60;
    //public static boolean pause;
    
    protected GEngine(int screenLength , int screenWidth)
    {
        this.out = new OutputManager();
        this.screenLength = screenLength;
        this.screenWidth = screenWidth;
        this.screenBuffer = new char[screenLength][screenWidth];
        //this.pause = false;
    }

    private void init()
    {
        //intiating the loop
        this.renderLoop = true ;

        //initalizing the buffer to all ' '
        initScreen();

        //starting the run loop
        process();
    }

    protected void initScreen()
    {
        for(int i = 0 ; i<screenLength ; i++)
        {
            for(int  j =0 ; j<screenWidth ; j++)
            {
                screenBuffer[i][j] = ' ' ;
            }
        }
    }

    private void process()
    {
        while(renderLoop)
        {
            //if(pause) continue;
            update();
            display();
            if(!DEBUG)
            try{Thread.sleep(fps);}catch(Exception e){}
            else if(DEBUG)
            try{System.in.read();}catch(Exception e){}
            cls0();
        }
    }

    protected void update()
    {
        // you to override this method!! please do
    }

    protected void dispose()
    {
        this.renderLoop = false;
    }

    private void cls0()
    {
        try{new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();}catch(Exception e){out.print('\u000c');}
    }

    protected void write(int x , int y , char c)
    {
        screenBuffer[x][y] = c ;
    }

    protected void display()
    {
        for(int i = 0; i<screenLength ; i++)
        {
            for(int j = 0 ; j<screenWidth ;j++)
            {
                out.print(screenBuffer[i][j]);
            }
            out.print('\n');
        }
    }

    protected int getLen()
    {
        return screenLength;
    }

    protected int getWid()
    {
        return screenWidth;
    }
    
    public void start()
    {
        init();
    }
}