package ch08.p429;

public class MethodReferences {

	
	
	public static void main(String[] args) {
		LearnToSpeak ls = System.out::println;
		LearnToSpeak ls1=s -> System.out.println(s);

		ls.speak("hi");
		ls1.speak("are");
		
		LearnToSpeak stati=MethodReferences::print;
		stati.speak("say hi");
		
		Intf nonStatic=String::equals;
		System.out.println(nonStatic.run("","a"));
		
		Intf1 nonStatic1=""::concat;
		System.out.println(nonStatic1.run("nnp"));
		
		Intf1 constr=StringBuilder::new;
		System.out.println(constr.run("abc"));
		
		Intf1 intf1=String::isEmpty;
		System.out.println(intf1.run("abc"));
		
		Converter c=Math::round;
		System.out.println(c.convert(23));
	}
	
	static void print(String a) {
		System.out.println(a);
	}
	
	void printNonStatic(String a) {
		System.out.println(a);
	}

}
