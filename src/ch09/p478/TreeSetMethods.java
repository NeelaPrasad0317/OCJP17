package ch09.p478;

import java.util.*;

public class TreeSetMethods {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();

		set.add("sls");
//		set.add(null);  //null is not allowed in sorted collections. coz, NPE rises when sorting the collection
		set.add("asjhbj");
		set.add("sudfb");
		
		set.forEach(System.out::println);
		
		System.out.println(set);
		
	}
}
