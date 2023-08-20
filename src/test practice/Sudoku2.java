import java.util.Arrays;

public class Sudoku2 {
	static int[][] game;

	public static void main(String[] args) {
		game = new int[6][6];
		game[3][3] = 6;
		game[3][3] = 10;
		Object o2 = game;
		game = (int[][]) o2;
		game[1][1] = 1;
		System.out.println(Arrays.deepToString(game));
	}
}