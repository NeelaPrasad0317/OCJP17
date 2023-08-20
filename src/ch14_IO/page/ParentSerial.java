package ch14_IO.page;

import java.io.Serializable;

public class ParentSerial implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int a;
	
	public ParentSerial(int a) {
		this.a=a;
		System.out.println("parent 1-arg const");
	}
	
	 ParentSerial() {
		System.out.println("parent 0-arg const");
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	

}
