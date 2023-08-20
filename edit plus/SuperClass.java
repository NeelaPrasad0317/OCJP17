//package packagea;

public class SuperClass extends SuperSuperClass{
	private static final String a;
	private static final String b=m1();
	protected int x=10;
	protected final String c=m1();
	
	static{
		a="hi";
	}

	public SuperClass(){
	}
	private SuperClass(int a){
	}

	public static final String m1(){
		return "b";
	}

	static{
		System.out.println("super class static block");
		System.out.println(a);
		System.out.println(b);
	}

	private void m4(int q){
		System.out.println("superclass m4");
	}

	public static void main(String... args){
		new SuperClass().m4(1);
	}
}

