package collection.framework.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class SortedTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(3);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		System.out.println("인스턴스 수: " + tree.size());
		
		// for-each
		for (Integer n : tree)
			System.out.print(n.toString() + '\t');
		System.out.println();
		
		// Iterator 반복자
		for (Iterator<Integer> itr = tree.iterator(); itr.hasNext(); )
			System.out.print(itr.next().toString() + '\t');
		System.out.println();
	}
}
