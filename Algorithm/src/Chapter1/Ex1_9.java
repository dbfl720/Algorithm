package Chapter1;

import java.util.Scanner;

public class Ex1_9 {

	public static void main(String[] args) {
		// do - while문
		Scanner scan = new Scanner(System.in);
		
		int n;
		System.out.println("1부터 n까지의 합을 구합니다.");

		do {
			System.out.println("n값: ");
			n = scan.nextInt();
		} while (n <= 0);   // n이 0보다  클 때까지 반복합니다.
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
			System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		
	}

}
