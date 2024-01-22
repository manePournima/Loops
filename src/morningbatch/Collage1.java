package morningbatch;


public class Collage1 {

	String dept;
	String name ;
	int rollno ;
	
	public Collage1 (String dept , String name , int rollno )
	{
		System.out.println(" Student Department = " + dept + " ||" + " Student  Name = " + name  + " || " + " Student Rollno = " + rollno + " || " );
		System.out.println("-----------------------------------------------------------------------------------------");
	}
	public static void main(String[] args) {
     
	Collage1 c1 = new Collage1("Java  Developer" , " Pournima ", 1111);
	
	Collage1 c2 = new Collage1("Enginer " , " Payal", 1112);

	Collage1 c3= new Collage1("Full Stack Developer " , " Ganesh ", 1113);

	Collage1 c4 = new Collage1("MBA Finance " , " Sejal ", 1114);

	Collage1 c5 = new Collage1("MBA Marketing " , " Rutuja ", 1115);


	}

}
