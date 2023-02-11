package Chapter2;

import java.util.Arrays;
import java.util.Scanner;



		
		class Ex2_5 {
			// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
			
			static void swap(int[] a, int idx1, int idx2) {
				int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
			}
			
			//배열 a의 요소를 역순을 정렬
			static void reverse(int[]a) {
				for (int i = 0; i < a.length / 2; i++)
					swap(a, i , a.length - i -1);
			}
			
		

		public static void main(String[] args) {
			// 배열 요소에 값을 ㅇ릭어 들여 역순으로 정렬
			Scanner scan = new Scanner(System.in);
			
			System.out.print("요솟수: ");
			int num = scan.nextInt();
			
			int[] x = new int[num];
			
			for(int i = 0; i < num; i++) {
				System.out.print("x[" + i + "]: ");
				x[i] = scan.nextInt();
			}
			
			reverse(x);  // 배열 a의 요소를 역순으로 정렬
			
			System.out.println("요소를 역순으로 정렬했습니다.");
			System.out.println("x = " + Arrays.toString(x)); // Arrays.toString 메서드 : 배열의 전체 요솟값을 한번에 표시
			
	} // main

}
