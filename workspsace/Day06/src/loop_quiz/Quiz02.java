package loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("수를 입력하세요 : ");
		int number = scan.nextInt();
		
//		#1
//		int sum = 0;   // 무조건 합은 반복문 밖에 쓰기
//		for (int i = 1; i <= number; i++) {
//			sum += i;
//			
//		} System.out.println(sum);
//		
		
		
//		#2
		
		int Fac = 1;			// 곱하기 할 때는 0으로 쓰지 말고 1로 하자!!!!
		for (int j = 2; j <= number; j++ ) {  // 1 * 1 * 3 * 4 * 5 ...  
											 // 2로 시작 할 경우 :  1 * 2 * 3 * 4 * 5 *
			Fac = Fac * j;
			
		} System.out.println(Fac);
		
		
		
		
//		#3
		
		
//		for (int k = 1; k <= number; k++) {   // 1 2 3 4 5 6 7 8
//			if (number % k != 0) {
//				continue;
//			} System.out.print(k + " ");
//		}
		
		
		
//		#**  선생님 풀이
//		for (int k = 1; k <= number; k++) {
//		if (number % i == 0) {
//			System.out.print(i + " ");
//		}
//		
//		}
	}

}
