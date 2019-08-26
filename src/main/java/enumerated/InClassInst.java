package enumerated;

class Person2 {
	static final Person2 MAN = new Person2();
	static final Person2 WOMAN = new Person2();
	
	@Override
	public String toString() {
		return "I am a dog person";
	}
}

public class InClassInst {
	public static void main(String[] args) {
		System.out.println(Person2.MAN);
		System.out.println(Person2.WOMAN);
	}
}
