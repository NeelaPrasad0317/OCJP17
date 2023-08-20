import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		var retriever = new BufferedReader(new InputStreamReader(System.in));
		try(retriever; var husky = System.err) {
		   var fetch = retriever.readLine();
		   System.out.printf("%s fetched in %5.1f seconds",fetch, // v1
		      (System.currentTimeMillis()-start)/1000.0);
		}
		var fetchAgain = retriever.readLine();
		System.out.println(fetchAgain + " fetched again!");
	}
}
