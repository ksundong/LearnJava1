package enumerated;

enum Animals {
	DOG, CAT
}

enum Persons {
	MAN, WOMAN
}

public class SafeEnum {
	public static void main(String[] args) {
		whos(Persons.MAN);   // normal call
//		whos(Animals.DOG);   // abnormal call... cause compile error
	}
	
	public static void whos(Persons man) {
		switch (man) {
			case MAN:
				System.out.println("남성 손님입니다.");
				break;
			case WOMAN:
				System.out.println("여성 손님입니다.");
				break;
		}
	}
}
