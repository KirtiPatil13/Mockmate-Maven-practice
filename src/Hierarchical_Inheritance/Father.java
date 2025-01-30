package Hierarchical_Inheritance;

public class Father {

	public static void main(String[] args) {
	
		Father.car();
		Father.money();
		Son1.clothes();
		Son1.mobile();
		
		Son2.home();
		Son2.laptop();
		
		Son3.bike();
		Son3.cycle();
		
	}
	public static void car()
	{
		System.out.println("car name maruti");
	}
	public static void money()
	{
		System.out.println("i want 2 lakh");
	}

}
