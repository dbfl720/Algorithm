package Chapter1;

import java.util.Scanner;

public class Ex1_10 {

	public static void main(String[] args) {
		// 반복 과정에서 조건 판단하기1
		Scanner scan = new Scanner (System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		int n;
		do {
			System.out.print("n값 : ");
			n = scan.nextInt();
		} while (n <= 0);
		
		
		int sum = 0;  // 합
		
		for (int i = 1; i <= n; i++) {
			if (i < n) {
				System.out.print(i + "+");
			} else {
				System.out.print(i + "=");
			} sum += i;
		}
		
		System.out.println(sum);

	}

}
