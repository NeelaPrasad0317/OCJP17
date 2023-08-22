package PracticeExam2;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public record Goat(String food) {
		public static void main(String[] args) {
      var goats = List.of(
         new Goat("can"), 
         new Goat("hay"), 
         new Goat("shorts"), 
         new Goat("hay"));

     Map<String, List<Goat>> collect2 =
    		 goats.stream()
    		 .collect(groupingBy(Goat::food));
     
     System.out.println(collect2);
     
     Map<Boolean, List<String>> collect = 
    		 collect2 .entrySet()
	         .stream()
	         .filter(e -> e.getValue().size() == 2)
	         .map(e -> e.getKey())
	         .collect(partitioningBy(e -> e.isEmpty()));
      
      System.out.println(collect.toString());
         collect.get(false)
         .stream()
         .sorted()
         .forEach(System.out::print);
   } }