package ch07.beyondclasses.p367;

public sealed class NoPermits {

}

//here one of 3 has to be there
non-sealed class A1 extends NoPermits {

}

sealed class A2 extends A1 permits A2.B1, B2, A3 {// here we need to mention the reference to the subclass name if it is
													// a nested class
	final class B1 extends A2 {

	}
}

final class A3 extends A2 {

}
 final class X1 extends A2{}
