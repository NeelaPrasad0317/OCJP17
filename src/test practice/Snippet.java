

public class Snippet {
	public static void main(String[] args) {
		 String s1 = """
                 a \
                 b \t
                 c \s
                 """;
     System.out.println(s1.length()+" "+s1.split("\\n").length);
	}
}