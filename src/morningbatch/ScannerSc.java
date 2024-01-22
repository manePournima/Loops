package morningbatch;

import java.util.Scanner;

public class ScannerSc {
	
	// User input 
	
	public static void main (String [] args)
	{
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("ENTER THE NAME");
	
	String name = sc.next();
	
	if(name.contains("Pournima"))
	{
		System.out.println("match");
	}
	else {
		System.out.println("no match");
	}	
	
	System.out.println("ENTER AGE");
	
	int age = sc.nextInt();
	

}
}
