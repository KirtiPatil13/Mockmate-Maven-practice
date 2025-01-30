package Method;

public class Nonstaticmethod2 {

	public static void main(String[] args) {
		
		Nonstaticmethod2 N2 = new Nonstaticmethod2();
		N2.m4();
		N2.m6();
		Nonstaticmethod2.m6();
		
		 NonstaticMethod N3 = new  NonstaticMethod ();
		 N3.m1();
		 N3.m2();
	}
	
	public void m4()
	{
		System.out.println("m4 method");
	}
	public static void m6()
	{
		System.out.println("method m6");
	}

}
