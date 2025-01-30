package methodOverriding;

public class StaticMethod2 extends StaticMethod1 {

	public static void main(String[] args) {
		StaticMethod2 s1= new StaticMethod2();
		s1.Test();
		s1.demo();
		s1.m11();
		
		StaticMethod1 s2=new StaticMethod2();
		s2.m11();
		s2.m22();
		s2.m33();
		StaticMethod2.m11();
		
	}

	public static void m11()
	{
		System.out.println("child static method m1");
	}
	public static void m22()
	{
		System.out.println("child static method m2");
	}
	public void Test()
	{
		System.out.println("test method");
	}

}
