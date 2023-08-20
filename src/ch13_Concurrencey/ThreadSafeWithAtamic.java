package ch13_Concurrencey;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.*;
import java.util.concurrent.Executors;

public class ThreadSafeWithAtamic {
	public AtomicInteger count = new AtomicInteger(0);

	public void incrementCount() {
//		count=
//				count+1;
		System.out.print((count.incrementAndGet())+" ");
	}
	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(20);
		try {
			ThreadSafeWithAtamic ex=new ThreadSafeWithAtamic();
		
			for (int i = 0; i < 10; i++) {
				service.submit(()->ex.incrementCount());
			}
		}finally {
			service.shutdown();
		}
	}
}
