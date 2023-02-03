package Chapter1;

import java.util.Scanner;

public class Ex1_14 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner (System.in);
		int n;
		int w;
		
		
		System.out.println("*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.");

		do {
			System.out.print("n의 값: ");
			n = stdIn.nextInt();
		} while (n <= 0);
		
		do {System.out.print("w값: ");
		w = stdIn.nextInt();
		} while (w <= 0 || w > n);
		
		
		
		// 효율적이지 않은 코드. for문을 반복할 때마다 if문을 실행해야 하므로.. 
//		for (int i = 0; i < n; i++) {
//			System.out.print("*");
//			if(i % w == w - 1) { // i값을 w값으로 나눈 나머지가 w-1일 때 줄바꿈을 합니다. 
//				System.out.println(); // 줄 바꿈.
//			}
//			if( n % w != 0) { //n 값이 w의 배수가 아니라면 줄바꿈 합니다. 
//				System.out.println();  // 줄 바꿈.
//			}
//		}
		
		
		
		// 효율적인 코드.
		 for(int i = 0; i < n / w; i++) { // 예를 들어 n값이 14이고 w값이 5이면 *****를 3번 출력. 즉, n값이 w값의 배수이면 출력.
			 System.out.println("*".repeat(w));
		 }
		 
		 int rest = n % w; // n값이 w값의 배수가 아니라면 남아있는 마지막  줄 바꿈을 한다.
		 if (rest != 0) { 
			 System.out.println("*".repeat(rest));
		 }
	} // main

}



------
//*를 n개 출력하되 w개마다 줄을 바꿔서 출력합니다.
//n의 값: 14
//w값: 5
//*****
//*****
//****
