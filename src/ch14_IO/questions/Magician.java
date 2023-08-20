package ch14_IO.questions;

import java.io.IOException;
import java.nio.file.*;

public class Magician {
	public String doTrick(Path path) {
		return path.subpath(2, 3)
				.getName(0)
				.toAbsolutePath()
				.toString();
	}

	public static void main(String... cards) throws IOException {
		final Magician m = new Magician();
		System.out.print(m.doTrick(Paths.get("/bag/of/tricks/.././disappear.txt")));
		
		var oldPath = Path.of("/rodent/mouse.txt");
		var newPath = Path.of("/rodent/rat.txt");
		Files.move(oldPath, newPath,
		   StandardCopyOption.REPLACE_EXISTING);
	}
}