import java.util.function.Predicate;

public class Main{
		public static void main(String[] args) {
			System.out.println(test(i -> i == 2));
//			System.out.println(test(i -> {i == 2;}));
			System.out.println(test((i) -> i == 2));
//			System.out.println(test((int i) -> i == 2);
//			System.out.println(test((int i) -> {return i == 2;}));
			System.out.println(test((Integer i) -> {return i == 2;}));
			System.out.println(test((i) -> {return i == 2;}));
			
			while(true) 
				if(true)
					break;
				else
					break;
			

			var gas = true;
			 do {
			    System.out.println("helium");
			    gas = gas ^ gas;
			    gas = !gas;
			 }while (!gas);
			 
			 Boolean.valueOf("8").booleanValue();
//			  Character.valueOf('x').byteValue();
			  Double.valueOf("9_.3").byteValue();
			  Long.valueOf(88).byteValue();
		}

		private static boolean test(Predicate<Integer> p) {
			return p.test(2);
		 } 
     }