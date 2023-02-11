package Chapter2;

import java.util.Scanner;

public class Q4 {

	
	static void swap(int[]a, int index1, int index2) {
		int t = a[index1]; a[index1] = a[index2]; a[index2] = t;
	}
	
	
	
	
	static void rcopy(int[]a, int[]b) {
		int num = a.length <= b.length ? a.length : b.length;
		for(int i = 0; i < num/2; i++) {
			swap(a,i,a.length - i -1);
			a[i] = b[i];
			
		}
		
	}
	
	
	public static void main(String[] args) {
		//배열 b의 모든 요소를 배열 a에 역순으로 복사하는 메서드 rcopy 작성
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a 요솟수를 입력하세요: ");
		int numa = scan.nextInt();
		int[]a = new int[numa];
		for( int i = 0; i < numa; i++) {
			System.out.println("a[" + i + "] :" );
			a[i] = scan.nextInt();
		}
		
		System.out.println("b 요솟수를 입력하세요: ");
		int numb = scan.nextInt();
		int[]b = new int[numb];
		for(int i = 0; i < numb; i++) {
			System.out.println("b[" + i + "] :");
			b[i] = scan.nextInt();
		}
		
		
		rcopy(a,b);
		
		System.out.println("역순 복사 메서드 완료입니다.");
		for(int i = 0; i < numa; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}

}
