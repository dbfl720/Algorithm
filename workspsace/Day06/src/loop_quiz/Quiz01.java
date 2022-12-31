package loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
// #1				
//		while (true) {
//			System.out.print("수를 입력하세요 : " );  // 먼저 써야함!
//			int number = scan.nextInt();
//			if (number == 0) {
//				
//				break;
//			} 
//		}
//		System.out.println("끝");

		
		
//		#2
		int sum = 0;			// 바깥쪽에 합을 써야함.
		for (int j = 3; j <= 50 ; j++) {
			
			if (j % 3 != 0) {  // 3의 배수가 아닐 때 skip
				continue;
				
			} sum += j;
		} System.out.println(sum);
		
		
		
	}

}
