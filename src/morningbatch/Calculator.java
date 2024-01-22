package morningbatch;

public class Calculator
{ 
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int subtract(int a,int b)
	{ 
		return a-b;
		
	}
	public static float multiply(float a, float b)
	{
		return a*b;
	}
	public int divide(int a,int b)
	{
		return a/b;
	}
	
public static void main(String[] args) 
	{
		
	
		Calculator c=new Calculator();
		System.out.println(c.add(10, 20));
		System.out.println(c.subtract(20, 10));
		System.out.println(c.multiply(10.0f, 20.0f));
		System.out.println(c.divide(100, 20));

	}
}
