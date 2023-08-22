import java.util.List;
import java.util.function.UnaryOperator;

public class Doll {
	private int layer;

	public Doll(int layer) {
		super();
		this.layer = layer;
	}

	public static void open(UnaryOperator<Doll> task, Doll doll) {

		while ((doll = task.apply(doll)) != null)
			System.out.print("X");
	}

	public static void main(String[] wood) {
//		open(a -> {
//			if (a.layer <= 0)
//				return null;
//			else
//				return new Doll(a.layer--);
//		}, new Doll(5));
		
//		List.of(1,3,5).parallelStr
//		(0F,(w,x)-˃w.floatValue()+x.floatValue(),(y,z)-˃y.floatValue() + z.floatValue());
		
		System.out.println(List.of(1,3,5).parallelStream().reduce(0f, (w,x)->w.floatValue()+x.floatValue(),(y,z)->y.floatValue()+z.floatValue()));
//		System.out.println(q);
	}

}