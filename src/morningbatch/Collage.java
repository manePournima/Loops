package morningbatch;

public class Collage {
	
	String name ;
	int rollno;
	String dept ;

	public static void main(String[] args) {
	 
		Collage c = new Collage();
		c.name = "Pournima";
		c.rollno = 1;
		c.dept = "Computer";
		System.out.println( "Name of Student = " + c.name + "  " + "Rollno of student = " + c.rollno + " " + "Department of Student = "+ c.dept );
		c.name = "Ganesh";
		c.rollno = 2;
		c.dept = "UPSC";
		System.out.println( "Name of Student = " + c.name + "  " + "Rollno of student = " + c.rollno + " " + "Department of Student = "+ c.dept );
		c.name = "Payal";
		c.rollno = 3;
		c.dept = "BE";
		System.out.println( "Name of Student = " + c.name + "  " + "Rollno of student = " + c.rollno + " " + "Department of Student = "+ c.dept );
		c.name = "Sejal";
		c.rollno = 4;
		c.dept = "MBA";
		System.out.println( "Name of Student = " + c.name + "  " + "Rollno of student = " + c.rollno + " " + "Department of Student = "+ c.dept );
		c.name = "Rutuja";
		c.rollno = 5;
		c.dept = "Marketing";
		System.out.println( "Name of Student = " + c.name + "  " + "Rollno of student = " + c.rollno + " " + "Department of Student = "+ c.dept );
		
     
	}

}
