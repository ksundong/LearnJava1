package collection.framework.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class PersonTwo implements Comparable<PersonTwo> {
	String name;
	int age;
	
	public PersonTwo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() { return name + " : " + age; }
	
	@Override
	public int compareTo(PersonTwo p) {
		return this.age - p.age;
	}
}

class PersonComparator implements Comparator<PersonTwo> {
	public int compare(PersonTwo p1, PersonTwo p2) {
		return p2.age - p1.age;
	}
}

public class ComparatorPerson {
	public static void main(String[] args) {
		TreeSet<PersonTwo> tree = new TreeSet<>(new PersonComparator());
		tree.add(new PersonTwo("KIM", 25));
		tree.add(new PersonTwo("PARK", 39));
		tree.add(new PersonTwo("KONG", 37));
		
		for (PersonTwo p : tree) {
			System.out.println(p);
		}
	}
}
