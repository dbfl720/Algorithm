package loop_quiz;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
//		#1
//		Scanner scan = new Scanner(System.in);
		
		
	
//		while (true) {
//			System.out.print("수를 입력하세요 : ");  // 반복문 안에서 반복
//			int number = scan.nextInt();		 // 반복문 안에서 반복
//			if (number == 0) {
//				System.out.println("끝"); // break 전에 써야함. 그 이유는 break 아래 쓰면, 프린트 안찍고 종료.!!!!	
//				break;					// if문을 빠져나가는게 아니라 중가로를 빠져나
//			
//			}					
//		}	
//		
		
		
		
		
//		#2
		
//		$$ 반복문에 가로에 들어가는지 안들어 가는지 확인하면서 문제풀기!!
		
		
		int sum = 0;			// 합계는 무조건 반복문 밖에 만들어야 한다.!!!!
		for (int i = 3; i <= 50; i++) {
			if (i % 3 != 0) {      // 건너  뛰는 조건! 3의 배수가 아닐 때.
				continue;
			}
			sum += i;	 // 3 6 9	..		// 이 부분은 반복이 이뤄져야 해서 반복문 안에 씀.! 						
			 								
		} System.out.println(sum);   	// 반복문 밖에 써야지 한번만 출력됨.
		

	
	 }
		
}
	