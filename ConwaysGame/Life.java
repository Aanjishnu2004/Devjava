import java.util.Scanner;
public class Life implements Runnable
{
    int d1, d2;
    int[][] x ;
    int g ;
    boolean loop = true;
    
    Life(int d1 , int d2 , int g)
    {
        this.d1 = d1;
        this.d2 = d2;
        this.g = g;
        this.x = new int[d1][d2];
    }
    
    protected void ranInit(int g)
    { 
        for(int i = 0; i<=x.length/g ; i++)
        {
            for(int j = 0; j<=x[0].length/g ; j++)
            {
                x[i][j] = (int)(Math.random()*10)%2;
            }
        }  
    }

    final public void checkRules()
    {
        for(int i = 0; i<x.length ; i++)
        {
            for(int j = 0; j<x[0].length ; j++)
            {
                if(lookForNeighbour(i,j) < 2)
                    x[i][j] = 0;
                else if(lookForNeighbour(i,j) > 3)
                    x[i][j] = 0;
                else if(lookForNeighbour(i,j) == 3)
                    x[i][j] = 1;
            }
        }
    }

    final public int lookForNeighbour(int i , int j)
    {
        int c = 0;
        try{ if(x[i][j+1] == 1)c++;}catch(ArrayIndexOutOfBoundsException e){}
        try{ if(x[i+1][j+1] == 1)c++;}catch(ArrayIndexOutOfBoundsException e){}
        try{ if(x[i+1][j-1] == 1)c++;}catch(ArrayIndexOutOfBoundsException e){}
        try{ if(x[i-1][j-1] == 1)c++;}catch(ArrayIndexOutOfBoundsException e){}
        try{ if(x[i-1][j+1] == 1)c++;}catch(ArrayIndexOutOfBoundsException e){}
        try{ if(x[i+1][j] == 1)c++;}catch(ArrayIndexOutOfBoundsException e){}
        try{ if(x[i-1][j] == 1)c++;}catch(ArrayIndexOutOfBoundsException e){}
        try{ if(x[i][j-1] == 1)c++;}catch(ArrayIndexOutOfBoundsException e){}
        return c;
    }

    final public void display()
    {
        for(int i = 0; i<x.length ; i++)
        {
            for(int j = 0; j<x[0].length ; j++)
            {
                System.out.print((x[i][j] == 0)?' ':'*');
            }
            System.out.println();
        }
    }

    final public void run()
    {
        Scanner sc = new Scanner(System.in);
        while(loop)
        {
            int c = sc.nextInt();
            if(c == 0)
                loop = false;
            else if(c == 1)
                {System.out.print('\u000c');ranInit(g);}
        }
    }
}
