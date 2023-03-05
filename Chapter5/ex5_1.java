package Chapter5;

import java.util.Scanner;

public class ex5_1 {

		// 팩토리얼값을 재귀적으로 구함
		static int factorial(int n) {
			if (n > 0) {
			return n * factorial(n - 1);
			} else {
				return 1;
			}

		}

		
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int x = scan.nextInt();
		
		System.out.println(x + "팩토리얼은 " + factorial(x) + "입니다.");
		
		
	} // main
}
