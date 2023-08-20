package ch07.beyondclasses.p385;

public class InnerClasses {
	int x = 0;

	private class Class1 {
		int x = 10;

		private class Class2 {
			int x = 20;

			private class Class3 {
				int x = 30;

				public void print3() {
					System.out.println(x);
					System.out.println(this.x);
					System.out.println(Class3.this.x);
					System.out.println(Class2.this.x);
					System.out.println(Class1.this.x);
					System.out.println(InnerClasses.this.x);
				}
			}
		}
	}

	public static void main(String[] args) {
		new InnerClasses().print();
	}

	public void print() {
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(new Class1().x);
		System.out.println(new Class1().new Class2().x);
		System.out.println(new Class1().new Class2().new Class3().x);
		System.out.println();

		// for ref type use class name & for object use object
		InnerClasses.Class1.Class2.Class3 c3 = new Class1().new Class2().new Class3();
		System.out.println(c3.x);
//		System.out.println(Class1.Class2.c3.x);//here member fields are not visible to the outer class, but cover class fields visible to inner class
		c3.print3();
	}
}
