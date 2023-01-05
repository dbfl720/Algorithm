package two_d_array_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 2차원 배열
		// 바깥쪽: 행, 안쪽: 열
		
		int[][] scores = {
				{89, 100, 61},
				{25, 77, 90}, 
				{88, 60, 62},
				{71, 75, 79},
				{100, 99, 98}
		};
		
		System.out.println("3번째 학생의 두번째 점수는 " + scores[2][1]);   // 60
		System.out.println("2번째 학생의 첫번째 점수는 " + scores[1][0]);   // 25
		System.out.println("5번째 학생의 세번째 점수는 " + scores[4][2]);   // 98
		
		
		// 반복문으로 2차원 배열 값 출력
		for (int i = 0; i < scores.length ; i++) {	 // 행, 학생수
			for(int j = 0; j < scores[i].length; j++) {   // 열, 과목수 
				System.out.println((i+1) + "번째 학생의 " +
						(j +1) + "번째 점수는 " + scores[i][j]);
				
			}
		}
		
		
		
		// 학생들의 평균 점수 구하기   // ** 코드의 위치가 되게 중요 ! 언제 초기화 등등... 
		for (int i = 0; i < scores.length; i++) {   // 학생수  0 ~ 4 
			int sum = 0;   // 한 학생당 점수 총합,  // 학생당 합 구해야하 하므로. 합을 초기화 해야해서 여기 반복문 안에 씀.. 
			for (int j = 0; j < scores[i].length; j++) {  // 과목수 0 ~ 2
				// 학생 당 점수들 
				sum += scores[i][j];
			}
			double average = (double)sum / scores[i].length;
			System.out.println((i + 1) + "번째 학생의 평균 점수는 " + average);
		}
		
	}

}
