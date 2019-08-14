package collection.framework.set.treeset;

import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() { return name + " : " + age; }
	
	@Override
	public int compareTo(Person p) {
		return this.age - p.age;
	}
}

public class ComparablePerson {
	public static void main(String[] args) {
		TreeSet<Person> tree = new TreeSet<>();
		tree.add(new Person("YOON", 37));
		tree.add(new Person("KIM", 43));
		tree.add(new Person("HONG", 33));
		
		for (Person p : tree) {
			System.out.println(p);
		}
	}
}
