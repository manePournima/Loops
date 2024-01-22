package morningbatch;

import java.util.Scanner;

public class Getvalue
{

	public static void main(String[] args) 
	{
		int a ,b ,c;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		System.out.println(c);
	}

}
