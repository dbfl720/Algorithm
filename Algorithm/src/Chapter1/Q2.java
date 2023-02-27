package Chapter1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		System.out.print("세 정수를 입력하세요 : ");
		int e = scan.nextInt();
		int r = scan.nextInt();
		int g = scan.nextInt();
		
		int min = min3(e,r,g); 

		System.out.println("최소값은 "+ min);
	}



	static int min3(int a, int b, int c ) {
		int min = a;
		if(min > b)
		  min = b;
		if(min > c)
			min = c;
		
		return min;
	}
}
