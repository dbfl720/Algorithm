package condition_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// if - else문
		System.out.print("몸무게를 입력하세요:");
		int weight = scan.nextInt();
		
		// 만약에 몸무게가 70키로 이하이면 "떡볶이" 아니면 "샐러드"
//		if (weight <= 70) {
//			System.out.println("떡볶이");
//		} else {
//			System.out.println("샐러드");			
//		}
		
		// if - (else if) - (else) 문
		if (weight <= 70) {		// 70이
			System.out.println("떡볶이");
		} else if (weight <= 75) { 	// 71 ~ 75
			System.out.println("닭가슴살");
		} else if (weight <= 80) {  // 76~ 80
			System.out.println("샐러드");
		} else {					// 81~
			System.out.println("굶자");
		}
		
	}

}
