package morningbatch;

public class Unaryoperator {
	public static void main (String [] args)
	{
		
		int a = 10;
		int b = 10;
		int c = 10;
		int d= 10;
		int e , f;
		  
		e= ++a + ++b + b++ + a++ + ++d;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		f= --a + --b + --c + --d;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		
		/*float f = 100000000000000000000.2f;
		 byte a = 10;
		// byte b = a+1; // default it will consider a as a int so we have to type cast it.
		 byte b = (byte)(a+1);
		System.out.println(b);
		int c =(int) (f);
		
		//  or you can write it directly as
		 //int b = a+1;
		// System.out.println(b);*/
		 
	}
}
		




		
		
		
		
			
		/* int a = 10;
		int b = 20;
		
		System.out.println(a++); //postfix
		//it will print the value first and then it will increment
		System.out.println(a);
		System.out.println(++a);// prefix
	   //it will assign the value first and the print
		
		System.out.println(b--);
		System.out.println(b);
		System.out.println(--b); // prefix */
		
	/* byte a = 10;
	// byte b = a+1; // default it will consider a as a int so we have to type cast it.
	// byte b = (byte)(a+1);
	// System.out.println(b);
	 // or you can write it directly as
	 int b = a+1;
	 System.out.println(b);
	 
		
		
	}

}*/
