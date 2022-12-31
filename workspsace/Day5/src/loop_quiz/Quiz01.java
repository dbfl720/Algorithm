package loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
//		#1
//		System.out.print("수를 입력하세요:");
//		int count = scan.nextInt();
//		
//		int i = 0;
//		while (i < count) {		// 0 < 4   0 1 2 3 
//			System.out.println("화이팅!!!");
//			i++;
//		}
//		
		
		
		
//		#2
//		System.out.print("카운트 다운 수를 입력하세요: ");
//		
//		int countDown = scan.nextInt();	
//		while (countDown >= 0 ) {
//			System.out.println(countDown);
//			countDown--;
//		} System.out.println("발사");
		
		
		
		
		
//		#3
	
		
//		
//		int i = 0;
//		while (i < 5) {
//			System.out.println("수를 입력하세요: " + i);
//			int number = scan.nextInt();
//			System.out.println("출력: "+ i);
//			i++;
//		}
//		
	
		
		
		
		
		
//		#4		 ???
//		int n = 1;
//		while (n <= 9) {
//			System.out.println("3 X " + n + " = " + (n * 3));
//			n++;
//		}
		
		
		// 선생님 풀이
	
		int number = 3;
		int i = 1;  // 시작값
		while (i <= 9) {    // 1 2 3 4 5 6 7 8 9   10 거
			System.out.println(number + " X " + i + " = " + (number * i));
			
			i++;
		}

	}
}

