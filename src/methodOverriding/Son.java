package methodOverriding;

public class Son extends Father  {

	public static void main(String[] args) {
		Father f1=new Father();
		f1.car();
		f1.Demo();						
		f1.Home();
		f1.Money();
		
		
		Son s1=new Son();
		s1.car();			//Static binding
		s1.Home();
		s1.Test();
		
		Father f2=new Son();
		f2.car();
		f2.Demo();							//Dynamic Binding
		f2.Home();
		f2.Money();
		
	
	}
	@Override
	public void car()
	{
		System.out.println("car name baleno");
	}
	@Override
	public void Home()
	{
		System.out.println("1BHK home");
	}

	public void Test()
	{
		System.out.println("Test class");
	}

	
}
