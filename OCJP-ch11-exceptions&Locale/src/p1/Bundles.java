package p1;

import java.util.Locale;
import java.util.ResourceBundle;

public class Bundles {

	public static void main(String[] args) {
		var fr=new Locale("fr");
		Locale.setDefault(new Locale("en"));
//		System.out.println(fr);
//		System.out.println(Locale.getDefault());
		
//		var bundle=ResourceBundle.getBundle("Bunny");
		var bundle=ResourceBundle.getBundle("Bunny", fr);
		System.out.println(bundle.getString("name"));
		System.out.println(bundle.getString("type"));
		System.out.println(bundle.getString("age"));
		
		//wooooooooww......while loading the bundle on line 15, it look for fr bundle in classpath.
		//if it is not fount it will load the default locale bundle
		//Bunny_en and Bunny
		//if the fr bundle Bunny_fr is available in classpath then it wont load the Bunny_en
		//Once the bundles are ready. then in search of key, it will go from most specific to most generic bundle
	}
}
