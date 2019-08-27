package enumerated;

enum Person3 {
	MAN, WOMAN;
	
	@Override
	public String toString() {
		return "I am a dog person.";
	}
}

public class EnumConst {
	public static void main(String[] args) {
		System.out.println(Person3.MAN);
		System.out.println(Person3.WOMAN);
	}
}
