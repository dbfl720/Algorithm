package array_quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 1.  위치 변경 (swap)
//		Scanner scan = new Scanner(System.in);
//		System.out.print("두 개의 index를 입력하세요 : ");
//		
//		int[] numbers = {3, 5, 2, 10, 39};
//		int n1 = scan.nextInt();
//		int n2 = scan.nextInt();
//		
//		int tmp = numbers[n1];	
//		numbers[n1] = numbers[n2];
//		numbers[n2] = tmp;
//		
//		for(int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
//		
		
		
		
		// 1. 선생님 풀이  **
//		int[] numbers = {3, 5, 2, 10, 39};
//		int index1 = scan.nextInt();
//		int index2 = scan.nextInt();
//		
//		int temp = numbers[index1];  // 배열 안에 있는 칸을 맞바꾸는 거라서..
//		numbers[index1] = numbers[index2];
//		numbers[index2] = temp;
//		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
//		
		
		
		//교체(swap) 알고리
//		int x = 6;
//		int y = 4;
//		
//		int temp = x;
//		x = y;
//		y = temp;
//	
//		System.out.println("x는 " + x + "이고, y는 " + y + "입니다.");
//		
//		
		
		
		
		// 2.
		
//		int[] numbers = {1,2,3,4,5,6,7,8,9,10};	
//		Random rand = new Random();
//		
//		for(int i = 0; i < 100; i++) {
//			int randIndex = rand.nextInt(10);  // 0 ~ 9 까지의 숫자를 랜덤으로 뽑는다.
//			int tmp = numbers[0];
//			numbers[0] = numbers[randIndex];
//			numbers[randIndex] = tmp;
//			
//							
//		} 
//		for(int i = 0; i < numbers.length; i++) {
//		System.out.print(numbers[i] + " ");
//		
//		}

		
		
		// 2. 배열 순서 변경  <*** 선생님 풀이   // **** 중요!!!**** >
//		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};   // 0 ~ 9
//		Random rand = new Random(); 
//		
//		for (int i = 0; i < 100; i++) { // i 는 인덱스가 아니다. 그냥 반복문 100번 돌리고 있는 변수다. 섞는 행위.
//			int randIndex = rand.nextInt(10);  // 0 ~ 9  // randIndex 는 칸이다.
//			
//			// 무조건 0인덱스와 randIndex 값을 맞바꾼다.
//			int temp = numbers[0];
//			numbers[0] = numbers[randIndex];
//			numbers[randIndex] = temp;
//		}
//		
//		for (int i = 0; i < numbers.length; i++) { // i는 index 칸 번호이다.    // 참고! 반복문을 돌릴 때는 횟수인지 인덱스 번호인지 생각하며 풀어라!! 
//		System.out.print(numbers[i] + " ");
//			
//		}
//		System.out.println();
		
		
		// 3.  빈도수 구하기 
//		1 ~ 5 범위 안에 숫자가 배열에 중복되어 저장되어있다.
//		1 ~ 5 까지의 숫자가 각각 몇 개씩 저장되어 있는지 출력하세요.
		
		
//		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
//		
//		int n1 = 0;
//		int n2 = 0;
//		int n3 = 0;
//		int n4 = 0;
//		int n5 = 0;
//		
//		for(int i = 1; i <= numbers3.length; i++) {
//			if (numbers3[i] == 1) {
//				n1 += numbers3[i];
//				
//			}
//			if (numbers3[i] == 2) {
//				n2 += numbers3[i];
//			
//			}
//			if (numbers3[i] == 3) {
//				n3 += numbers3[i];
//				
//			}
//			if (numbers3[i] == 4) {
//				n4 += numbers3[i];
//				
//			}
//			if (numbers3[i] == 5) {
//				n5 += numbers3[i];
//				
//			}
//			
//			
//		}
//		System.out.println("1 : " + n1);
		
		
		
		
//		// 3. 빈도수 구하기    // ** 샘 풀이.!  중요! // 면접에서 나옴! 
//		1 ~ 5 범위 안에 숫자가 배열에 중복되어 저장되어있다.
//		1 ~ 5 까지의 숫자가 각각 몇 개씩 저장되어 있는지 출력하세요.
		
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
		int[] freq = new int[6];  // 0 번째 인덱스 칸은 버린다.  1~5까지 각각의 빈도수 저장.
		
		for (int i = 0; i < numbers3.length; i++) {	  // 0 ~ 9
			freq[numbers3[i]]++;  //  numbers3[i]	// numbers3[i] 인덱스가  freq안에 저장된다 ?????
		}
		
		for (int i = 1; i < freq.length; i++) {   // 1 ~ 5    // for문을 돌리고 출력하면 ,freq안에 같은 인덱스가 번호에 맞게 정리 되서 나오나요??? 
			// 1 : 2개 
			System.out.println(i + " : " + freq[i] + "개");  
			
		}
	}
}

