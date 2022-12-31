package loop_quiz;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		
		
//		#1  합 구하기  $$$ 중요하다! 합은 뒤에서도 계속 나온다!!!
//		int number = scan.nextInt();   // 끝 수
//		
//		int sum = 0;
//		for (int i = 1; i <= number; i++) {  //  1 2 3 4...
//			sum += i;
//			
//		} System.out.print(sum);
		
		
		
		
//		#2 팩토리얼   xxxxxx틀림xxxxxx
//		
//		
//		int number = scan.nextInt();
//		int fact = 1;   //  $$ 주의! 곱하기 나오는 식에서는 0으로 쓰면 모든 수가 0이때문에 안된다!!
//				
//		for (int i = 2; i <= number; i++) {   // 초기화식이 1일 경우 ( 1 * 1 * 2 *...) 괜히 1을 더 곱하기 때문에 2로 하는게 더 효율적!
//			fact *= i;   // 1 * 2 * 3 * 4 * ...
//		}
//		System.out.println(fact);
//		
//		
		
		
		
		
		
//		#3  약수 구하기   // 나누고자 하는 숫자에 증감식 수를  나눠서 0으로 떨어지게 하는 문제.
		int number = scan.nextInt();
		
		for (int i = 1; i <= number; i++) {
			if(number % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		
		
		
		
		
	}

}
