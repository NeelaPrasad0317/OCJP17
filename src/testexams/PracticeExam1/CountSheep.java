package PracticeExam1;

import java.util.concurrent.atomic.*;

public class CountSheep {
	private static AtomicInteger counter = new AtomicInteger();
	private Object lock = new Object();

	public synchronized int increment1() {
		return counter.incrementAndGet();
	}

	public static synchronized int increment2() {
		return counter.getAndIncrement();
	}

	public int increment3() {
		synchronized (lock) {
			return counter.getAndIncrement();
		}
	}
}