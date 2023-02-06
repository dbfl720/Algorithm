package Chapter1;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// 다중 루푸 다루기3
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정사각형을 출력합니다.");
		int num = scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print('*');
				
			}
			System.out.println();
		}
		
//		Scanner stdIn = new Scanner(System.in);
//		int n;
//
//		System.out.println("정사각형을 출력합니다.");
//
//		do {
//			System.out.print("변의 길이 : ");
//			n = stdIn.nextInt();
//		} while (n <= 0);
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= n; j++)
//				System.out.print('*');
//			System.out.println();
//		}
	}

}
