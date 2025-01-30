package methodOverriding;

public class Maruti extends Car {

	public static void main(String[] args) {
		Car c1= new Car ();
		c1.m1();
		c1.Refuel();
		c1.Start();
		c1.Stop();
		
		System.out.println("");
		
		Maruti M1=new Maruti();
		M1.m2();
		M1.Refuel();
		M1.Start();
		M1.Stop();
		M1.m1();
				
		
		
		Car c2=new Maruti ();
		c2.Start();
		c2.Stop();
		c2.Refuel();
		
				

	}
	public void Start()
	{
		System.out.println("Maruti car start");
	}
	public void Stop ()
	{
		System.out.println("Maruti car Stop");
	}
	public void Refuel()
	{
		System.out.println("maruti car refuel");
	}
	public void TheftySafety()
	{
		System.out.println("maruti Theftysafty");
	}
	public void m2()
	{
		System.out.println("m2 method");
	}
	
}
