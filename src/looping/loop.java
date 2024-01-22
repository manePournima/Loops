package looping;

import java.util.Scanner;

public class loop 
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
			for(int i=1 ; i<=4 ; i++)
			{
				System.out.println("Enter first number");
				int a = sc.nextInt();
				System.out.println("Enter second number");
				int b = sc.nextInt();
				int c = a+b;
				System.out.println("Addition is " +c );
				System.out.println("=======");
			}
				
				
					
	}
}