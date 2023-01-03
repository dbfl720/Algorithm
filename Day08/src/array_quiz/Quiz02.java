package array_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		//1.  배열 값 변경
//		int[] numbers = {3, 5, 2, 10, 39};
//		
//		numbers[3] = 16;
//
//		System.out.println("변경할 index와 값을 입력하세요 : 2 "+ numbers[3] );
		
		
		
		// 2. 
		char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
		
		if (scores.length == 'x') {
			System.out.println("60점");
		} else {
			System.out.println("100점");
		}
	}

}
