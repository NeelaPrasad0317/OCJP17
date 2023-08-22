package ch07.beyondclasses;

public interface Intf355 {

	default void m1() {
		System.out.println(1);
	}
	
	public static void m2() {
		System.out.println("a1");
	}
}

