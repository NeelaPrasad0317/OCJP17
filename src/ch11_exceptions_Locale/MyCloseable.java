package ch11_exceptions_Locale;

public class MyCloseable implements AutoCloseable{

	private final int num;
	
	public MyCloseable(int num) {
		this.num = num;
	}
	
	@Override
	public void close() throws IllegalArgumentException {
		System.out.println("close:"+num);
		throw new IllegalArgumentException("from close"+num);
	}
	
	public void sayHi() {
		System.out.println("Hi from:"+num);
	}

}
