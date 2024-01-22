package morningbatch;

public class Calculator1 {

	
	public int add (int a , int b)
	{
	  int c = a+b;
	  return c;
	  
	}
	public int sub (int a , int b)
	{
		int d= a-b;
		return d;
	}
	
	public int mul(int a, int b)
	{
		int e= a*b;
		return e;
		
	}
	public int div (int a , int b)
	{
		int f =a/b;
		return f;
	}
	public int mod(int a , int b)
	{
		int g=a%b;
		return g;
	}
	public static void main(String[] args) {
    
		Calculator1 c1 = new Calculator1();
		System.out.println("Addition = " + c1.add(10, 20));
		System.out.println("Substraction =" + c1.sub(10, 20));
		System.out.println("Multiplication =" + c1.mul(10, 20));
		System.out.println("Division = " + c1.div(10,20));
        System.out.println("Modules = " + c1.mod(10, 20));		
	}

}
