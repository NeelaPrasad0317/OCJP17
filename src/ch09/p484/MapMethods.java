package ch09.p484;

import java.util.*;
import java.util.function.*;

public class MapMethods {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();

		map.put("a", "a");
		map.putIfAbsent("b", null);
		System.out.println(map);
		map.putIfAbsent("b", "b");
		System.out.println(map);

		System.out.println(map.getOrDefault("b", "B"));
		System.out.println(map.getOrDefault("B", "B"));
		System.out.println();

		BiFunction<String, String, String> mapper = (v1, v2) -> {
			System.out.println(v1);
			System.out.println(v2);
			System.out.println(v1.compareTo(v2));
			return v1.compareTo(v2) > 0 ? v1 : v2;
		};

		System.out.println(map.merge("a", "AA", mapper));
		System.out.println(map.merge("c", "CC", mapper));
		System.out.println(map.merge("d", "D", mapper));
//		System.out.println(map.merge("d", null, mapper));//NPE
		System.out.println(map);
		
		BiFunction<String, String, String> mapper1 = (v1, v2) -> null;
		
		System.out.println(map.merge("d","DD",mapper1));
	}
}
