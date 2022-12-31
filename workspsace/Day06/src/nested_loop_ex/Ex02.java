package nested_loop_ex;

public class Ex02 {

	public static void main(String[] args) {
		
		
		// 1 ~ 6,  1~ 6
		
//		#1
//		for (int i = 1; i <= 6; i++) {   // 1 ~ 6 행 세트
//			for (int j = 1; j <= 6; j++) {   // 1 ~ 6 열 횟수
//				System.out.print("(" + i + ", " + j + ")");
//				
//			}
//			System.out.println();
//		} 

			
		
//		#2
		// 단수 : 천천히  2 ~ 9
		// 곱해지는 수 : 빠르게  1 ~ 9
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " X " + j + " = " + (i*j));
//			}
//		}
			

		
		
//		#3
		
//	   중복 반복문 문제를 풀때는 1세트 당, 스쿼트 몇회를 (증가,감소) 하는지 생각하며 문제 풀기!!
		
//		for (int i = 1; i <= 5; i++) {      //  i가 1부터 ~ 5번까지 증가하며 행을 만듬.     
//			for (int j = 1; j <= i; j++) {    //  j가 1부터 ~ i개수까지 증가하며 별을 만듬.   
//											
//							
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		
		
//		#4
//		for (int i = 1; i <= 5; i++) {         //  i가 1부터 5까지 증가하며 행을 만듬.
//			for (int j = 5; j >=i; j--) {    // j가 5부터 i개수까지 감소하며 별을 만듬.
//											 
//				System.out.print("*");
//			}
//			System.out.println();
//		}

	
		
		
		
//		#5
	    for (int i = 1; i <= 5; i++) { 		//  i가 1부터 ~ 5까지 증가하며 행을 만듬.
	    
	    	for (int k = 5; k >= i; k--) {    //   k가 5부터 ~ i와 같아질 때까지 감소하며 열(공백)을 만듬.
	    		                              // for문 조건식 - k가 i보다 같거나 '큰' 이유 : i의 초기화가 1인데, i가 더 같거나 크다고 하면 k는 무한루프에 빠진다..? 
    		
	    		System.out.print(" ");		  // 공백 만드는 코드.
	    	}
	    	    	                                                 
		for (int j = 1; j <= (i*2)-1; j++) {    // j가 1부터 ~ j와 같아질 때까지 증가하며 열(별)을 만듬.   // j++은 그림에 별이 한개씩 추가된다고 생각하면 됨.       	 
				System.out.print("*");			 // for문 조건식 -  i행  : 1 2 3 4 5 
			}									 //               j열  : 1 3 5 7 9    -> i에 2를 곱한 후 -1을 뺀 거와 같다.  (i*2)-1
			System.out.println();				 //            - j가 i보다 같거나 '작은' 이유 : 마지막 행 i가 5일 때, j는 1~9까지 별을 만들 수 있고, 10부터는 거짓이라서 종료됨.
			
			
		}
	    
					
	}

}
