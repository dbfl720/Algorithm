package Chapter2;

import java.util.Scanner;

public class Q3 {
	
	
	
static void swap(int[]a, int index1, int index2) {
	int t = a[index1]; a[index1] = a[index2]; a[index2] = t;
}
	
	
	
static void copy(int[] a, int[] b) {
	int num = a.length <= b.length ? a.length : b.length; // 삼항 연산자.
	for (int i = 0; i < num; i++) {
		a[i] = b[i];
	}
}





	public static void main(String[] args) {
		// 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a의 요솟수는 " );
		int numa = scan.nextInt();  // 요솟수
		int[] a = new int[numa];  // 요솟수가 numa인 배열
		for (int i = 0; i < numa; i++) {
			System.out.print("a[" + i + "]:");
			a[i] = scan.nextInt();
		}
		
		System.out.print("b의 요솟수는 ");
		int numb = scan.nextInt();
		int[] b = new int[numb];
		for (int i = 0; i < numb; i++) {
			System.out.print("b[" + i + "]:");
			b[i] = scan.nextInt();
		}
		
		copy(a, b);  // 배열 b의 모든 요소를 배열 a에 copy
		
		System.out.println("배열 b의 모든 요소를 배열 a에 copy 하였습니다.");
		for(int i = 0; i < numa; i++) {
			System.out.println("a[" + i + "] =" + a[i]);
		}

	}

}
