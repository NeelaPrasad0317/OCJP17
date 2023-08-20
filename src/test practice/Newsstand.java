import java.util.TreeSet;

record Magazine(String name) implements Comparable<Magazine> {
	public int compareTo(Magazine m) {
		return name.compareTo(m.name);
	}
}

public class Newsstand {
	public static void main(String[] args) {
      var set = new TreeSet<Magazine>();
      set.add(new Magazine("highlights"));
      set.add(new Magazine("Newsweek"));
      set.add(new Magazine("highlights"));
      System.out.println(set);
   }
}