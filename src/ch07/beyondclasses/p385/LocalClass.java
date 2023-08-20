package ch07.beyondclasses.p385;

public class LocalClass {
	
	public static void main(String[] args) {
		new LocalClass().print();
	}
	
	public void print() {
		class local{
			static {
				test();
			}
			{
				test();
			}
		}
		
		var l=new local();
	}
	
	private static void test() {
		System.out.println("static method");
	}
}
