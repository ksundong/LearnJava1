package collection.framework.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapCollection {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		// Key-Value Store
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		
		// Data output
		while (iterator.hasNext()) {
			int key = iterator.next();
			System.out.println(key + "번: " + map.get(key));
		}
		System.out.println();
		
		// Data remove
		map.remove(37);
		
		// Data remove check
		System.out.println("37번: " + map.get(37));
	}
}
