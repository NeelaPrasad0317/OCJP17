import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
//		var odds = IntStream.iterate(1, a -> a+2);
		var evens = Stream.iterate(2, a -> a+2);
//		var odds = IntStream.iterate(1, a -> a+2);
		var odds = Stream.iterate(1, a -> a+2);
//		var sum = Stream.concat(odds, evens).limit(3).sum();
		var sum = Stream.concat(odds, evens).limit(3).collect(Collectors.summarizingInt(t->t));
		System.out.println(sum);
		
		var odds1 = IntStream.iterate(1, a -> a+2);
		var evens1 = IntStream.iterate(2, a -> a+2);
		var sum1 = IntStream.concat(odds1, evens1).limit(3).sum();
		System.out.println(sum1);
	}
}
