//import java.util.*;

public class Zoo
{
	public static void main(String[] args) 
	{
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		System.out.println(-(-1));
		float z=1+2;
		float y=2.3f;
		byte a=(byte) (-129);
		byte b=(byte) 128;
		System.out.println(a);
		System.out.println(b);
		String s="abca";
		System.out.println(!(s instanceof String));

		Integer zooTime = Integer.valueOf(9);
		Number num = zooTime;
		Object obj = zooTime;
		System.out.println(num instanceof Integer);
		System.out.println(zooTime instanceof Number);
		System.out.println();
		openZoo(1);
		openZoo((byte)1);
		openZoo((short)1);
		openZoo(1l);
		openZoo(1.1f);
		openZoo(1.1);

		System.out.println(s instanceof null);
	}

	public static void openZoo(Number time) {
		if (time instanceof Integer)
			System.out.println((Integer)time + " O'clock");
		else
			 System.out.println(time);
	}
}

