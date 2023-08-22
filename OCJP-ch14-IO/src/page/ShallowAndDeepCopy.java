package page;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class ShallowAndDeepCopy {

	public static void main(String[] args) throws IOException {
		Path src=Path.of("D:\\configs");
//		Path src=Path.of("D:\\configs\\New Text Document.txt");
		Path dest=Path.of("E:/configs");
		
		
//		src=Paths.get("D:\\fenix");
		copy(src,dest);
		dest=Paths.get("E:/","FenixC");
//		deepcopy(src,dest);
				
	}

	private static void deepcopy(Path src, Path dest) {
		try {
			Files.copy(src, dest,StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if(Files.isDirectory(src)) {
			try(Stream<Path> s=Files.list(src)){
				s.forEach(p->{
					deepcopy(p, dest.resolve(p.getFileName()));
				});
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	private static void copy(Path src, Path dest) {
		try {
//			Files.copy(src, dest,StandardCopyOption.REPLACE_EXISTING);
			if(Files.isDirectory(src)){
				try(Stream<Path> s=Files.list(src)){
					s.forEach(p->copy(p, null));
				}
			}else
				Files.copy(src, System.out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
