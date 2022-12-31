package loop_ex;

public class Ex02 {

	public static void main(String[] args) {
		// do-while문   // 거짓이라도 한번은 수행은 된다. // 실무에서 잘 안쓰임.
		int i = 0;
		do {
			System.out.println("안녕 " + i);
			i++;
		} while (i < -5);   // 0 1 2

		
		// 0 ~ 4 => 5번
		i = 0;
		while (i < 5) {  // 0 1 2 3 4 
			System.out.println("와일문 " + i);
			i++;
			
		}
		
		
		
		// for (초기식; 조건; 증감) { }
		for (int j = 0; j < 5; j++) {
			System.out.println("for문 " + j);
		}
		
		
		// 1 ~ 5 => 5번
		for (int j = 1; j <= 5; j++) {
			System.out.println("귤 " + j);
			
		}
		
		// 5 ~ 1 => 5번
		for (int j = 5; j >= 1; j--) {
			System.out.println("오렌지" + j);
		}
		
		
		// 1+2+3+...10 
		int sum = 0;  // sum은 항상 밖에 써야 한다.!
		for (int j = 1; j <= 10; j++) {
			sum += j;  // 복합 대입연산자
			
		}
		System.out.println(sum);
	}

}
