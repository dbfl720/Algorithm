package CodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class day03_2 {

	public static void main(String[] args) throws IOException {
		// 3. 구간 합 구하기
		BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in)); // BufferedReader 선언
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // StringTokenizer: nextToken()함수를 쓰면 readLine()을 통해 입력 받은 값을 공백 단위로 구분하여 순서대로 호출
		int suNo = Integer.parseInt(stringTokenizer.nextToken()); // String -> int 타입 변환
		int quizNo = Integer.parseInt(stringTokenizer.nextToken());
		
		long[] S = new long[suNo + 1]; // 0번째 인덱스 무시하고자 1씀. 합 배열 생성.
		stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 구간 합을 구할 대상 배열A[i] 입력 받기.
		
		for(int i = 1; i <= suNo; i++) { // 0번째 인덱스 신경 안쓰기에 1부터 시작 
			S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken()); // 합 배열 공식. S[i] = S[i-1] + A[i]
		}
		
		for (int q = 0; q < quizNo; q++) { // 인덱스랑 상관 없기에 0부터 시작.
			stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 질의 범위 입력 받기.
			int i = Integer.parseInt(stringTokenizer.nextToken());
			int j = Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(S[j] - S[i - 1]);   // 구간 합 공식: S[j] - S[i - 1]
		}
		
		
		
		
			
	} // main

}
