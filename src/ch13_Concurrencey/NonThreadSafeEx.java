package ch13_Concurrencey;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class NonThreadSafeEx {
	public AtomicInteger count=new AtomicInteger(0);

	public void incrementCount() {
//		count=
//				count+1;
//		count.
		System.out.print(count.incrementAndGet()+" ");
	}
	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(20);
		try {
			NonThreadSafeEx ex=new NonThreadSafeEx();
		
			for (int i = 0; i < 10; i++) {
				service.submit(()->ex.incrementCount());
			}
		}finally {
			service.shutdown();
		}
	}
}
