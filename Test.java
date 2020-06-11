import java.util.Scanner;

// THis is to find the subscript of consecutive elements

public class Test
{
    int[] x;
    String str;
    int start;
    
    Test()
    {
        str = "";
        start  = 0;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Elements: ");
        int size = sc.nextInt();
        x = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i<size ; i++)
        {
            x[i] = sc.nextInt();
        }
    }

    public void test()
    {   
        for(int i = 0; i<x.length ; i++)
        {
            checkForSeries(i);
        }
    }

    public void checkForSeries(int a)
    {
        String str = x[a]+"";
        for(int i = a ; i<x.length-1 ; i++)
        {
            if(x[i]+1 == x[i+1])
            {
                str += x[i+1];
            }
            else
            {
                break;
            }
        }
        if(this.str.length() < str.length())
        {
            this.str = str;this.start = a;
        }
    }

    public void display()
    {
        if(str.length() <= 1)
        {
            System.out.println("Sorry match not found!!");return;
        }
        for(int i =0 ;i<str.length() ; i++)
        {
            System.out.print(str.charAt(i)+", ");
        }
        System.out.print(" subscript:"+start+" to "+(start+str.length()-1));
    }

    public static void main(String args[])
    {
        Test t =new Test();
        t.input();
        t.test();
        t.display();
    }
}