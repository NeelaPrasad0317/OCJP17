public class Main1 {
	public static void main(String[] args) {
		// w w w . jav a 2s .c o m
		int myValue = 0;
		int x = 3;
		while (myValue++ < 3) {
			int y = (1 + 2 * myValue) % 3;
			System.out.println("   myValue:" + myValue);
			System.out.println("   y:" + y);
			switch (y) {
			default:
			case 0:	x -= 1;	break;
			case 1:
				x += 5;
			}
			System.out.println("   x:" + x);
		}
		System.out.println(x);
	}
}