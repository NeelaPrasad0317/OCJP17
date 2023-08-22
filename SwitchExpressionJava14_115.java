public class SwitchExpressionJava14_115
{
	public static void main(String[] args) 
	{
		m1();
		m2();
		m3();
		m4();
	}

	static void m1(){
		int value=3;
		switch(value){
			case 1->System.out.println(1);
			case 2,3->System.out.println(2);
		}
		System.out.println("m1 end=========================");
	}

	static void m2(){			//switch expressions must end with semicolon
		int value=2;			
		int result=switch(value){
			case 1->{yield 1;}		// yield is only allowed inside block
			case 2,3->{
				if(true) yield 2;
				else yield 3;
			}
			case 4,5->{
				System.out.println(4);
				yield 5;
			}
			default->value;
		};
		System.out.println(result);
		System.out.println("m2 end=======================");
	}

	static void m3(){
		int value=21;
		System.out.println(switch(value){
			case 1->"hi";
			default-> 3;
			case 2->{
				System.out.println("hello");
				yield 2;
			}		
		});
		System.out.println("m3 end=======================");
//		switch(value){
//			case 1->1;
//			default-> 3;
//			case 2->{
//				System.out.println("hello");
//				yield 2;
//			}			
//		}
//		System.out.println("m3 end=======================");
	}

	static void m4(){
		int value=21;
		switch(value){	//this is not working : mixing void and return statements in cases
//			case 1->10;
			case 2->System.out.println("namastay");
//			default->"string";
		}
		System.out.println("m4 end=======================");
	}
}
