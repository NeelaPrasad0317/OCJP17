package ch13_Concurrencey;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadSafeWithVolatile {
	public volatile int count = 0;// volatile controls the threads to read and write variable one at a time. but
									// in this example there are 2 operations. read-increment & assign. while doing
									// these operations the threads may get disordered. hence the
									// disordered/duplicate values							

	public void incrementCount() {
//		count=
//				count+1;
		System.out.print((++count)+" ");
	}
	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(20);
		try {
			ThreadSafeWithVolatile ex=new ThreadSafeWithVolatile();
		
			for (int i = 0; i < 10; i++) {
				service.submit(()->ex.incrementCount());
			}
		}finally {
			service.shutdown();
		}
	}
}
