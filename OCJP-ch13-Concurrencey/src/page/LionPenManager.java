package page;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//class to show cyclic barrier concept
public class LionPenManager {

	private void removeLions() {System.out.println("Removing lions");}
	private void cleanPen (){System.out.println("Cleaning pens");} 
	private void addLoins (){System.out.println("Adding lions");} 
	
	public void doTask(CyclicBarrier c1,CyclicBarrier c2) {
		try {
			Thread.sleep(5000);
			removeLions();
			c2.await();
			Thread.sleep(1000);
			cleanPen();
			c2.await();
			addLoins();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
//		ExecutorService service=Executors.newSingleThreadExecutor();
		ExecutorService service=Executors.newFixedThreadPool(5);
		CyclicBarrier c1=new CyclicBarrier(4);
		CyclicBarrier c2=new CyclicBarrier(3,()->System.out.println("Barrier broken"));
		try {
			LionPenManager manager=new LionPenManager();
			for(int i=0;i<4;i++)
			service.submit(()->manager.doTask(c1,c2));
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			service.shutdown();
		}
	}
}
