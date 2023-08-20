package ch13_Concurrencey;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureTest {
	public static int counter = 0;

	public static void main(String[] args) {
		System.out.println("main start");
		ExecutorService service = Executors.newSingleThreadExecutor();

		// Runnable
		/*	Future<?> result = service.submit(()->{
				for (int i = 0; i < 1_000_000; i++) {
		//				counter++;
					try {
						Thread.sleep(1_000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(i==15) {
						break;
					}
				}
			});
		*/

		// Callable
		Future<?> result = service.submit(() -> {
			for (int i = 0; i < 1_000_000; i++) {
				// counter++;
				try {
					Thread.sleep(1_000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i == 15) {
					break;
				}
			}
			return 15;
		});

		System.out.println(result.isDone());
		System.out.println(result.isCancelled());
		try {
			service.shutdown();
//			System.out.println(service.isShutdown());
			System.out.println(service.shutdownNow());//it will sutdown service through interrupt method. if it is affecting the task, then it won't terminate. just like: if the interruptedException is caught
			System.out.println(service.awaitTermination(5, TimeUnit.SECONDS));
//			System.out.println(result.cancel(false));
			System.out.println(result.get());//waits until end
			System.out.println(result.get(10, TimeUnit.SECONDS));// wait for given time & throwa Timeout exception
			System.out.println(result.isDone());
		} catch (InterruptedException|ExecutionException |TimeoutException e) {
			e.printStackTrace();
		} catch (Exception e2) {
			e2.printStackTrace();
		}finally {
			service.shutdown();
		}
		System.out.println(service.isTerminated());
		System.out.println("main end");
	}
}
