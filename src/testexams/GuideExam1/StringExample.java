package GuideExam1;

public class StringExample {

	public static void main(String[] args) {
		String numbers = "2468";
		numbers = numbers.indent(2);
		numbers+="00";
		numbers.replace("8", "9");
		int total = 0;
		total += numbers.indexOf("6");
		total += numbers.indexOf("9");
		char ch = numbers.charAt(3);
		int length = numbers.length();
		System.out.println(total);
		System.out.println(ch);
		System.out.println(length);
	}
}
