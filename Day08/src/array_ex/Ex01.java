package array_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 배열(Array) : 같은 자료형의 묶음 
		
		// 배열의 초기화(1)
		int[] scores = {89, 100, 99, 91, 92};
		System.out.println("첫번째 값:"+ scores[0]);
		System.out.println("두번째 값:" + scores[1]);
		System.out.println("세번째 값:" + scores[2]);
		System.out.println("네번째 값:" + scores[3]);
		System.out.println("다섯번째 값:" + scores[4]);
		
		
		// 배열의 초기화(2)
		int[] numbers = new int[3];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		// 배열의 값 변경
	    numbers[0] = 1000;
	    System.out.println(numbers[0]);
	    System.out.println(numbers);		// hash 값 - 변수/객체의 주소
	    
	    
	    // 반복문을 이용한 배열 값 출력   // 반복문을 이용해서 모두 볼려면 이렇게 해랐!
	    for (int i = 0; i < 3; i++) { // 0 1 2 
	    	System.out.println(numbers[i]);
	    }
		
	    
	    for (int i = 0; i < scores.length; i++)	{ 	// 0 1 2 3 4   
	    	// index 값은 무조건 0부터 시작!!! 
	    	// i <= scores.length 쓰면 오류!!! = 쓰면 안됨!!!!
	    		System.out.println(scores[i]);
	    }
	    
	    
	    // 합계 구하기
	    int sum = 0;
	    for (int i = 0; i < scores.length; i++) {  // 0 1 2 3 4
	    	sum += scores[i];
	    }
	    System.out.println("합계는 " + sum);
	}

}
