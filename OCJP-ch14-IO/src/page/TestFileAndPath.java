package page;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;

public class TestFileAndPath {

	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("file.separator"));
		System.out.println(System.getProperty("line.separator"));
		System.lineSeparator();
		
		System.out.println();
		FileSystems.getDefault().getRootDirectories().forEach(System.out::print);
		
		System.out.println();
		File parent=new File("D:/abc/");
		File f1=new File(parent,"test.txt");
		System.out.println(parent.exists());
		System.out.println(f1.exists());
		
		Path p1=Path.of("D:/abc/");
		
		Path p2=Paths.get("D:/abc/");
		
//		f1=p2.toFile();
//		p2=f1.toPath();
		
		Path p3=FileSystems.getDefault().getPath("D:/abc/","test","cds");
		System.out.println(p3+" "+f1);
		
		System.out.println(p3.isAbsolute());
		System.out.println(Files.exists(p3));
		System.out.println();
		
		System.out.println(f1.getName());
		System.out.println(p1.getFileName());
		
		System.out.println(f1.getParent());
		System.out.println(p1.getParent());
		
		System.out.println(f1.isAbsolute());
		System.out.println(p1.isAbsolute());
		
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.delete());
		
		Path text=Path.of("d:/abc/text.txt");
//		System.out.println(Files.getLastModifiedTime(text));
//		System.out.println(Locale.getDefault());
//		System.out.println(Files.size(Paths.get(text.getParent().toString(),"Backup.postman_dump.json")));
	}
}
