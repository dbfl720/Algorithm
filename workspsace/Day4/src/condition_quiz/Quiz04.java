package condition_quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
	//	#1
	//	두 점수를 입력 받고, 평균이 70점 이상이면 합격 그렇지 않으면 불합격을 출력하세요.
//		System.out.println("점수를 입력하세요:");
//		int n1 = scan.nextInt();
//		System.out.println("점수를 입력하세요:");
//		int n2 = scan.nextInt();
//		
//		double average = (double)(n1 + n2) / (double)2;   //나누기 있으면 double형을 해야함.
//		
//		if (average >= 70) {
//			System.out.print("합격");
//		} else {
//			System.out.print("불합격");
//		}
//		
		
		
		
	//	#2  max 알고리즘     ** else if 는 둘 중 하나만 수행하게 된다. 그래서 if로 하면 다 수행하게 됨. 
	//세 개의 정수를 입력 받아서 가장 큰 값을 출력하세요.
//		System.out.print("한 개의 수를 입력하세요:");
//		int a = scan.nextInt();  //3
//		System.out.print("한 개의 수를 입력하세요:");
//		int b = scan.nextInt();   
//		System.out.print("한 개의 수를 입력하세요:");
//		int c = scan.nextInt();
//		int max = a;
//		if (max < b) {
//			max = b;			
//		} 
//		if (max < c) {
//			max = c;
//		}
//		System.out.println(max);
//	}
//		
		
		
		
		
		
		
//		#2 나의 풀이
		System.out.print("세 개의 수를 입력하세요:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int max = a;
		
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		} System.out.println(max);
		
	}
}

		
		
		
		
		
		
		
		
		
	
		
		
//		#3
//		점수 두 개를 입력 받고 합격 여부를 출력하세요.
//		System.out.print("점수1:");
//		int score1 = scan.nextInt();
//		System.out.print("점수2:");
//		int score2 = scan.nextInt();
//		double average = (double)(score1 + score2) / 2;
//		
		
		// 선생님 풀이
//		if (average >= 60) {   // 합격이거나 과락
//			if (score1 <= 50 || score2 <= 50) {  // 과락
//				System.out.println("과락");
//			} else {     // 과로를 잘 봐라.   
//				System.out.println("합격");
//			}			   // 과로를 잘 보고 해라.!!!!!! 중첩 if문이라서 과로 잘 봐야.
//		} else {   // 불합격
//			System.out.println("불합격");
//		}
//		
		
		
		
		
//		나의 풀이.
//		if (average < 60) {
//			if (score1 <= 50 || score2 <= 50) {
//				System.out.println("과락");
//			};
//			System.out.println("불합격");
//		} else if (average >= 60) {
//			System.out.println("합격");
//		}
//		
		
		
		
		
//		#5
//		4개의 윷 상태가 입력되면 도, 개, 걸, 윷, 모를 출력하는 프로그램을 작성하시오.
//		윷의 상태가 0이면 뒤집어 지지 않은 상태, 1이면 뒤집어진 상태를 의미한다.
		
//		System.out.print("윷 상태를 입력하세요:");
//		int n1 = scan.nextInt();
//		int n2 = scan.nextInt();
//		int n3 = scan.nextInt();
//		int n4 = scan.nextInt();
//		int sum = n1 + n2 + n3 + n4;   	 	
//		
//		
//		switch (sum) {
//		case 0:
//			System.out.println("모");
//			break;
//		case 1:
//			System.out.println("도");
//			break;
//		case 2:
//			System.out.println("개");
//			break;
//		case 3:
//			System.out.println("걸");
//			break;
//		case 4:
//			System.out.println("윷");
//			break;
//		}
//		
		
		
		
		
		
		
		
		
//		
//		if (sum == 0) {
//			System.out.println("모");
//		} else if (sum == 1) {
//			System.out.println("도");
//		} else if (sum == 2) {
//			System.out.println("개");
//		} else if (sum == 3) {
//			System.out.println("걸");
//		} else if (sum == 4 ) {
//			System.out.println("윳");
//		} else {
//			System.out.println("숫자를 다시 입력하세요.");
//			
//		}
			
		
		
		//#4.
		System.out.print("연도 :");
		int year = scan.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
				

	}
}



//		% 4 = 2000, 2004, 2008
//		% 100 = 2000, 2100, 2200
//		% 400 = 2000, 2400, 2800

//		if (year % 4 == 0) {
//			if (year % 400 != 0 && year % 100 == 0) {
//				System.out.println("평년");
//			} else {
//				System.out.println("윤년");
//			}
//		}  else {
//			System.out.println("평년");
//		}
//		
//	}
//}

	
		