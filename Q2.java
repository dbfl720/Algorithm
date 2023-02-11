package Chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
	}
	
	
	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[]a) {
		System.out.println(Arrays.toString(a));
		for(int i = 0; i < a.length/2; i++) {
			System.out.println("a[" + i + "]와 a]"  + (a.length - i -1) +"]을 교환합니다.");
			swap(a, i, a.length - i - 1); 
			System.out.println(Arrays.toString(a));
		}
	}
	
	
	
	static void sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		} System.out.println("합은 : " + sum);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num = scan.nextInt();  // 요솟수
		int[] x = new int[num];  // 요솟수가 num인 배열
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = scan.nextInt();
		}
		
		reverse(x);  // 배열 a의 요소를 역순으로 정렬
		System.out.println("역순 정렬을 마쳤습니다.");
		
	
//		Q2
		sumOf(x);
	
		
		
	} // main

}
