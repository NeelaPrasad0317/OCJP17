package ch08.p443;

import java.util.List;
import java.util.function.Predicate;
import java.util.*;

public class LocalVariablesInLambdas {

//	public static void main(String[] args) {
//		
//		
//	}

	/*public static void m1(int a) {
		int b=10;
		
		Predicate<Integer> p=a->{
			int b=10;
			Boolean false1 = Boolean.FALSE;
		};
	}*/

	public void remove(List<Character> chars) {
		char end = 'z';
		char c = 'x';
		Predicate<Character> predicate = c -> {
			char start = 'a';
			return start <= c && c <= end;
		};
		chars = null;
		char start = 'a';
	}

}
