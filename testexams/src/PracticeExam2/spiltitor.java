package PracticeExam2;

import java.util.Set;
import java.util.stream.Stream;

public class spiltitor {
	void play() {
		record Toy(String name) {
		}

		var toys = Stream.of(new Toy("Jack in the Box"), new Toy("Slinky"), new Toy("Yo-Yo"), new Toy("Rubik's Cube"));

		var spliterator = toys.spliterator();// 4
		var batch1 = spliterator.trySplit();// 2
		var batch2 = spliterator.trySplit();// 1
		var batch3 = spliterator.trySplit();// 0//batch3 dont get any elements here

		batch1.forEachRemaining(System.out::print);
		System.out.println();
		batch2.forEachRemaining(System.out::print);
		System.out.println();
		spliterator.forEachRemaining(System.out::print);
		batch3.forEachRemaining(System.out::print);
	}

	public static void main(String[] args) {
		var split = Stream.iterate(1, n -> n + 1).spliterator();

		var batch1=split.trySplit();
		var batch2=split.trySplit();
		var batch3=batch1.trySplit();
		batch1.tryAdvance(System.out::print);
		System.out.println();
		batch3.tryAdvance(System.out::print);
		System.out.println();
		batch2.tryAdvance(System.out::print);
		System.out.println();
		split.tryAdvance(System.out::print);
		System.out.println();
		
		/*ArrayList <? extends Number> list =new ArrayList <Double>();
		list.add(1);
		
		*/
		Set<String> birds = Set.of("oriole", "flamingo");
		Stream.concat(birds.stream(), birds.stream())
		   .sorted()       // line X
		   .distinct()
		   .findAny()
		   .ifPresent(System.out::println);
		   
		new spiltitor().play();
	}
}