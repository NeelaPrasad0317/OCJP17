package ch09.p507;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GenericMethodOverloading<U,S> extends Intf<U> {
//	Object a=new S();
	
	static S s=null;
	
	public static void main(String[] args) {}

//	void chew(List<Double> d) {	}
	// Name clash: The method chew(List<Double>) of type GenericMethodOverrinding
	// has the same erasure as chew(List) of type Intf but does not override it

	@Override
	void chew(List<U> d) {}
	
	 void chew(ArrayList<Double> input) {}
	<K> void chew(Set<K> input) {}

	@Override
	void test(double d) {}
}

class Intf<T>{
	void chew(List<T> input) {	}
//	void chew(List<Integer> input) {}

	
	void test(Double t) {}
	void test(double d) {}// it considered as overloaded method
//	void test(Object t) {}
/*	void test(T t) {
		if(t instanceof List<Integer>)
		((List<Integer>)t).add(1);
	}*/
	
	@SuppressWarnings("hiding")
	<T extends CharSequence> void  ac(T s) {}
	
	<T extends Number> void a(List<T> list) {}
	
//	<T extends List<? extends Number>> void print(T list) {
//	<T extends List<? extends Integer>> void print(T list) {
	<K,T extends List<? extends K>> void print(T list) {
//		list.add(Integer.valueOf(1));
//		list.forEach(x->System.out.println(x.floatValue()));
		
		new ArrayList<>(list);
	}
}