package Assessment;

import java.util.Set;
import java.util.TreeMap;

public class Iterator_TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating TreeMap object of type <String, String>
		TreeMap<String, String> tMap = new TreeMap<String, String>();

		// adding key-value pairs to TreeMap object
		tMap.put("USA", "USD");
		tMap.put("India", "INR");
		tMap.put("UK", "GBP");
		tMap.put("Japan", "JPY");
		tMap.put("UAE", "AED");

		// Way 1: Get keySet() and Iterate using for-each loop
		System.out.println("Get keySet() and" + " Iterate using for-each loop\n");

		// getting keySet() into Set
		Set<String> set1 = tMap.keySet();

		// for-each loop
		for (String key : set1) {
			System.out.println("Key : " + key + "\t\t" + "Value : " + tMap.get(key));
		}
	}

}
