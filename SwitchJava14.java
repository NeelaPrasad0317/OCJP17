public class SwitchJava14
{
	public static void main(String[] args) 
	{
		int a=40;
		switch (a)
		{
		case 10: System.out.println(1);
		case 20: System.out.println(2);
		System.out.println(3);
		break;
		default:System.out.println(4);
		case 30, 40: System.out.println(5); //from jav 14
		}
	}
}
