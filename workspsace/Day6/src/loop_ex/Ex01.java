package loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		// break문 : break가 써진 곳의 가장 가까운 반복문에서 빠져 나온다.
		
		// 무한루프에서 Hello world 다섯번 찍기   // 무한루프 코드는 안 좋음.!!!!
		// 무한루프는 while문을 더 많이 씀!
		int i = 0;
		while (true) {    
			// 0 1 2 3 4 =>5번    5일 때 빠져나오게
			if (i == 5) {
				break;  // 제일 가까운 반복문에 나가는 것임. 
			}
			
			System.out.println("Hello world! " + i);
			i++;
		}
		
		
		
		// for문 무한루프				// 반복문은 많이 돌면 안 좋음.
		for (int j = 0; ; j++) { // 조건식이 없으면 무한루프 또는 true
			if (j == 5) {
				break;
			}
			System.out.println("for 무한루프 " + j);
		}

		
		// continue문: Skip. 아래 코드들을 수행하지 않고 즉시 조건을 본다.  (없어도 상관 없는 문법, 선택사항,)
			
		// 1 ~ 10 까지의 수 중에서 4의 배수일 때 숫자를 출력하지 않기: 1 2 3  5 6 7 9 10
		// (1) if문으로 처리
		for (int j = 1; j <= 10; j++) {
			if (j % 4 != 0) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
		
		// (2) continue문으로 처리
		for (int j = 1; j <= 10; j++) {  // 1 2 3  (4 건너뜀)
			if (j % 4 == 0) { // 4의 배수일 때 출력을 skip 한다.
				continue;
			}
			System.out.print(j + " ");
		}
		
		
	}

}
