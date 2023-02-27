package Chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class ex3_5 {

	public static void main(String[] args) {
		// Arrays.binarySearch로 이진 검색
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = scan.nextInt();
		int[] x = new int[num];  // 인덱스가 num인 배열
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0]: ");  // 배열의 첫 요소를 먼저 입력받음.
		x[0] = scan.nextInt();
		
		for (int i = 1; i < num; i++) {
			 do {
				 System.out.print("x[" + i + "]: ");
				 x[i] = scan.nextInt();
			 } while (x[i] < x[i-1]); // 바로 앞의 요소보다 작으면 다시 입력받음 ( 오름차순으로 입력해야해서..)
		}
		
		System.out.print("검색할 값: "); // 키 값을 입력받음
		int ky = scan.nextInt();
		
		int idx = Arrays.binarySearch(x, ky); // 배열 x에서 값이 ky인 요소를 검색
				
		if (idx < 0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println("그 값은 x[" + idx + "]에 있습니다.");
		

	}

}
