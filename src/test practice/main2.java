import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class main2 {

	/*public void meow(Collection˂String˃ kitties) {
		   if (kitties instanceof List c) {
		      System.out.println("L " + c.size());
		   } else if (kitties instanceof Map c) {
		      c = new TreeMap˂˃();                  // x1
		      System.out.println("M " + c.size());
		   } else {
		      System.out.println("E " + c.size());
		   }
		}*/
	
	public void meow(Collection<String> kittens) {
		if(kittens instanceof List c) {
			System.out.println(c.size());
		}else if(kittens instanceof Map c) {
		 	c = new TreeMap<>(); 
			System.out.println(c.size());
		}else {
//			System.out.println(c.size());
		}
		
		do {} while (false);
		while(true) {}
		

	}
	
	public static void main(String[] args) {
//		var math = new Math();
		var sum = 0;
		sum += Math.min(3, 5);
		sum += Math.floor(1.8);
		sum += Math.round(5.6);

		System.out.println("sum"+sum);
		int z=sum;
		System.out.println(z);
		
		String s="12345";
		System.out.println(s.substring(3));
		
		List<Integer> list=List.of(1,2,3,4,5);
		System.out.println(list.subList(1, 10));
		do
			System.out.println("hi");
		while(false);
	}
	
	public static <T> List<?> asList2(T... elements) {
	      ArrayList<?> temp = new ArrayList<>();
	      for (T element : elements) {
//	         temp.add(n);
	    	 temp=new ArrayList<String>();
	    	 temp=new ArrayList<Integer>();
	      }
	      return temp;
	   }
	
}
