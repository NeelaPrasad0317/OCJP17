package ch07.beyondclasses;

public class Class355 implements Intf355, INTF355_1 {

	public static void main(String... args) {
		new Class355().m1(1); // here it going to 2nd intf and executing overriding method in this class and
								// from there it goes to intf 1
		
		m2();//static methods from intf are not visible to the impl classes
		
	}

	public void m1(int a) {
//		Intf355.super.m1();
		Intf355.this.m1();
	}

	public void m1() { // without overriding this default method will get error. bcos it dont know from
						// which intf it has to take default impl
		System.out.println("class");
	}

	public final static void m2() {
		System.out.println("c1");
		Intf355.m2();
	}

}
