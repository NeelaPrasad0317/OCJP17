public class Football {
	public static void main(String officials[]) {
		try {
			System.out.print('W');
			try {
				throw new ArrayIndexOutOfBoundsException();
			}catch (NullPointerException e) {
			}
		} catch (RuntimeException r) {
			System.out.print('X');
			try {
				throw r;
			}catch (NullPointerException e) {
			}
		} catch (Exception e) {
			System.out.print('Y');
		} finally {
			System.out.print('Z');
		}
	}
}
