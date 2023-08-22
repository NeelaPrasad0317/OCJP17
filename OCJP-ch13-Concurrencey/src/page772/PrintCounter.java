package page772;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class PrintCounter {
	static int count = 0;

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		var service = Executors.newSingleThreadExecutor();
		try {
			var r = new ArrayList<Future<?>>();
			IntStream.iterate(0, i -> i + 1).limit(5).forEach(i -> {
				r.add(service.submit(() -> {
					count++;
				}));
			}) // n1
			;
			for (Future<?> result : r) {
				System.out.println(result.get() + " "); // n2
			}
		} finally {
			service.shutdown();
		}

		var data = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6));
		data.stream() // p1
				.flatMap(s -> s.stream()).findFirst()// p2
				.ifPresent(System.out::println);
		
		data = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6));
		data.parallelStream() // p1
				.flatMap(s -> s.stream()).findFirst()// p2
				.ifPresent(System.out::println);
		
		data = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6));
		data.stream() // p1
		.flatMap(s -> s.stream()).findAny()// p2
		.ifPresent(System.out::println);
		
		data = List.of(List.of(1, 2), List.of(3, 4), List.of(5, 6));
		data.parallelStream() // p1
		.flatMap(s -> s.stream()).findAny()// p2
		.ifPresent(System.out::println);
		
		
		var c=System.getProperties();
		System.out.println(c);
	}
}