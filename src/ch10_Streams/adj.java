package ch10_Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class adj {

	public static void main(String[] args) {
//		System.out.println(Stream.iterate(1, x -> x++) //1 //1++ >> 1  //1++ >> 1
		System.out.println(Stream.iterate(1, x -> ++x)
		 .limit(5).map(x -> x+"")
		 .collect(Collectors.joining()));
		
		
		//nonMatch(predicate)----if predicate is true then res is false
								
		var s = Stream.generate(() -> "meow");
//		var s = Stream.of("we","meow");
//		var match = s. noneMatch(String::isEmpty);
		var match = s. allMatch(String::isEmpty);
		System.out.println(match);
	}
}
