package quiz;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
//		#1
//		두 개의 점수를 입력 받아서 두 점수 모두가 70점 이상이면 합격입니다를 출력하세요
//		합격입니다.
		
//		System.out.print("두 점수를 입력하세요 :");
//		int number1 = scan.nextInt();
//		int number2 = scan.nextInt();
//		
//		if (number1 >= 70 && number2 >= 70) {
//			System.out.println("합격입니다.");
//		
//			
//		}
//		
//	}
//
//}



//		#2
//		수를 입력 받아서 2와 3의 공배수인지 판별하세요.
		
		
		System.out.print("수를 입력하세요 :");
		int number = scan.nextInt();
		
		if (number % 2 == 0 && number % 3 ==0) {
			System.out.println("2와 3의 공배수입니다.");
		}
	}
}
		
		
//		#3
//		1 ~ 10의 사이의 수를 입력 받아야 한다. 범위를 넘어갈 경우 잘못 입력하셨습니다를 출력하세요.
//		
//		System.out.print("1~10 사이의 수를 입력하세요 :");
//		int number = scan.nextInt();
//		
//		if (number < 1 || number > 10) {
//			System.out.println("잘못 입력하셨습니다.");
//		}
//		
//			
//	}
//}

