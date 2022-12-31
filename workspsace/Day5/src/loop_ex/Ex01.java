package loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 안녕 세번 출력하기
		System.out.println("안녕");
		System.out.println("안녕");
		System.out.println("안녕");

		
		// while 반복문을 이용해서 안녕 3번 쓰기
		int i = 0;    // 카운팅을 위한 변수   i , j , k
		while (i < 3) {		// 0 1 2      3    // 돌리고 싶은 횟수를 써라 (3)
			System.out.println("안녕 " + i);
			//i = i + 1;  //마지막에 써라.  
			//i += 1;  // 복합 대입 연산
			//i++;		// 후위 증감 연산자 
			++i;		// 전위 증감 연산   //반복문에서 이걸로 주로 사용함.
			
		}
		
		// ++i, i++ 차이점
		int number = 5;
		System.out.println("number:" + number);  // 5
		System.out.println("++number:" + (++number));  // 6, 1을 더하고 저장까지 해준다.   
		System.out.println("number++:" + number++);   // 6, 이 줄에서는 더해지지 않고 다음줄에서 더해짐.
		System.out.println("number:" + number);     // 7
		
		
		// 0 ~ 4 => 5번
		i = 0;
		while (i < 5) {		// 0 1 2 3 4       5  // 시작값이 0으로 했으면 =을 안붙인다!! 
			System.out.println("온풍기 " + i);
			i++;
		}
		
		// 1 ~ 5 => 5번
		i = 1;
		while (i <= 5) {    // 1 2 3 4 5    6거짓~   // 시작값이 0이 아니여서 = 붙인다.! 
			System.out.println("칠판 " + i);
			i++;
		}
		
		
		// 5 ~ 0 => 6번
		i = 5;
		while (i >= 0) {  // 5 4 3 2 1 0     -1 거짓~
			System.out.println("마이크 " + i);
			i--;
		}
		
		
		// 1+2+3+4+5+6+7+8+9+10 합계
		i = 1;
		int sum = 0;   // sum변수는 무조건 while문 밖에서 해야한다!!
		while (i <= 10) {
			sum = sum + i;
			i++;		
		} 
		System.out.println(sum);
		
	}

}
