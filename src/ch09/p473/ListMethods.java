package ch09.p473;

import java.util.*;

public class ListMethods {

	public static void main(String[] args) {

		String[] array = new String[] { "a", "b", "c" };

		//lists with factory methods
		List<String> asList = Arrays.asList(array);// no adding/removing allowed. only editing elements allowed && list
													// and array are interlinked here
		List<String> of = List.of(array);// immutable lists. no adding removing, editing allowed
		List<String> copy = List.copyOf(of);// immutable lists. no adding removing, editing allowed

		array[1] = "z";
//		asList.add("ads");//UnsupportedOperationException
		asList.set(0, null);

		System.out.println(Arrays.toString(array));
		System.out.println(asList);
		System.out.println(of);
		System.out.println(copy);

//		String[] newArray=asList.toArray(new String[5]);
		String[] newArray = asList.toArray(new String[0]);
		asList.set(2, "nnp");
		System.out.println(Arrays.toString(newArray));// when converting list to array, then there is no linkage b/w
														// array and list
		
		//creating lists with constructors
		var linked=new LinkedList<String>();
		var linked2=new LinkedList<>(asList);
//		var linked3=new LinkedList<String>(10);//arrayList have this initial capacity constructor
		
//		linked2.add(new Object());
		
		
	}
}
