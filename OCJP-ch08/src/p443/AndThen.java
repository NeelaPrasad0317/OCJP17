package p443;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class AndThen {

	public static void main(String[] args) {
		Function<Integer, Integer> add=x->x+2;
		Function<Integer, Integer> multiply=x->x*3;
		
		System.out.println(add.andThen(multiply).apply(4));//(4+2)*3
		System.out.println(add.compose(multiply).apply(4));//4+2 compose 4*3 -> take 4 common->2+4*3
//		in andThen: first function applies and later second
//		in compose: reverse of andThen, second function first and first function last
		
		List<Double> of = List.of(1.0,2.2,3.3,4.4);
		
		Object[] array = of.toArray();
		Double[] array2 = of.toArray(new Double[2]);
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
	}
}
