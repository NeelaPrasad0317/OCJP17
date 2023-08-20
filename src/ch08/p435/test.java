package ch08.p435;

import java.util.function.*;
import java.time.*;
import java.util.*;

public class test {

	public static void main(String[] args) {
		Supplier<LocalTime> sup = () -> LocalTime.now();
		Supplier<LocalDate> supDate = LocalDate::now;
		Supplier<List<String>> supList = ArrayList::new;
		System.out.println(sup.get());
		System.out.println(supDate.get());
		System.out.println(supList.get().isEmpty());

		Consumer<String> con = s -> System.out.println(s.toUpperCase());
		Consumer<String> con1 = System.out::println;
		con.accept("ABccc123");
		con1.accept("acs");

		BiConsumer<String, String> bicon = (s1, s2) -> System.out.println(s1.concat(s2));
		bicon.accept("n", "np");

		Map<String, Object> map = new HashMap<String, Object>();
		BiConsumer<String, String> bicon2 = map::put;
//		BiConsumer<String, String> bicon3 = (s, s1) -> map.put(s, s1); // effectively final is only making lambdas get
																		// trouble. but there is no issue for method
																		// references
		bicon2.accept("nnp", "clever");

		map.put("hsbd", "kmslkd");
		System.out.println(map);
		map = null;
	}
}
