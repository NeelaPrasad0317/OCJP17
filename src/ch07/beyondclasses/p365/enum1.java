package ch07.beyondclasses.p365;

import java.util.Arrays;

public enum enum1 implements Intf {
	// enum constants are always first in enum declaration
	A {
		public void m1() {// overriding m1 specific to A
			super.m1();
			System.out.println("A m1");
		}
	},
	B {
		// what ever you right here wont be useful unless u use it in overriding method.
		// since these not visible outside
		enum E1 {
			Z, Y, X
		}

		int i1 = 10;

		private void m2() {
			System.out.println("A m2");
		}

		public void m3() {
			System.out.println("A m3");
		}
	},

	C; // here ; is compulsory if the there is more content below

	enum1() {// only private modifier is allowed. implicit

	}
	 enum1(int a){// constructor overloading is  allowed
		 
	 }

	public static void main(String[] args) {
		System.out.println(A.getClass().getSuperclass());
		enum1.A.m1();
		enum1.B.m1();
//		enum1.B.m2();//it is local to that const object
//		enum1.B.m3(); //CE The method m3() is undefined for the type enum1
						// so only useful when overriding
//		enum1.B;
		
		System.out.println();
		System.out.println(Arrays.toString(enum1.values()));
		System.out.println(enum1.B.ordinal());
		System.out.println(enum1.B.name());
		
		System.out.println(enum1.valueOf("C"));
		System.out.println(enum1.valueOf("c"));
		
	}

	public void m1() {// we can make it as abstract to force every enum const. to impl their own impl
		System.out.println("enum m1");
//		enum1.B.m3();
	}

//	public default void m6() {//default methods only allowed in interfaces
//	}
}
