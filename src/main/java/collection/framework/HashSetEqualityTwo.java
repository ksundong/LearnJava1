package collection.framework;

import java.util.HashSet;

class NumTwo {
	private int num;
	public NumTwo(int n) { num = n; }
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		return num % 3;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (num == ((NumTwo)obj).num)
			return true;
		else
			return false;
	}
}

public class HashSetEqualityTwo {
	public static void main(String[] args) {
		HashSet<NumTwo> set = new HashSet<>();
		set.add(new NumTwo(7799));
		set.add(new NumTwo(9955));
		set.add(new NumTwo(7799));
		System.out.println("인스턴스 수: " + set.size());
		
		for (NumTwo n : set)
			System.out.print(n.toString() + '\t');
		System.out.println();
	}
}
