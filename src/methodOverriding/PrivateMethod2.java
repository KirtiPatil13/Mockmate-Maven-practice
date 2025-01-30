package methodOverriding;

public class PrivateMethod2 extends PrivateMethod1{

	public static void main(String[] args) {
		PrivateMethod2 p1=new PrivateMethod2();
		p1.m1();
		
		PrivateMethod1 p2=new PrivateMethod2();
		//p2.m1();
		p2.m3();
	}
	private void m1()
	{
		System.out.println("private m1 method---->");
	}
}
