package Chapter1;

import java.util.Scanner;

public class Ex1_7 {

	public static void main(String[] args) {
		// 반복
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구하세요.");
		System.out.print("n값 : ");
		int n = scan.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		
		
	}

}
