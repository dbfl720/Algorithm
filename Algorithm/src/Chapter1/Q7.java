package Chapter1;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// for문
		Scanner scan = new Scanner(System.in);
		System.out.println("1이상의 정수를 입력하세요 : ");
		
		int n = scan.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
			
			
		}
		System.out.println("합은 : " + sum);
	}

}
