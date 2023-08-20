package ch09.p466;

import java.util.*;
public class CollectionMethods {

	public static void main(String[] args) {
		
		Collection<String> list=new ArrayList<>();
		
		System.out.println(list.add("sdac"));
		System.out.println(list.add("nnp"));
		System.out.println(list.add("sdac"));
		System.out.println(list.add("saf"));
		
		list.forEach(System.out::print);
		
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list.remove(""));
		System.out.println(list.contains("nnp"));
		System.out.println(list.removeIf(s->s.startsWith("s")));
		System.out.println();
		System.out.println(list.equals(Arrays.asList("nnp","n")));
		list.clear();		
		
		System.out.println(list);
	}
}
