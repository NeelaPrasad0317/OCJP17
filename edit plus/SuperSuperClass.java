public class SuperSuperClass{
	final String a;
	{		a=null;	}									
									
//	{		a="abc";	}						//variable a might already have been assigned

//	 var x=0;				//var means local variable type inference, it wont work at class level
	 static String s=m3();
	
	static{
		System.out.println(s.length());
	}

	private final static String m3(){
		return "suspersuper";
	}

	public static void main(String... args){
		var s=m3();
		System.out.println("main");
		System.out.println(s.length());
		new SuperSuperClass().m4();
	}

	public final void m4(){
		System.out.println("sdbcjd");
	};
}
