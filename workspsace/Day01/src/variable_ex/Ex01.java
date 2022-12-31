package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 정수형 변수(Integer)
		int number = 10;
		System.out.println(number);
		
		number = 100;   // 값을 변경 , 변수이므로 값 변경 가능. 재사용 할 때는 자료형 쓰지 않는다.
		System.out.println(number);
		
		int number2 = 5;  // = 값을 초기화(initialize) 한다
		int sum = number + number2;
		System.out.println(sum);
		
		// = 저장한다. 값을 할당한다. Assignment
		
		// 소수/실수 변수 (float) : 권장 안함
		float f = 1.555555555f;  // 끝에 f를 적어야 한다.
		System.out.println(f);
		
		// 소수/실수 변수(double)
		double d = 3.888888888888888888;
		System.out.println(d);
		
		// 문자 변수 (character): 문자 한개. 작은 따옴표 붙인다.
		char c = 'a';
		System.out.println(c);
		
		// boolean 변수: 참(true) 또는 거짓(false)
		boolean isReal = true; // 자두색 = 예약어
		boolean isFalse = false;
		System.out.println(isReal);
		System.out.println("거짓이다:" + isFalse);
		
	}

}
