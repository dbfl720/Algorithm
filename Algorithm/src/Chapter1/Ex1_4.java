package Chapter1;

import java.util.Scanner;

public class Ex1_4 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int n = scan.nextInt();
		
//		if(n == 1)
//			System.out.println("A");
//		else if (n == 2)
//			System.out.println("B");
//		else {
//			System.out.println("C");
//		}

		
		if (n == 1 )
			System.out.println("A");
		else if (n == 2)
			System.out.println("B");
		else if ( n == 3)
			System.out.println("C");
	}

}
