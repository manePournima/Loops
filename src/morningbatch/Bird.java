package morningbatch;

public class Bird {

	String color;
	int age;
	int weight;
	
	//By using reference variable
	
	public static void main(String[] args)
	{
	
		Bird b = new Bird();
		b.color = "White";
		b.age = 2;
		b.weight = 10;
		
		System.out.println(b.color + " " +b.age +" "+ b.weight);
		

	/*void intObj(String c, int a , int w) {
		color = c;
		age = a;
		weight = w;
	}

	void display() {
		System.out.println(color + " " + age + " " + weight );
	}

	public static void main(String[] args) {
		Bird parrot = new Bird();
		parrot.intObj("Green", 3 , 3);
		parrot.display();*/

	}

}
