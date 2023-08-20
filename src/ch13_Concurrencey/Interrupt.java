package ch13_Concurrencey;


public class Interrupt {
	public static int counter = 0;

	public static void main(String[] args) {
		System.out.println("main start");
		Thread main = Thread.currentThread();
		new Thread(() -> {
			for (int i = 0; i < 1_000_000; i++) {
				counter++;
			}
			main.interrupt();
		}).start();;
		while (counter < 1_000_000) {
			System.out.println("not reached yet");
			try {
				Thread.sleep(1_000);
			} catch (InterruptedException e) {
				System.out.println("interupted");
			}
		}
		System.out.println("main end");
	}
}
