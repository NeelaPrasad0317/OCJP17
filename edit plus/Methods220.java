import static java.util.Arrays.*;


public class Methods220{

	public static void main(String[] args) 
	{
		System.out.println(asList(1,2,3));


		//limits of Autoboxing and numeric promotions
		Integer I=1;
		long l=I;				//java allows unboxing and casting in same line
		System.out.println(l);

		//java dont allow autoboxing and casting at a time
//		Long L=8;
//		Long L=I;		//casting issue 
		Long L=l;		//here autoboxing
		System.out.println(L);
	
		double d=Integer.valueOf(3);	//conl: assiging to primitive variables is possible. to Ref vars not possible
		System.out.println(d);
		System.out.println();
		
//		fly(1);		//Ambiguous
//		fly(1,2); //no CE
//		fly(1,2,3);
//		fly(1,2,3,4);
		
		glide(1,2);
	}

//	private static void glide(int i,int j){
//		System.out.println("int");
//	}

//	private static void glide(long i,long j){
//		System.out.println("long");
//	}

//	private static void glide(double i,double j){
//		System.out.println("double");
//	}
//	private static void glide(int i,double j){
//		System.out.println("double");
//	}
	private static void glide(double i,int j){
		System.out.println("double");				//wrappers and var args came recently.for supporting backward comatibility, first primitive then wrapper, then var arg
	}												//

	private static void glide(Integer i,Integer j){
		System.out.println("Integer");
	}

	private static void glide(int... i){
		System.out.println("var arg");
	}

	private static void fly(int i1,int i2){
		System.out.println("fly1");
	}

//	private static void fly(int i1,int[] i2){
//		System.out.println("fly2");
//	}

	private static void fly(int i1,int... i2){
		System.out.println("fly3");
	}

	private static void fly(int... i2){
		System.out.println("fly4");
	}
}
