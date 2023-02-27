package Chapter1;

import java.util.Scanner;

public class Ex1_8 {

	public static void main(String[] args) {
		// for문
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구하세요.");
		System.out.print("n값 : ");
		int n = scan.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += i;
		
		System.out.println("1부터 " + n + "까지의 합은 "+ sum + "입니다.");

	}

}
