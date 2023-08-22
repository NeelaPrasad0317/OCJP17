package page772;

import java.util.stream.LongStream;

public class Flavors {
	private static int counter;

	public static void countIceCreamFlavors() {
		counter = 0;
		Runnable task = () -> counter++;
		LongStream.range(0, 500).forEach(m -> new Thread(task).run());
//		LongStream.range(0, 500).forEach(m -> new Thread(task).start());
		System.out.println(counter);
	}
	public static void main(String[] args) {
		countIceCreamFlavors();
	}
}
