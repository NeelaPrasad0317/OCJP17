package overloading;

public class Overloading {

	static  int a=5;
//	static final int a;
	static{
System.out.println(a);
	}
	
	static{
		a=10;
	}
	static void fly(long a,Long b) {
		System.out.println("1");
	}
	static void fly(Long a,long b) {
		System.out.println("2");
	}
	public static void main(String[] args) {
//		fly(9l, 9l);
//		fly(9, 9);
//		fly(Long.valueOf(10),Long.valueOf(10));
		var a=abc();
//		System.out.println(a.toString());
		
	}
	
	static int abc() {
		System.out.println(2);
		return 1;
		
	}
	
	static int b=abc();	
//	int m4() {
//		this();
//	}
}
