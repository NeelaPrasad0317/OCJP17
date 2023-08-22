import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Sudoku {
	static int[][] game;

	public static void main(String[] args) {
		game=new int[6][6];
		game[3][3] = 6;
		Object[] obj = game;
//		game[3][3] = "X";
		game[3][3] = 10;
		Object o2=game;
		game=(int[][]) o2;
		
		System.out.println(game);
		System.out.println();
		System.out.println(game[3][3]);
		System.out.println(Arrays.toString(obj));
		System.out.println(Arrays.toString(game));
		
		List<List<Integer>> list=List.of(List.of(1,2,4),List.of(3,4,5));
		System.out.println(list);
		System.out.println();
		System.out.println(List.copyOf(list));
		System.out.println(List.of(list));
		System.out.println(Set.copyOf(list));
		System.out.println(Set.of(list));
		System.out.println(List.of(list.get(0)));
	}
}