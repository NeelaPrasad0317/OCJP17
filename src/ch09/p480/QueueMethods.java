package ch09.p480;

import java.util.*;

public class QueueMethods {

	public static void main(String[] args) {

		Queue<Integer> a = new LinkedList<>();

		//adding return boolean
		a.add(10);
		a.offer(20);
		
		a.forEach(System.out::println);
		System.out.println(a);
		
		//checking value, returns first element is no exception
		System.out.println(a.element());
		System.out.println(a.peek());
		System.out.println(a);
		
		//removes first element if no exception
		System.out.println(a.poll());
		System.out.println(a.remove());
		System.out.println(a.add(50));
		System.out.println(a.remove());
		System.out.println(a.poll());
//		System.out.println(a.remove());//NoSuchElementException
		System.out.println(a);
		
	}
}
