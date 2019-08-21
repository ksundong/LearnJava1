package collection.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ConvertCollection {
	public static void main(String[] args) {
		List<String> lst = Arrays.asList("Box", "Toy", "Box", "Toy");
		ArrayList<String> list = new ArrayList<>(lst);
		
		for (String s : list)
			System.out.print(s + '\t');
		System.out.println();
		
		// Duplicate Instance Filtering
		HashSet<String> set = new HashSet<>(list);
		
		// Move Data into ArrayList
		list = new ArrayList<>(set);
		
		for (String s : list)
			System.out.print(s + '\t');
		System.out.println();
	}
}
