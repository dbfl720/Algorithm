package condition_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 2. 공배수 구하기
//		System.out.print("수를 입력하세요:");
//		int number = scan.nextInt();
//		if (number % 2 == 0 && number % 3 == 0) {
//			System.out.println("2와 3의 공배수 입니다.");
//		}
		
		
		// 3.유효성 검사 validation check  (프론트에서 많이 사용 )
		System.out.print("1 ~ 10 사이의 수를 입력하세요:");
		int number = scan.nextInt();
		// number가 10보다 큰 경우,(또는) number가 1보다 작은 경우 -> 잘못
		if (number > 10 || number <= 0) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		// 실행 코드
	}

}
