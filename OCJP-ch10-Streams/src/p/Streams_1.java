package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_1 {

	public static void main(String[] args) {
		var cats=new ArrayList<String>();
		cats.add("annie");
		cats.add("Ripley");
		var scats=cats.stream();
		cats.add("KC");
		System.out.println(scats.count());
		scats=cats.stream();
		cats=null;
		System.out.println(scats.count());
		
		
		// optional chaining
		Optional<Integer> op = Optional.of(123);
//		Optional<Integer> op = Optional.empty();

		op.map(n -> "" + n).filter(x -> x.length() == 3).ifPresent(System.out::println);

		var length = op.map(x -> Streams_1.getLength(x));
		System.out.println(length);

		var length1 = op.flatMap(x -> Streams_1.getLength(x));
		System.out.println(length1);

		// grouping
		var ohmy = List.of("goats", "loins", "tigers", "bears", "hadjakdnlnad");
		Map<Integer, List<String>> map = ohmy.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map);

		System.out.println(
				ohmy.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet())));
		System.out.println(ohmy.stream()
				.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toCollection(TreeSet::new))));
		System.out.println(ohmy.stream()
				.collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.joining(",", "{", "}"))));
		// map key //map type //value type

		System.out.println();
//		System.out.println(ohmy.stream().collect(Collectors.toMap(String::length, k->k)));	//duplicate key	
		System.out.println(ohmy.stream().collect(Collectors.toMap(k -> k, String::length)));
		System.out.println(ohmy.stream().collect(Collectors.toMap(String::length, k -> "{" + k + "}",
				(t, u) -> "{" + t + "},{" + u + "}", TreeMap::new)));

		// partitioning
		System.out.println(ohmy.stream().collect(Collectors.partitioningBy(k -> k.length() > 10)));
		System.out.println(ohmy.stream().collect(Collectors.partitioningBy(k -> k.length() > 100)));
		System.out.println(ohmy.stream().collect(Collectors.groupingBy(k -> k.length() > 100)));
		System.out.println(ohmy.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())));

		System.out.println();
		System.out.println(ohmy.stream()
				.collect(Collectors.mapping(s -> s.substring(0), Collectors.minBy((x1, x2) -> -x1.compareTo(x2)))));
		System.out.println(ohmy.stream().collect(Collectors.groupingBy(String::length,
				Collectors.mapping(s -> s.substring(1, 4), Collectors.minBy((x1, x2) -> x1.compareTo(x2))))));
		System.out.println(ohmy.stream().collect(
				Collectors.teeing(Collectors.toCollection(TreeSet::new), Collectors.joining(","), Seperations::new)));


		System.out.println();
		System.out.println(Stream.of(1,3,2).min((s1,s2)->s2-s1));
		System.out.println(Stream.of(1,3,2).max((s1,s2)->s2-s1));
	}

	public record Seperations1(Integer s, String s1) {
	}

	public record Seperations(TreeSet s, String s1) {
	}

	static Optional<Integer> getLength(Integer x) {
		return Optional.of(x + "".length());
	}
}
