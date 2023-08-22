package modifiers.protect;

import java.util.jar.Attributes.Name;

import modifiers.Bird;

public class Swan extends Bird{
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
	public static void main(String[] args) {
		name(null,null);
	}
	public static void name(String...strings ) {
		System.out.println(strings.length);
	}
}
