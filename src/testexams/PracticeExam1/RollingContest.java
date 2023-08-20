package PracticeExam1;

import java.util.List;

class Roller<E extends Wheel> {
	public void roll(E e) {
	}
}

class Wheel {
}

class CartWheel extends Wheel {
}

public class RollingContest {
	Roller<CartWheel> wheel1 = new Roller<CartWheel>();
//	Roller<Wheel> wheel2 = new Roller<CartWheel>();
	Roller<? extends Wheel> wheel3 = new Roller<CartWheel>();
	Roller<? extends Wheel> wheel4 = new Roller<Wheel>();
//	Roller<? super Wheel> wheel5 = new Roller<CartWheel>();
//	Roller<? super Wheel> wheel5 = new Roller<Object>();
	Roller<? super Wheel> wheel6 = new Roller<Wheel>();
	
	public static void main(String[] args) {
		var bed = List.of((short)2,(short)5);
		var pillow = bed.parallelStream().reduce(0,
		   (a,b) -> (int)(b.doubleValue() + a.doubleValue()),
		   (c,d) -> (int)(d.doubleValue() + c.doubleValue()));
		System.out.println(pillow);
		
		Integer i=0;
		System.out.println(i.doubleValue());
	}
}
