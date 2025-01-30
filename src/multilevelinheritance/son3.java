package multilevelinheritance;

public class son3 extends son2{

	
	
	public static void main (String [] args)
	{
		
		
		son3 s3=new son3();
		s3.bike();
		s3.cycle();
		s3.trycycle();
		
		son3.toy();
		son3.bullet();
		son3.car();
		son3.cloths();
	}
	public static void toy()
	{
		System.out.println("toy name -----remote car");
	}
}
