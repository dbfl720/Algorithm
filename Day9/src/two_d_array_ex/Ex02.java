package two_d_array_ex;

public class Ex02 {

	public static void main(String[] args) {
		// 1  학생별 평균 구하기
		
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
//
//		
//		for (int i = 0; i < scores.length; i++) {  // 학생수 0 ~ 4
//			int sum = 0; 
//			for (int j = 0; j < scores[i].length; j++) {  // 과목수 10 
//				// 학생 당 점수들
//				sum += scores[i][j];
//				
//			}
//			double average = (double)sum / scores[i].length;
//			System.out.println((i + 1) + "번째 학생의 평균 점수는 " + average);
//		}
//		
		
		
		
		// 2.학생별 최고점 구하기.   ???   출력위치, 변수의 위치.
//		int max = 0;
//		for (int i = 0; i < scores.length; i++) {  // 학생수    0 ~ 4 
//			for (int j = 1; j < scores[i].length; j++) {	// 과목수    1 ~ 10
//				// 학생 당 점수들
//				if(max < scores[i][j]) { 
//					max = scores[i][j];
//					
//				}
//				
//			}
//			System.out.println((i+1) + "번째 학생의 최고점은 " + max);
//		}
		

			
		
		
		
		
		//3. 평균 최고점 구하기 
//		평균이 가장 높은 학생의 평균점수와 몇 번째 학생인지 출력하세요.
		
//		double maxAverage = 0;
//		int maxI = 0;
//		for (int i = 0; i < scores.length; i++) {  // 학생수 0 ~ 4
//			int sum = 0; 
//			for (int j = 0; j < scores[i].length; j++) {  // 과목수 10 
//			// 학생 당 점수들
//			sum += scores[i][j];
//			
//			}		
//			double average = (double)sum / scores[i].length;	
//			
//			if(average > maxAverage) {
//				maxAverage = average;
//				maxI = i;
//			}
//			
//		}
//		System.out.println("평균이 가장 높은 학생은 " + (maxI + 1) + "번째 학생이고, " + "최고 점수 : " + maxAverage);
//		
	
		
		
		
		// 4. 특정 과목 최고점   ??? 
//		4번째 과목의 최고 성적의 학생이 몇 번째 학생인지와 점수를 출력하세요.
//		int maxscore = 0;
//		int maxI = 0;
//		for (int i = 0; i < scores.length; i++) {  // 학생수    0 ~ 4 
//			for (int j = 0; j < scores[3].length; j++) {	// 과목수    1 ~ 10
//				// 학생 당 점수들
//				if(maxscore < scores[i][j]) { 
//					maxscore = scores[i][j];
//					maxI = i;
//				}
//				
//			}
//		
//		}
//		System.out.println("4번째 과목의 최고 성직자는 " + (maxI + 1) + "번째 학생이고, " + "점수는 " + maxscore);
//		
//		
		
		
		
		
		// 5. ?????? 
		double maxAverage = 0;
		int maxI = 0;
		for (int i = 0; i < scores.length; i++) {  // 학생수 0 ~ 4
			int sum = 0; 
			for (int j = 2; j < 7; j++) {  // 과목수 10 
			// 학생 당 점수들
			sum += scores[i][j];
			
			}		
			double average = (double)sum / scores[i].length;	
			
			if(average > maxAverage) {
				maxAverage = average;
				maxI = i;
			}
			
		}
		System.out.println("3~7 과목 평균이 가장 높은 학생은 " + (maxI + 1) + "번째 학생이고, " + "평균은 " + maxAverage + "입니다.");
		
		
		
		

		
	}

}
