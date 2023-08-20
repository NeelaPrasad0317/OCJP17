
package PracticeExam1;
interface Plant {
   default String grow() { return "Grow!"; }
}
interface Living {
   public default String grow() { return "Super Growing!"; }
}
public class Tree implements Plant, Living {  // m1
   public String grow() { return Plant.super.grow(); }
   public static void main(String[] leaves) {
      Plant p = new Tree();                   // m2
      System.out.print(((Living)p).grow());   // m3
      
      int i;
      System.out.println(i);
   } }
