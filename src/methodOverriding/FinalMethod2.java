package methodOverriding;

public class FinalMethod2 extends FinalMethod1 {

	public static void main(String[] args) {
		
		FinalMethod2 f1=new FinalMethod2();
		f1.m1();
		f1.m2();
		f1.m3();
		FinalMethod1 f2=new FinalMethod2();
		f2.m1();
		f2.m2();

	}

	
	public void m4()
	{
		System.out.println("m4 method");
	}

	/*
	 * public final void m1() 
	 * { 
	 * 	System.out.println("m4 final method"); 
	 * }
	 */
	public void m2()
	{
		System.out.println("method m2 FinalMethod2");
	}
	
}
