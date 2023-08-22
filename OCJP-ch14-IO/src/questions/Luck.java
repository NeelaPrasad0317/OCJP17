package questions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Luck {
	private AtomicBoolean coin = new AtomicBoolean(false);
	private AtomicInteger in=new AtomicInteger(1);

	void flip() {
		coin.getAndSet(!coin.get());
		in.addAndGet(in.get());
	}

	public static void main(String[] gamble) throws Exception {
		var luck = new Luck();
		ExecutorService s = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++) {
			s.execute(() -> luck.flip());
		}
		s.shutdown();
		Thread.sleep(5000);
		System.out.println(luck.coin.get());
		System.out.println(luck.in.get());
	}
}