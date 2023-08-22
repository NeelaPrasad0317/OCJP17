package p;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Streams {
static	int sum=0;
	public static void main(String[] args) {
		Stream<String> wolf = Stream.of("w", "o", "l", "f");

//		System.out.println(wolf.reduce(0, (sum, s2) -> sum + s2.length(), (a, b) -> a + b));

		StringBuilder w = wolf.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
		System.out.println(w);

		Stream<Integer> s = Stream.of(1, 2, 3);
//		System.out.println(s.mapToInt(a -> a).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append));
//		System.out.println(s.mapToInt(a -> a).collect(()->new StringBuilder("abc"), StringBuilder::append, StringBuilder::append));
		System.out.println();
		var a=new ArrayList<Integer>();
		s.collect(()->a, List::add,List::addAll).sort(Comparator.reverseOrder());
		System.out.println(a);
//		System.out.println(s.mapToInt(a -> a).collect(()->new StringBuilder("abc"), StringBuilder::append, StringBuilder::append));
//		System.out.println(s.mapToInt(a->a).sum());
//		System.out.println(s.collect(Collectors.reducing((a,b)->a+b)).orElseGet(()->0));
		
		
		System.out.println(Stream.empty().min((s1,s2)->0).orElse(99999));
		System.out.println(Stream.of(1,1).min((s1,s2)->0).orElse(99999));
		System.out.println(Stream.of(1,2,3).max((s1,s2)->1).orElse(99999));
		System.out.println(Stream.of(1,2,3).min((s1,s2)->1).orElse(99999));
		
		System.out.println(Stream.of("w","o","l","f").reduce(100, (b1,b)->b1+b.length(), (c,d)->c+d));
		
		System.out.println("=================");
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(3);list.add(4);
		IntStream ints=list.stream().flatMapToInt(x->IntStream.of(x));
		ints.forEach(System.out::print);
		Stream<String> flatMap = list.stream().flatMap(x->Stream.of(x+""));
		flatMap.forEach(System.out::print);
		
		System.out.println();
		System.out.println(IntStream.empty().summaryStatistics());
		System.out.println(LongStream.empty().summaryStatistics());
		System.out.println(DoubleStream.empty().summaryStatistics());
		
		var stream=list.stream();
		list.add(5);
		System.out.println(stream.mapToInt(x->x*x).peek(System.out::println).sum());
		list.add(6);
		System.out.println(list);
	}
	
	static void sum(Integer a,Integer b) {
		System.out.println(a+ " "+b);
		sum=a+b;
		System.out.println(sum);
	}
}
