package PracticeExam1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IOTest {
	public static void main(String[] args) throws IOException {
		Files.createDirectories(Path.of("D:/garden.txt"));
		Files.createDirectory(Path.of("D:/nursery.txt"));

		Files.move(Path.of("D:/flower/rose.txt"),
		   Paths.get("D:/garden"), StandardCopyOption.REPLACE_EXISTING);
		Files.move(new File("D:/flower/rose2.txt").toPath(),
		   Paths.get("D:/nursery"), StandardCopyOption.ATOMIC_MOVE);
	}
}
