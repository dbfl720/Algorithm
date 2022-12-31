package condition_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도를 입력하세요:");
		int year = scan.nextInt();
//		4로 나누어 떨어지는 연도는 윤년이다.
//		100으로 나누어 떨어지는 연도는 윤년이 아니다.
//		400으로 나누어 떨어지는 연도는 무조건 윤년이다.
		
		
		// 2020 : 윤년   2100: 평년  2400 : 윤년   2021: 평년
		// 1. 비효율
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("윤년");
				} else {
					System.out.println("평년");					
				}
			} else {
				System.out.println("윤년");				
			}
		} else {
			System.out.println("평년"); 
	
		}
		
		
		
		
//		4로 나누어 떨어지는 연도는 윤년이다.
//		100으로 나누어 떨어지는 연도는 윤년이 아니다.
//		400으로 나누어 떨어지는 연도는 무조건 윤년이다.   //무조건 이라서 제일 먼저 쓰
		
		// 2. if - else if- else
		if (year % 400 == 0) {
			System.out.println("윤년");
		} else if (year  % 100 == 0){   /// 400의 배수는 내려오지 않는다.
			System.out.println("평년");
		} else if (year % 4 == 0) {  //400배수 또는 100의 배수는 내려오지 않는다.
			System.out.println("윤년");
		} else {  //4의 배수가 아니다.
			System.out.println("평년");
		}

		
		
		
	  //4로 나누어 떨어지는 연도는 윤년이다.     // 4로 나누어 떨어지면서 (그리고)
//		100으로 나누어 떨어지는 연도는 윤년이 아니다. // 나누어 떨어지지 않는 연도는 윤년이다.		
//		400으로 나누어 떨어지는 연도는 무조건 윤년이다.  // 또는
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { //윤년
			System.out.println("윤년");
		} else { // 평년
			System.out.println("평년");
		}
	}

}
