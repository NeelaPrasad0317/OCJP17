import java.util.List;

public class Bounce {
   public static void main(String... legend) {
      List.of(1,2,3,4,5,6).stream()
         .forEach(System.out::print);
      System.out.println();
      List.of(1,2,3,4,5,6).parallelStream()
         .forEachOrdered(System.out::print);
      System.out.println();
      List.of(1,2,3,4,5,6).parallelStream()
      .forEach(System.out::print);
   } }