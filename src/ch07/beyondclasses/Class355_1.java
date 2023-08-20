package ch07.beyondclasses;

public class Class355_1 extends Class355{

	public static void m2() {	//can't override final methods event tho they are static
		System.out.println("c1");
		Intf355.m2();
	}

}
