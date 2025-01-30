package Polymorphism;

public class methodOverloding {
	
	public static void main(String [] args)
	{
		methodOverloding.m1();
		methodOverloding mo=new methodOverloding();
		mo.m1(1);
		mo.m1(2,"Kirti");
		methodOverloding.m1("Kirti", 2);		
		methodOverloding.m1("kirti", 2,44.56f);
		
		
	}
	
	public static void m1() {

			System.out.println("Enter valid no.");
	}
	void m1(int i)
	{
		System.out.println("1 input parameter" + " " +i);
	}
	public void m1(int i, String j) {
		System.out.println("2 input parameter" +" "+i +" "+ j);
	}
	public static void m1(String i,int j)
	{
		System.out.println("interchange 2 input parameter" + " " +i +" " +j);
	}
	public static void m1(String p,int r,float k)
	{
		System.out.println("three input parameter" + " "+p +" "+r +" "+k);
	}

}
