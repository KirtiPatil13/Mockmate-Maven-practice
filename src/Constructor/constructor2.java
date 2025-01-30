package Constructor;

public class constructor2 {
	
	
	String Name;
	String Model;
	int price;
	String Engine;
	int year;
	
public constructor2(String Name1,String Model1,int price1,String Engine1,int year1)
	{
		Name = Name1 ;
		Model=Model1;
		price=price1;
		Engine=Engine1;
		year=year1;
		
	}

	public static void main(String[] args) {
		constructor2 c1=new constructor2("kia","ert",1230000,"fdv",1234);
		
		
		System.out.println(c1.Model +" "+c1.Name+" "+c1.Engine+" "+c1.price+" "+c1.year);
		
		c1.m1();
		c1.m2();
	}
	
	public void m1()
	{
		System.out.println("m1 method");
	}
	public static void m2()
	{
		System.out.println("m2 method");
	}
}
