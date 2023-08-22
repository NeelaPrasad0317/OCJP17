public class Dragon {
	boolean scaly;
	static final int gold;

	Dragon protectTreasure(int value, boolean scaly) {
		scaly = true;
		return this;
	}

	static void fly(boolean scaly) {
		scaly = true;
	}

	int saveTheTreasure(boolean scaly) {
		return this.gold;
	}

	static void saveTheDay(boolean scaly) {
//		this.gold = 0;
	}

    static { gold = 100; } }