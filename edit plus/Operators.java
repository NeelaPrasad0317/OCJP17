public class Operators
{
	public static void main(String[] args) 
	{
		float d1=12345678911L;
		float d2=d1+d1;
		byte b1=1;
//		short s1=b1+(byte)1;
//		System.out.println(s1);
		System.out.println(d2);

		char c1='a';
		byte b2=(byte)c1;
		int i1=c1;

		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

		/**
		* & and | calculates both oparands
		* && and || calculates both oparands only if first oparand is not sufficiant to decide
		*/

		byte a=(byte) (-129);
		byte b=(byte) 128;
		System.out.println(a);
		System.out.println(b);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
	}
}
