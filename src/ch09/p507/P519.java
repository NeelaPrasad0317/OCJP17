package ch09.p507;

import java.util.ArrayList;
import java.util.List;

public class P519 {

	public static void main(String[] args) {
		// passing genieric arguments
		List<?> list=new ArrayList<Integer>();
		list.add(Integer.valueOf(0));
		list.add(null);
		list=new ArrayList<String>();
	}

//	<B extends A> B third(List<B> list) {
//	<T extends A> B third(List<T> list) {
	<T implements Runnable> B third(List<T> list) {
//		return (B) list.get(0);
		return new B();
//		return (B) new T();
	}
}
