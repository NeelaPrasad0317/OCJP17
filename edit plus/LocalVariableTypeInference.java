public class LocalVariableTypeInference
{
	public static void main(String[] args) 
	{
		boolean check=false;
		doesThisCompile(check);
	}

	public static void doesThisCompile(boolean check){
//		var a=1,b=2;
//		var question;
		var question=0;
		question=1;
//		var answer;
		var answer=10;
		if(check){
			answer=2;
		}else{
			answer=3;
		}
		System.out.println(answer);
		var i=m1();
		System.out.println(i);
	}

	static int m1(){
		return 10;

	}
}
