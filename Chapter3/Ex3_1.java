package Chapter3;

import java.util.Scanner;

public class Ex3_1 {

		// 실습 3-1
		static int seqSearch(int[]a, int n, int key) {
			int i = 0;
			
//			1. 방법
//			while(true) {
//				if (i == n)
//					return -1;
//				if (a[i] == key)
//					return i;
//				i++;
//			}
			
			
//			2. 방법 (보초법)
			a[n] = key;  // 보초를 추가;
			
			while (true) {
				if (a[i] == key) // 검색 성공
					break;
				i++;
			}
			return i == n ? -1 : i;  
			
		}
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("요솟수: ");
			int num = scan.nextInt();
			int[] x = new int[num + 1];   // 요솟수가 num + 1 인 배열 (보초법 때문에 1 증가)
			
			for (int i = 0; i < num; i++) {
				System.out.print("x[" + i + "]:");
				x[i] = scan.nextInt();
			}
			
			System.out.print("검색할 값: ");  // 키값을 입력받음
			int ky = scan.nextInt();
			
			int idx = seqSearch(x, num, ky);  // 배열 x에서 값이 ky인 요소를 검색
			
				
			if (idx == -1)
				System.out.println("그 값의 요소가 없습니다.");
			else
				System.out.println("그 값은 x[" + idx + "]에 있습니다.");

	} // main

}
