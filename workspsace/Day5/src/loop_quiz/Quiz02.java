package loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
////		#1
//		for (int i = 35; i <= 40; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		
//		
//		
////		**
//		for (int i = 35; i <= 40; i++) {
//			System.out.print(i + " ");
//		
//		
//		
//		
////		#2
//		for (int i = 5; i >= -5; i--) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//			
			
			
//		**
//		for (int i = 5; i >= -5; i--) {
//			System.out.print(i + " ");
//		}
//			
//			System.out.println();
//			
//			
			
//		
////		#3
//		
//		for (int j = 3; j <= 50; j += 3) {
//			
//			System.out.print(j  + " ");
//		}
//		
//		System.out.println();
	
		
			
//			**
			// 3의 배수
//			for (int i = 1; i <= 50; i++) {  
//				if (i % 3 == 0) {  //3의 배수
//					System.out.print(i + " ");	
//				}
//			}
//										
//			System.out.println();
//	
//			
//			
//			for (int i = 3; i <= 50; i += 3) {  //면접에서는 효율성 있는 코드가 좋다. 
//				System.out.print(i + " ");
//			}
//			System.out.println();
//			
			
			
		
		
		
//		#4
		
//		int count = 0;			// 7의 배수 개수   // 변수 위치 중요!!!!!
//		for (int i = 7; i <= 100; i += 7) {		// 반복문은 꼭 출력을 안해도 된다. 안 필요하면..	
//				count += 1;	
//				
//			}					
//		System.out.print(count);   // 출력 위치 중요!!!!
//		
//		System.out.println();
		
		
		
//		**
//		int count = 0;   // 한번도 안돌아서 0번..
//		for (int i = 7; i <= 100; i+= 7) {  
//			count++; 			
//		}
//		System.out.println("7의 개수의 개수는:" + count);
//		
		
		
//		#5
		Scanner scan = new Scanner(System.in);
//		System.out.print("단수를 입력하세요 : ");
//		int number = scan.nextInt();
//		
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(number + " X " + i + " = " + (number * i));
//		}
//		
		
		
//		** 5. 구구단
		System.out.print("단수를 입력하세요: ");
		int number = scan.nextInt();
		for (int i = 1; i <= 9; i++) {  //  1 2 3 4 5 6 7 8 9
			System.out.println(number + " X " + i + " = " + (number * i) );
		}
		
		
    }
}

	







