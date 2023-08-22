package packageb;
import packagea.*;

public class ClassB
{
	public static void main(String[] args) 
	{
		ClassA a;		
		System.out.println("class B");
		ClassA.main(null);
	}
}
