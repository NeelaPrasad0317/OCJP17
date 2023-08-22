package page755;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallerStreams {

	public static void main(String[] args) {
		IntStream ints = IntStream.iterate(1, a -> a < 100, (a1) -> ++a1);
//		ints.parallel().skip(5).limit(10).forEach(System.out::println);
//		ints.parallel().skip(5).limit(10).forEachOrdered(System.out::println);
//		ints.parallel().skip(5).limit(10).findFirst().ifPresent(System.out::println);;
//		ints.parallel().unordered().skip(5).limit(10).findFirst().ifPresent(System.out::println);
		
//		List.of(1,2,3,4,5,6).parallelStream().forEach(System.out::println);
//		List.of(1,2,3,4,5,6).parallelStream().unordered().forEach(System.out::println);
//		List.of(1,2,3,4,5,6).stream().unordered().parallel().forEach(System.out::println);
		List.of(1,2,3,4,5,6).stream().parallel().forEach(System.out::println);
		
//		System.out.println(List.of('w','o','l','f').stream().parallel().reduce("", (s, c)->s+c,(s1,s2)->s2+s1));
		System.out.println(List.of('w','o','l','f').stream().parallel().reduce("", (s, c)->c+s,(s1,s2)->s2+s1));
		System.out.println(List.of('w','o','l','f').stream().reduce("", (s, c)->c+s,(s1,s2)->s2));
		
		System.out.println(List.of('w','o','l','f').stream().parallel().collect(ArrayList::new, ArrayList::add, ArrayList::addAll));
		System.out.println(List.of('w','o','l','f').stream().parallel().collect(ConcurrentSkipListSet::new,Set::add,Set::addAll));

		System.out.println(List.of("lions","tigers","bears").parallelStream().collect(Collectors.toConcurrentMap(String::length, k->k, (a,b)->a+","+b)));
		System.out.println(List.of("lions","tigers","bears").parallelStream().collect(Collectors.groupingByConcurrent(String::length)));
	}
}

