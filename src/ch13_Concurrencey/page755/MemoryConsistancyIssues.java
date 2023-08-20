package ch13_Concurrencey.page755;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MemoryConsistancyIssues {

	public static void main(String[] args) {
//		List<Integer> list=List.of(1,2,3,4,5);//java.lang.UnsupportedOperationException
//		List<Integer> list=new ArrayList<Integer>();//java.util.ConcurrentModificationException
		List<Integer> list = new CopyOnWriteArrayList<Integer>();// executes successfully
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		System.out.println(list.hashCode());
		for (Integer i : list) {
			System.out.println(list.remove(i)+"  "+list.hashCode());
		}
		System.out.println(list.hashCode());

	}
}
