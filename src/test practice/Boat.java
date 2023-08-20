import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Boat {
	private void waitTillFinished(CyclicBarrier c) {
		try {
			c.await();
			System.out.print("W");
		} catch (Exception e) {
		}
	}

	public void row(ExecutorService s) {
		var cb = new CyclicBarrier(5);
//		IntStream.iterate(1, i -> i + 1).limit(12).forEach(i -> s.submit(() -> waitTillFinished(cb)));//here return value is considered from the () -> waitTillFinished(cb). not from submit()
		IntStream.iterate(1, i -> i + 1).limit(12).forEach(i -> getName());

//		Decompiled code
		//		forEach((i) -> {
//	         this.getName();
//	      });
	}

	public static void main(String[] oars) {
		ExecutorService service = null;
		try {
			service = Executors.newCachedThreadPool();
			new Boat().row(service);
		} finally {
			service.shutdown();
		}
	}
	String getName() {
		return "jdsn";
	}
}