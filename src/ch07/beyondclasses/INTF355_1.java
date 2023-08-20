package ch07.beyondclasses;

public interface INTF355_1 {
	default void m1() {
		System.out.println("2");
	}

	default void m1(int a) {
		System.out.println("3");
	}
}
