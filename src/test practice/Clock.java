import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class Clock {
	private AtomicLong bigHand = new AtomicLong(0);

	void incrementBy10() {
		bigHand.getAndSet(bigHand.get() + 10);
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] c) throws Exception {
		var smartWatch = new Clock();
		ExecutorService s = Executors.newCachedThreadPool();
		for (int i = 0; i < 100; i++) {
			s.submit(() -> smartWatch.incrementBy10()).get();
		}
		s.shutdown();
		System.out.println(s.awaitTermination(0, TimeUnit.NANOSECONDS));
		System.out.println(smartWatch.bigHand.get());
	}
}