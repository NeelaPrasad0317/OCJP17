package ch07.beyondclasses.p359;

public interface Intf {
//	void m1();
	
	default void m1() {
		System.out.println("intf m1");
	}
	
	
	public static void m2() {
		System.out.println("tntf sm2");
	}
}
