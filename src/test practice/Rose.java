import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Locale.Category;

public class Rose {
	public void tendGarden(Path p) throws Exception {
		Files.walk(p, 1).map(q -> {
			try {
				q.toRealPath();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return q;
		}).forEach(q -> {
			System.out.println(q);
			System.out.println(q.getName(1));
		});
	}

	public static void main(String... thorns) throws Exception {
		Locale.setDefault(Locale.US);
		Locale.setDefault(Category.FORMAT, Locale.GERMANY);
		Locale.setDefault(Category.DISPLAY, Locale.UK);
		System.out.print(NumberFormat.getCurrencyInstance().format(6.95));

		int one = Math.round(6.6);
		int two = Math.round(6.6f);
		long three = Math.round(6.6);
		long four = Math.round(6.6f);

		new Rose().tendGarden(Paths.get("././src"));
	}

	void brew() throws Exception {
		final var m = Path.of("coffee");
		Files.walk(m).filter(Files::isDirectory).forEach(p -> this.m1());
	}

	int m1() {
		return 1;
	}
}

interface HasWater {
	public Object isBlue();

	void wet();
}

interface IsSalty {
	static final String color = "clear";

	Number isBlue();

	public void wet();
}

interface IsSea extends HasWater, IsSalty {
	Integer isBlue();
}