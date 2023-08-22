package p422;

import java.util.ArrayList;

//print only hopper annimals in list
public class SearchAndPrint {
	public static void main(String[] args) {
		// list of animals
		var list = new ArrayList<Animal>();
		list.add(new Animal("fish", false, true));
		list.add(new Animal("kangaroo", true, false));
		list.add(new Animal("rabbit", true, false));
		list.add(new Animal("tortoise", false, true));

		// anonymous inner class
		print(list, new CheckTrait() {
			public boolean test(Animal animal) {
				return animal.canHop();
			}
		});

		// lambda evolution
		print(list, (Animal animal) -> {
			return animal.canHop();
		});

		print(list, (animal) -> {
			return animal.canHop();
		});
		
		print(list, animal -> {
			return animal.canHop();
		});
		
		print(list, animal -> animal.canHop());
		
		//method reference
		print(list,Animal::canHop);

	}

	private static void print(ArrayList<Animal> animals, CheckTrait checker) {
		for (Animal a : animals) {
			if (checker.test(a)) {
				System.out.println(a.name());
			}
		}
	}
}
