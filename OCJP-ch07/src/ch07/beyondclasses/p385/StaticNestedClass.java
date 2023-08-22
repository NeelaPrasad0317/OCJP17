package ch07.beyondclasses.p385;

public class StaticNestedClass {

	private static class class1{
		static{
			print();
		}
		void m1() {
//			m2();
			new StaticNestedClass().m2();
		}
	}
	
	private static void print() {
		System.out.println("statuc outer method");
	}
	
	private void m2() {
		
	}
}
