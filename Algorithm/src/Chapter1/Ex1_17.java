package Chapter1;

import java.util.Scanner;

public class Ex1_17 {

	public static void main(String[] args) {
		// 직각이등변삼각형 출력
		Scanner scan = new Scanner(System.in);
		
		int n;
		System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");

		do {
			System.out.print("몇 단 삼각형입니까?: ");
			n = scan.nextInt();
		} while (n <= 0);
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
				
			}System.out.println();
		}
	}

}
