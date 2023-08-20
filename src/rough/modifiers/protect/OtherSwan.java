package modifiers.protect;

import modifiers.Bird;

public class OtherSwan extends Bird{
	public void inheritance() {
		System.out.println(text);
		floatInWater();
	}
	
	public void subclassObject() {
		var swan=new Swan();
		System.out.println(swan.text);
		swan.floatInWater();
	}
	
	public void superclassObject() {
		var bird=new Bird();
		bird.floatInWater();
		System.out.println(bird.text);		
	}
}
