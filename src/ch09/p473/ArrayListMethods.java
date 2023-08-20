package ch09.p473;
import java.util.*;
public class ArrayListMethods {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>(10);
		
		list.add(10);
		list.add(12);
		list.set(1, 20);
//		list.add(4,40);//IOBException
		list.add(2,30);
		
		System.out.println(list.get(1));
		System.out.println(list.remove(0));
		System.out.println(list.remove(Integer.valueOf(29)));
		list.replaceAll(a->a*a);	
		
		System.out.println(list);
	}
}
