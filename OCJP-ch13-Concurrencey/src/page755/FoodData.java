package page755;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class FoodData {

	public static void main(String[] args) {
		var foodData=new HashMap<String, Integer>();
//		var foodData=new ConcurrentHashMap<String, Integer>();
		
		foodData.put("penguin", 1);
		foodData.put("flemingo", 2);
		for(var key:foodData.keySet()) {
			System.out.println("a");
			foodData.remove(key);
		}
		
	}
}
