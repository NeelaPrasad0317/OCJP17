package ch11_exceptions_Locale;

import java.util.Arrays;

public class TryWithResource {

	public static void main(String[] args) {
		try {
			m1();
		} catch (Exception e) {
			System.out.println("main catch block");
			System.out.println(e);
			System.out.println(Arrays.toString(e.getSuppressed()));
		}
	}
	
	static void m1() {
		MyCloseable m1 = new MyCloseable(1);

		try (m1; MyCloseable m2 = new MyCloseable(2)) {
			System.out.println("try block");
			throw new IllegalArgumentException("From try block");
//			throw new NullPointerException();
		} catch (IllegalArgumentException e) {
			System.out.println("catch block");
			System.out.println(e);
			System.out.println(Arrays.toString(e.getSuppressed()));
		}finally {
			System.out.println("finally");
//			m2.sayHi();//out of scope
			m1.sayHi();//actually this wont work. because m1 already closed
		}
	}
}
