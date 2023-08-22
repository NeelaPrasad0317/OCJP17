package modifiers;

import modifiers.Bird;
import modifiers.protect.Swan;

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
