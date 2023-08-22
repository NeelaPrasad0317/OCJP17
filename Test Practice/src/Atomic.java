import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Atomic {

//	static AtomicLong monkey2 = new AtomicLong(0);
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			extracted();

		}
	}

	private static void extracted() {
		 AtomicInteger monkey1 = new AtomicInteger(0);
		 AtomicInteger monkey2 = new AtomicInteger(0);
		ExecutorService service = Executors.newFixedThreadPool(100);
		try {
			for (int i = 0; i < 100; i++)
				service.submit(() -> monkey2.incrementAndGet()); // m2 here main thread submits new tasks and moves on. so might be imcomplete data
		   IntStream.range(0,100)
		      .parallel()
		      .forEach(s -> monkey1.getAndIncrement());        // m1	here main thread does not move until finishes.
		   if(monkey1.intValue()!=monkey2.intValue())
		   System.out.println(monkey1 + " " + monkey2);
		} finally {
		   service.shutdown();
		}
	}
}
