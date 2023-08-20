package ch13_Concurrencey.page755;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class as {
	public static void main(String[] args) {
//		List<Integer> list=new ArrayList<Integer>();
//		ConcurrentSkipListSet<Integer> list=new ConcurrentSkipListSet<Integer>();
//		CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<Integer>();
//		list.add(1);
//		list.add(2);
//		for(Integer i:list) {
////			list. add(++i);
//			System.out.println(list);
//			list.remove(i);
//		}
		
		List<Integer> lions = new ArrayList<>(List.of(1,2,3));
		List<Integer> tigers = new CopyOnWriteArrayList<>(lions);
		Set<Integer> bears = new ConcurrentSkipListSet<>();
		bears.addAll(lions);
		for(Integer item: tigers) tigers.add(4); // x1
		for(Integer item: bears) 
			bears.add(5);   // x2
		System.out.println(lions.size() + " " + tigers.size()
		   + " " + bears.size());
		
		int ticketsTaken = 1;
		int ticketsSold = 3;
		ticketsSold += 1 + ticketsTaken++;
		ticketsTaken *= 2;
		ticketsSold += (long)1;
	}
}

