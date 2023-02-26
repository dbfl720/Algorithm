package CodingTest;

import java.util.Scanner;

public class day03_1 {

	public static void main(String[] args) {
		// 숫자의 합 구하기
		// N개의 숫자가 공백 없이 써 있다. 이 숫자를 모두 합해 출력한는 프로그램을 작성하시오.
		Scanner scan = new Scanner(System.in);
		
//		int N = scan.nextInt();
//		
//		// 입력값을 String형 변수 sNum에 저장 후 char[]형 변수로 변환하기
//		String sNum = scan.next();
//
//		char[] cNum = sNum.toCharArray(); // String.toCharArray()는 문자열을 한 글자씩 쪼개서 char타입의 배열에 집어넣는 메소드.
//		
//		int sum = 0;
//		for(int i = 0; i < cNum.length; i++) {
//	
//			sum += cNum[i] - '0'; // cNu[i]를 정수형으로 변환하면서 sum에 더하여 누적하기 // 아키스코드 '1'-'0'
//		
//	
//		}
//
//		System.out.print(sum);
		
		
		
		
		
		// 2. 평균 구하기
		int N = scan.nextInt();
		int A[] = new int[N];  // 배열에 담기!!
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		
		long sum = 0;
		long max = 0;
		for(int i = 0; i < N; i++) {
			if(A[i] > max) {
				max = A[i];
			}
			sum +=  A[i];
					
		}
		System.out.println(sum*100.0 / max / N);
		
	
		
		
	}

}
