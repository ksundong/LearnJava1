package enumerated;

interface Animal {
	int DOG = 1;
	int CAT = 2;
}

interface Person {
	int MAN = 1;
	int WOMAN = 2;
}

public class NonSafeConst {
	public static void main(String[] args) {
		who(Person.MAN);    // normal call
		who(Animal.DOG);    // abnormal call
	}
	
	public static void who(int man) {
		switch (man) {
			case Person.MAN:
				System.out.println("남성 손님입니다.");
				break;
			case Person.WOMAN:
				System.out.println("여성 손님입니다.");
				break;
		}
	}
}
