package nested_loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		/**
		 * 중첩 반복문 : 반복문 안에 반복문
		 *  - 바깥 반복문: 천천히 돈다. (ex - 세트, 행)
		 *  - 안쪽 반복문: 빨리 돈다. (ex - 횟수,열)
		 */

		// 스쿼트 10회
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("스쿼트 " + i + "회");
//		}
		
		
		// 스쿼트 3세트 10회
		for (int i = 1; i <= 3; i++) {  // i: 1 2 3 세트
			for (int j = 1; j <= 10; j++) { // j: 1~ 10 횟수
				System.out.println("스쿼트 " + i + "세트째, " + j + "회");
			}
		}
//		}️
		
		
		// 한줄짜리 별 5개 찍기
		// ⭐⭐⭐⭐⭐	
		for (int i = 0; i < 5; i++) {
			System.out.print("⭐");
		}
		System.out.println("\n");
		
		// 한줄짜리 별 5개 3행 찍기
//		⭐⭐⭐⭐⭐
//		⭐⭐⭐⭐⭐
//		⭐⭐⭐⭐⭐
		for (int i = 0; i < 3; i++) { // 초기화식이 0이면 조건에 = 안 붙인다!!    // i : 행
			for (int j = 0; j < 5; j++) {  // j : 열 (별의 개수)
				System.out.print("⭐");
			}
			System.out.println();  //  행이 끝나는 시점에 줄바 !!
		}
		
//		디버깅(debugging)
	  // f6  - 점을 찍은 부분부터 수행되는 것
	  // f8 -  점이 찍혀있는 곳으로 이동되는 것
		
		
	}

}
