package loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		// break문 : break가 써진 곳의 가장 가까운 '반복문'을 빠져 나간다. (if문 아님!!!!)
		
		
		// 무한루프에서 Hello world 다섯번 출력  // 무한루프 코드는 별로 좋지 않은 코드. // 가독성이 for문 무한루프보다 좋음.
		
		int i = 0;  // 카운팅 변수
		while (true) {
			// 0 1 2 3 4    5가 되면 나감
			if (i == 5) {
				break;   // If문과는 상관 없고, 가까이있는  while 혹은 switch에 빠져 나가는 거임.
			}
			System.out.println("Hello world " + i);
			i++;
		}
		
		
		// for문 무한루프
		for (int j = 0; ; j++) {  // 0 1 2 3 4    5일 때 빠져나감
			if (j == 5) {
				break;  
			}
			System.out.println("for 무한루프 " + j);
		}
		
		
		
		
		// continue문 : skip을 한다. 아래의 코드들을 수행하지 않고 즉시 조건을 보러 간다.
		
		// 1 ~ 10까지 수 중에서 4의 배수면 출력하지 않기  
		// (1)  if문으로 처리
		
		for (int j = 1; j <= 10; j++) {
			if (j % 4 != 0) {  // 4의 배수가 아닐 때
				System.out.print( j + " ");
				
			}
			
		}
		System.out.println();
		
		
		
		// (2) continue문으로 처리
		for (int j = 1; j <= 10; j++) {
			if (j % 4 == 0) { // 4의 배수일 때는 출력을 건너뛴다.
				continue;    // 아래 코드들을 skip
				
			}
			System.out.print(j + " ");
		}

	}

}
