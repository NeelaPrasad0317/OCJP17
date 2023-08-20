package ch07.beyondclasses.p376;

record Records(int eggs, String name) {
	// here constructor is a canonical constructor, which must provide at least as
	// much access as the record class and whose descriptor is the same as the
	// record descriptor

	// 'long constructor
	Records(int eggs, String name) {// once constructor is initialized, then fields initialization is mandatory,
									// if there is 20 fields then we have to initialize all 20
		// here we can add conditions check for proper data
		this.eggs = eggs;
		this.name = name;
	}

	// constructor overloading
	public Records(int i) {
		this(i, "");// in constructor overloading this stmt is must be first. if u want to do
					// modifications to data then u have to do it in this line only. after this line
					// the final fields will initialize then there is no use of modifying later in
					// the below lines
		i = 10;
	}

	public Records(String a) {
		this(1);// so here constructor chaining supports
//		this(1,"");
	}

	// compact constructor
	// here only one is allowed, either long or compact constructor
	/*	public Records {
			System.out.println("compact cons.");// in build it will create the long construcor, and places the logic we right
										// here before initializing the final fields
			eggs += 10; // here there is no param to cons. but it works like regular cons.
			name += "nnp";
	//		this.eggs = eggs; // final fields should inialize only once. by default compiler places the
								// inialization stmts. so we should not
	//		eggs=this.eggs ;	//here accessing before initalization
		}*/

	static {
		System.out.println("static");
	}

//	{
//		//this block is not allowed in Records
//	}

	public int eggs() {// if we don;t put these, compiler will place accessor methods to fields
		return eggs;
	}
	
	private static String m1() {
		return null;
	}
}
