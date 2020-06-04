import java.util.Scanner;
public class Fibonacci
{
	public void display(int x)
	{
		int a = 1 ; int b = 0; int c = 0;
		for(int i = 0 ; i <= x ; i++)
		{
			System.out.println("#"+i+" : "+c);
			c = a+b;
			b = a ;
			a = c ;
			
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of terms : ");
		int terms = sc.nextInt();
		
		Fibonacci fb = new Fibonacci();
		fb.display(terms);
	}
}
