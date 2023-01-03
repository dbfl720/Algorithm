package array_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		// 배열 기본 사용법
		
		
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		// 1.
		numbers[3] = 6;   // 배열의 4번째 값은 사람이 보는 4번째 즉 숫자 4인 부분임.
	
		
		
		//2. 
//		for (int i = 0; i < numbers.length; i++) {   // 0 ~ 7
//			System.out.print(numbers[i]+ " ");
//		}
//		System.out.println();
		
		
		//3.  7 ~ 0 
//		for (int i = numbers.length; i >= 0; i--) {  // numbers.length = 사람이 보이는 수 8 임..
//			System.out.print(numbers[i]+ " ");		 // index는 칸번호임..
//		}
		
		
		//4. 홀수번째 인덱스 출력
//		for (int i = 0; i < numbers.length; i++) {  // index 칸 번호와, numbers.length는 다름
//			if (i % 2 != 0) {
//				System.out.print(numbers[i]+ " ");
//			}
//		}
//		System.out.println();
//		
//		for (int i = 1; i < numbers.length; i +=2 ) {// 1 3 5 7 
//			System.out.print(numbers[i] + " ");
//		}
//		
//		System.out.println();
//		
		
		//5.
//		for (int i = 0; i < numbers.length; i++) {
//			if(numbers[i] == 2)
//			System.out.println("2가 들어 있는 index는 " + i);
//		}
		
		
		// 6. 최대값
//		int max = numbers[0];  // 3 
//		for (int i = 1; i < numbers.length; i++) {  // 1 ~ 7 
//			if (max < numbers[i]) {
//				max = numbers[i];
//			}
//		}
//		System.out.println("가장 큰 값은 " + max);
//		
		
		
		// 7. 최소값
//		int min = numbers[0];  // 3
//		int minIndex = 0;
//		for (int i = 1; i < numbers.length; i++) {  // 1 ~ 7 
//			// int가 1인 이유 : number에서 이미 index 0부터 시작해서 검사를 했기 때문에, 굳이 할 필요 없어서 index 1부터 시작! 
//			if (min > numbers[i]) {
//				min = numbers[i];
//				minIndex = i;  // 최종적 마지막 i를 가지고 있음.
//			} 
//		} System.out.println("최소값의 인덱스는 " + minIndex);
//		
		
		
		
		//8.
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {  // 0 ~ 7
			sum += numbers[i];
						
		}
		double average = (double)sum / numbers.length;  // 평균 구하는 식은 for문에 잇으면 안됨.
		System.out.println("평균은 " + average);
	}

}
