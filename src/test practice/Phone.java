import java.util.Comparator;
import java.util.TreeSet;

public class Phone {
	private int number = 7;
	private Boolean mobile = false;
	{
		number = 4;
		mobile = true;
	}

	public void Phone() {
		number = 3;
		mobile = false;
	}

	public static void main(String _x[]) {
		Phone p = new Phone();
		p.number = 2;
		Phone q = new Phone();
		q.mobile = false;
		Phone r = new Phone();
		r.number = 1;
		System.out.println("P: " + p.number + "," + p.mobile);
		System.out.println("Q: " + q.number + "," + q.mobile);
		System.out.println("R: " + r.number + "," + r.mobile);

		var points = new TreeSet<Number>();
		points.add(7);
		points.add(5);
		points.add(-4);
		points.forEach(System.out::print);

		/*	var objs = new TreeSet<>(Comparator.comparing(B::getA));
			objs.add(new B(0));
			objs.add(new B(-1));
			objs.add(new B(1));
			objs.add(new B(-2));
			objs.forEach(System.out::print);*/
		var objs = new TreeSet<A>();
		objs.add(new B(0));
		objs.add(new B(-1));
		objs.add(new B(1));
		objs.add(new B(-2));
		objs.forEach(System.out::print);
		
		
//		long min1 = 123.0, max1 = 987L;
		final long min2 = 1_2_3, max2 = 9__8__7;
//		long min3 = 123, int max3 = 987;
		long min4 = 123L, max4 = 987;
//		long min5 = 123_, max5 = _987;
		max2=1;
	}

	static class A {

	}

	static class B extends A implements Comparable<B> {
		int a;

		public B(int a) {
			this.a = a;
		}

		public int getA() {
			return a;
		}
		public String toString() {
			return ""+a;
		}

		@Override
		public int compareTo(Phone.B o) {
			return a-o.a;
		}
	}
}