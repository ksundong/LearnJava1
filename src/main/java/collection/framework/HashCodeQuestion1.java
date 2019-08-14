package collection.framework;

import java.util.HashSet;
import java.util.Objects;

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "(" + age + "세)";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	@Override
	public boolean equals(Object obj) {
		String paramName = ((Person)obj).name;
		int paramAge = ((Person)obj).age;
		if (name.equals(paramName) && age == paramAge) {
			return true;
		} else {
			return false;
		}
	}
}

public class HashCodeQuestion1 {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("John", 24));
		set.add(new Person("Smith", 28));
		set.add(new Person("Anna", 21));
		set.add(new Person("John", 24));
		
		for (Person person : set) {
			System.out.println(person.toString());
		}
	}
}
