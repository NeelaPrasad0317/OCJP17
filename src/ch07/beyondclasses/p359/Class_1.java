package ch07.beyondclasses.p359;

public class Class_1 extends AbstractClass implements Intf {

	public static void main(String[] args) {
		new Class_1().m1();
		new Class_1().classm1();
	}
	
	void classm1() {
		Intf.super.m1();
		Intf.m2();
	}

}
