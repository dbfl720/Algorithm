package Chapter1;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
	
		int num1;
		int num2;
		
		do {
			System.out.println("두 정수를 입력하세요");
			 num1 = scan.nextInt();
			 num2 = scan.nextInt();
		} while (num2 <= num1);
		
		int result = num2 - num1;
		System.out.println(result);
	}

}
