package methodOverriding;

public class FinalMethod1 {

	public static void main(String[] args) {
	

	}
	public final void m1()
	{
		System.out.println("Final method m1");
	}
	public void m2()
	{
		System.out.println("non static method m2");
	}
	public final void m3()
	{
		System.out.println("final method m3");
	}

}
