package Chapter1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("네 개의 정수를 입력하세요 : ");
		int q = scan.nextInt();
		int w = scan.nextInt();
		int e = scan.nextInt();
		int r = scan.nextInt();
		
		int min = min4(q,w,e,r);
		System.out.println("최소값은 : " + min);

	} // main






	static int min4 (int a, int b, int c , int d) {
		int min = a;
		if(min > b)
			min = b;
		if(min > c)
			min = c;
		if(min > d)
			min = d;
		
		return min;
	}
}