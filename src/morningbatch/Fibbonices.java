package morningbatch;

public class Fibbonices {

	public static void main(String[] args) {

		int firstvalue= 0 ;
		int secondvalue =1;
		System.out.println(firstvalue + " " +secondvalue);
		int nextvalue;
		
		for ( int i=0;i<=10;++i)
		{
			nextvalue= firstvalue+secondvalue;
			System.out.println(nextvalue);
			firstvalue=secondvalue;
			secondvalue=nextvalue;
		}
		
	}

}
