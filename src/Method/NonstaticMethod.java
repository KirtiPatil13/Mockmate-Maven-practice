package Method;

public class NonstaticMethod {

	public static void main(String[] args) {
		
		NonstaticMethod N1 = new NonstaticMethod ();
		N1.m1();
		N1.m2();
		
	}
	
	public void m1()
	{
		System.out.println("m1 method");
	}
	public void m2()
	{
		System.out.println("m2 method");
	}

}
