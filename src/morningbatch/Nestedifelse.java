package morningbatch;

public class Nestedifelse {

	public static void main(String[] args) {
		
		/*int a = 20;
		int b = 30;
		int c= 40;
		
		if(a>b) {
			System.out.println("a is less than b");
		}
		else if (a<b) 
		{
		System.out.println("a is greater than b");	
		}
		else if (a>c)
		{
			System.out.println("a is greater than c");
			
		}
		else {
			System.out.println("a is invalid");
		}*/
		
		 int weight = 47;
		 int age  =   10;
		 
		 if (age>18) {
			 if (weight > 40) {
				 System.out.println("you are eligible to donate the blood");
				
			}
			 else 
			{
				System.out.println("you are not eligible to donate the blood");
			}
			 
		   }
		   else {

					System.out.println("age must be above 18");
			
		}
	}

}
