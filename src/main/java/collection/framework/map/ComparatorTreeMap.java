package collection.framework.map;

import java.util.*;

class AgeComparator implements Comparator<Integer> {
	public int compare(Integer n1, Integer n2) {
		return n2 - n1;
	}
}

public class ComparatorTreeMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>(new AgeComparator());
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		// key Instance
		Set<Integer> keySet = map.keySet();
		
		// key print
		for (Integer n : keySet)
			System.out.print(n.toString() + '\t');
		System.out.println();
		
		// value print(based on for-each)
		for (Integer n : keySet)
			System.out.print(map.get(n) + '\t');
		System.out.println();
		
		// value print(based on iterator)
		for (Iterator<Integer> itr = keySet.iterator(); itr.hasNext(); )
			System.out.print(map.get(itr.next()) + '\t');
		System.out.println();
	}
}
