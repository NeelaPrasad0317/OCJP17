public class Lion {
	public static void main(String[] args) {
		for (var i = 0; i < 3; i++) {
			class Cub {
				public static void print() {
					System.out.print("Roar!");
				}
			}
			new Cub().print();
		}
	}
}