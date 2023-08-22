package PracticeExam1;

class BubbleException extends Exception {
}

abstract class Fish {
	Fish getFish() {
		throw new RuntimeException("fish!");
	}
}

public final class Clownfish extends Fish {
	public final Clownfish getFish() throws BubbleException {
		throw new RuntimeException("clown!");
	}

	public static void main(String[] bubbles) throws Exception {
		final var v = (Fish) new Clownfish();
		Clownfish f = v;
		f.getFish();
		System.out.println("swim!");
	}
}