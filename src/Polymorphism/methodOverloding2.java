package Polymorphism;

public class methodOverloding2 {

	public static void main(String[] args) {

		methodOverloding2 MO =new methodOverloding2();
		int j=MO.m1(11);
		System.out.println(j);
		String s=MO.m1("PATIL");
		System.out.println(s);
		
		int k=m1(10, 20);
		System.out.println(k);
		

	}
		public int m1(int i)
		{
			return 10;
		}
		
		public static int m1(int i,int j)
		{
			int c=i+j;
			return c+10;
		}
		public String m1(String i)
		{
			System.out.println(i);
			return "kirti";
		}
}
