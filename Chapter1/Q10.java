package Chapter1;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("양의 정수값의 자릿수를 구합니다.");
		
		int n;
		do {  // do - while 문 : 루프 부분을 한 번은 반드시 실행한다.
			System.out.print("정수값 : ");
			n = scan.nextInt();
		} while (n <= 0);
		
		int no = 0;  //자릿수
		while (n > 0) {
			n /= 10;   //n을 10으로 나누비다.
			no++;
		}
		
		System.out.println("그 수는 " + no + "자리입니다.");
	}

}
