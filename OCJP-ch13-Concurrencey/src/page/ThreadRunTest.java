package page;

public class ThreadRunTest {
	public static void main(String[] args) {
		Runnable run1=()->System.out.println("run 1");
		Runnable run2=()->System.out.println("run 2");
		Runnable run3=()->System.out.println("run 3");
		
		new Thread(run1).start();
		new Thread(run2).start();
		new Thread(run3).start();
		new Thread(run1).run();
	}
}
