package condition_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월을 입력하세요:");
		int month = scan.nextInt();
		
		// 여러개 쓸 때는 switch문이 좋다. 가끔 쓰임.
		switch (month) {
		case 3:		// 주의! 자바버전이 올라가서 가능, 자바가 오래된 곳은 못 씀.
		case 4:			// 오래된 자바 버전은 이렇게 가능.
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9, 10, 11 :
			System.out.println("가을");
			break;
		case 12, 1, 2 :
			System.out.println("겨울");
			break;
		default :
			System.out.println("잘못된 월입니다.");
		}
	}

}
