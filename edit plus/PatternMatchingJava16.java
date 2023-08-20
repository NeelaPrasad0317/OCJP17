import java.util.*;
public class PatternMatchingJava16
{
	public static void main(String[] args) 
	{
		compareIntegers(9,10);
		instanceOf(new PatternMatchingJava16.A());
	}


	static void compareIntegers(Number number,Number number2){
//		if(number instanceof Integer){
//			Integer data=(Integer)number;
//		if(number instanceof Integer data && data.compareTo(5)>0 && number2 instanceof Integer data2){
//	if(true){
		if(!(number instanceof Integer data)){
			System.out.println("if");
			return; //return stmt is must to make pattern variable visible out side of if block
		}{
			System.out.println(data);			
		}
		System.out.println(0);
		System.out.println(data+1);
//	}else{
//		System.out.println(data+2);  //error coz, out of scope. block ended 
//	}
	}

	static void instanceOf(Object a){
//	static void instanceOf(A a){
		if(a instanceof A a1){
//		if(a instanceof B a1){  //right variable must be subtype of left variable
//		if(a instanceof List){  //exceptional case
//		if(a instanceof String){ //error
			System.out.println("success");
		}else{
			System.out.println("fail");
		}
	}

	static class A{
	}
	static class B extends A{
	}
}