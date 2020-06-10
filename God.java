public class God extends Life
{
    public God(int x , int y , int g)
    {
        super(x,y,g);
    }
    
    public static void main(String args[])throws Exception
    {
        God l  =new God(25,100,2);
        Thread t = new Thread(l); 
        t.start();
        l.ranInit(3);
        while(l.loop)
        {
            System.out.print('\u000c');
            l.display();
            l.checkRules();
            Thread.sleep(100);
        }
    }
    
    protected void ranInit(int g)
    {
        for(int i = 0; i<x.length-2 ; i++)
        {
            for(int j = 0; j<x[0].length-2 ; j++)
            {
                if(i <= g && j <= g)
                    x[i+2][j+2] = ((int)(Math.random()*10)%2);
            }
        }
    }
}