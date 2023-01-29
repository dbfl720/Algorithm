package Chapter1;

import java.util.Scanner;

public class Q8 {
	static int sumof(int a, int b ) {
		int min;
		int max;
		
		if(a < b) {
			min = a; max = b;
		} else {
			min = b; max =a;
		}
		
		int sum = 0;
		for (int i = min; i <= max; i++)
			sum += i;
		return sum;
	}








	public static void main(String[] args) {
		// 정수 a,b를 포함하여 모든 정수의 합을 구하여 반환하는 메소드 // 대소 관계없이 합을 구하기.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 2개를 입력하세요 : ");
		System.out.print("a의 값: ");
		int a = scan.nextInt();
		System.out.println("b의 값 ");
		int b = scan.nextInt();
		
		System.out.println("a,b의 총합은 : " + sumof(a,b));
	

	}
}
