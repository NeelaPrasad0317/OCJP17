public class Chick
{
	String name="fluffy";
	{
		System.out.println(name);
		System.out.println("initializer block");
//		System.out.println(name2);
	}
	String name2="bobby";	
	public Chick(){
		this.name="puppy";
		System.out.println("constuctor");
	}
	public static void main(String[] args) 	{
		Chick c=new Chick();
		System.out.println(c.name);
//		double notAtStart = _1000.00; // DOES NOT COMPILE
//		double notAtEnd = 1000.00_; // DOES NOT COMPILE
//		double notByDecimal = 1000_.00; // DOES NOT COMPILE
		double annoyingButLegal = 1_00_0.0_0; // Ugly, but compiles
		double reallyUgly = 1__________2; // Also compiles
	}
}
