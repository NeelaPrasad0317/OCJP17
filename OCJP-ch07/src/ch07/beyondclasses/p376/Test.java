package ch07.beyondclasses.p376;

import java.time.ZonedDateTime;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		Records r=new Records(0, null);
		
		System.out.println(r.eggs());
		System.out.println(r.name());
		System.out.println(r.hashCode());
		System.out.println(r.toString());
		System.out.println(r.equals(new Records(0,null)));//tostring compares all values
		System.out.println(new Records(0,"nnp").toString());
		System.out.println(new Records("nnp").toString());
		
		enum E{
			A,B,C;
		}
		E e=E.A; 
		System.out.println(switch(e) {
		case A->1;
		default->{
			yield 2;
		}
		});
		
		Number num=1;
		if(!(num instanceof Integer i1)) {
			System.out.println(num);
		}else if(!(num instanceof Integer i2)) {
			System.out.println(1+2);
		}else {
			System.out.println(i1+i2);
		}
		System.out.println("animals".length());
		
		int[] a1= {1,2,3};
		int[] a2= {2,3,1};
		System.out.println(a1.equals(a2));
		System.out.println(Arrays.toString(args));
		System.out.println(ZonedDateTime.now());
	}
	
	private record Records1(String a) {
		private Records1{
			
		}
	}
}
