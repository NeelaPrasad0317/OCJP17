package questions;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Padlock {
	private Lock lock = new ReentrantLock();

	public void lockUp() {
		if (lock.tryLock()) {
			lock.lock();
			System.out.println("Locked!");
			lock.unlock();
		}else {
			lock.unlock();
		}
	}

	public static void main(String... unused) throws Exception {
		var gate = new Padlock();
		for (int i = 0; i < 5; i++) {
			new Thread(() -> gate.lockUp(),"x").start();
			Thread.sleep(1_000);
		}
	}
}