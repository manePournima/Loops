package morningbatch;


public class Variables {

	int a = 10; // instance variable (global)
	static int b = 20; // static variable

	void add()// local variable
	{
		int c = 30, d;
		d = a + b + c;
		System.out.println("Addition = " + d);
	}

	void mul() {
		int e = 2, f;
		f = a * b * e;
		System.out.println("Multiplication " + (f));
	}

	public static void main(String[] args) {

		Variables v = new Variables();
		System.out.println(v.a);
		System.out.println(b);
		v.add();
		v.mul();
		v.a = 100;
		v.b = 200;
		System.out.println(v.a);
		System.out.println(b);
	}
}


