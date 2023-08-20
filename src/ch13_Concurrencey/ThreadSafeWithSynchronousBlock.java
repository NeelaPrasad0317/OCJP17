package ch13_Concurrencey;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeWithSynchronousBlock {
	public Integer count = 0;
//		Object obj=new Object();
	final Object obj = new Object();

	public void incrementCount() {
//		count=
//				count+1;
		synchronized (obj) {
			System.out.print((++count) + " ");
		}
	}

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(20);
		try {
			ThreadSafeWithSynchronousBlock ex = new ThreadSafeWithSynchronousBlock();

			for (int i = 0; i < 10; i++) {
				synchronized (ex) { // this wont solve the problem.since it is creating the threads in syncly. not
									// the execution og logic
					service.submit(() -> ex.incrementCount());
				}
			}
		} finally {
			service.shutdown();
		}
	}
}
