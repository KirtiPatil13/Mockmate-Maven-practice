package Constructor;

public class constructor1 {
	
	String s1;
	int no;
	public constructor1()
	{
		String s1="kirti";
		int no = 12;
				
	}
	public constructor1(String s,int no)
	{
		s1=s;
		no=no;
	}

	public static void main(String[] args) {
		constructor1 c1 = new constructor1();
		c1.m2();
		c1.m1();
		
		constructor1  c2 = new constructor1("kirtip",56);
		System.out.println(c2.s1+" "+c2.no);
				
		
	}
	
	public static void m1()
	{
		//System.out.println(s1);
		//System.out.println(no);
	}
	public void m2()
	{
		System.out.println(s1);
		System.out.println(no);
	}

}
