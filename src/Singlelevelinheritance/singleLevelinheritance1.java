package Singlelevelinheritance;

public class singleLevelinheritance1 extends singleLevelinheritance{

	public static void main(String[] args) {
		
		singleLevelinheritance1 s1=new singleLevelinheritance1();
		s1.car();
		
		singleLevelinheritance1.cycle();
		singleLevelinheritance1.scoty();
		singleLevelinheritance1.bike();
	}
	public static void scoty()
	{
		System.out.println("Scooty name ------>Activa");
	}

}
