//package packagea;
public class SubClass extends SuperClass{
	private static final String a="subclass a";
	int x=20;
	
	static {
		System.out.println("subclass static block");
	}

	private SubClass(int a){
//		super();
		super(a);
	}
	
	public static void main(String[] args) {
//		System.out.println(new SubClass().this.x);
		System.out.println(new SubClass(1).x);
		var sc=new SubClass(1);
		System.out.println(sc.m1());
		System.out.println(sc.m2());
	}

	public String m2(){
		System.out.println(this.x);
		System.out.println(super.x);
//		System.out.println(this.super.x);
		System.out.println(this.a);
//		System.out.println(super.a);
		return "subclass";
	}


}
