package PracticeExam2;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class CountSheep {
	private static AtomicInteger counter = new AtomicInteger();
	private Object lock = new Object();

	public  int increment1() {
		return counter.getAndIncrement();
	}

	public static  int increment2() {
		return counter.getAndIncrement();
	}

	public int increment3() {
//		synchronized (lock) {
			return counter.getAndIncrement();
//		}
	}

	public static void main(String[] args) {
		var cs = new CountSheep();
		var executor = Executors.newCachedThreadPool();
		for (int i = 0; i < 50; i++) {
			executor.submit(()->{
				System.out.println(Thread.currentThread().getName()+" "+ cs.increment1());
				System.out.println(Thread.currentThread().getName()+" "+ cs.increment2());
				System.out.println(Thread.currentThread().getName()+" "+ cs.increment3());
			});
		}
	}
}