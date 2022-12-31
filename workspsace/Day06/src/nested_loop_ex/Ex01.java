package nested_loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		/**
		 * 중첩 반복문 : 반복문 안에 반복문
		 *  - 바깥 반복문: 천천히 돈다. (세트)   - 
		 *  - 안쪽 반복문: 빨리 돈다. (스쿼트 횟수)
		 *  
		 */
		
		
		// 스쿼트 10회
		for (int i = 1; i <= 10; i++) {	  // 1 ~ 10
			System.out.println("스쿼트 " + i + "회");
		}

		
		// 스쿼트 3세트 10회
		for (int i = 1; i <= 3; i++) { // 세트 1 2 3
			for (int j = 1; j <= 10; j++) {  // 횟수 1 2 3 4 5 6 7 8 ~ 10
				System.out.println("스쿼트 " + i + "세트째," + j + "회");
			}
			
		}
		
		
		// 한줄짜리 별 5개 찍기
		// *****
		for (int i = 0; i < 5; i++) {    // 0 1 2 3 4 
			System.out.print("*");
			
		}
		System.out.println("\n");
		
		
		// 한줄짜리 별 5개 3행 찍기
		// *****
		// *****
		// *****
		for (int i = 0; i < 3; i++) {  //행  0  1  2
			for (int j = 0; j < 5; j++ ) { // 열(별) 0 1 2 3 4 
				System.out.print("*");   // f6은 한줄씩 실행 (천천히), f8은 브레이크포인트 걸린대만 실행.(빨리 넘길때)
			}
			System.out.println();  // 한 행이 끝나는 시점에 줄바꿈!!!!!
		}
		
		
		
		
		
		// 디버깅 : 오류 잡는 것. 긴 코드일 때는 디버깅으로 잡아야함!!  실제 수행되는 부분에 해야함. !!!
				 // 브레이크문 찍고 디버깅 실행해야함!! 
		
	}

}
