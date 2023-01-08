package class_ex01;

public class StudentInfo {
	
	// 속성 - 필드.
	String name;
	String className;
	int age;
	String phoneNumber;
	
	
	// 행위 - 메소드.
	void isAdult() {
		if(age >= 20) {
			System.out.println(this.name + "은 성인입니다.");
		} else {		
		System.out.println(this.name + "은 미성년자입니다.");
		}
	}

}
