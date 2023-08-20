package ch09.p478;

import java.util.*;

public class SetMethods {

	public static void main(String[] args) {
		
//		Set<Character> letters=Set.of('a','z','t','t'); //in declaration it self not taking duplicates
		String t="t";
//		Set<Character> letters=Set.of(t.charAt(0),'a','z','t');
		Set<Character> letters=Set.of('a','z','t','s','d','A');
		Set<Character> copy=Set.copyOf(letters);
		
		System.out.println(letters);
		System.out.println(copy);
		letters.forEach(ch->System.out.println(ch+" "+ch.hashCode()));
		
		Set<Object> set=new HashSet<>();
		System.out.println(set.add("nnp"));
		System.out.println(set.add("a"));
		System.out.println(	set.add(new String("nnp")));
		
		System.out.println(set);
		
		System.out.println("afxgc".hashCode());
		System.out.println("afxgc".hashCode());
		System.out.println(new String("afxgc").hashCode());
		
		System.out.println(new test(1, 0).hashCode());
		System.out.println(new test(1, 0).hashCode());
		System.out.println(new test(1, 0).equals(new test(1, 0)));
		
		
		set.add(new test(1, 0));
		set.add(new test(1, 1));
		System.out.println(set);
		
		var set1=new HashSet<>();
	}
}
