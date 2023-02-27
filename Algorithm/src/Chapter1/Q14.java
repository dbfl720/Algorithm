package Chapter1;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// 직각이등변삼각형
		Scanner scan = new Scanner(System.in);
		System.out.print("몇 단 삼각형을 원하십니까?");
		int n = scan.nextInt();
		
		// 왼쪽 아래가 직각
		for (int i = 1; i <= n; i++) { // 행 1 
			for (int j = 1; j <= i; j++) { // 열 12345
				System.out.print('*');
			} System.out.println();
		}
		
		
		
		// 왼쪽 위가 직각
	     for (int i = 1; i <= n; i++) { // 행 1
	    	 for (int j = n; j >= i; j--) {  // 열 54321
	    		 System.out.print('*');
	    	 } System.out.println();
	     }
	     
	     
		
		
	     // 오른쪽 위가 직각
	     for (int i = 1; i <= n; i++) { // 행 1 
				for (int j = 1; j <= i; j++) { // 열 12345
					System.out.print(' ');
				} 
						
				for (int k = n; k >= i; k--) { // 열 
					System.out.print('*');
				} System.out.println();
				
			}
	     
	     
	     
	   // 오른쪽 아래가 직각
	     for (int i = 1; i <= n; i++) { // 행 1
	    	 for (int j = n; j >= i; j--) {  // 열 54321
	    		 System.out.print(' ');
	    	 } 
	    	 for (int k = 1; k <= i; k++) { // 열 1
	    		 System.out.print('*');
	    	 } System.out.println();
	     }
	     
		
		
		
		// Q15
		for (int i = 1; i <= n; i++) { // 행 12345
	    	 for (int j = n; j >= i; j--) {  // 열 54321
	    		 System.out.print(' ');
	    	 } 
	    	 for (int k = 1; k <= (i * 2) -1; k++) { // 열 13579
	    		 System.out.print('*');
	    	 } System.out.println();
	     }
	  
	     
		
		
		// 16.
		for (int i = 1; i <= n; i++) { // 행 12345
	    	 for (int j = n; j >= i; j--) {  // 열 54321
	    		 System.out.print(' ');
	    	 } 
	    	 for (int k = 1; k <= (i * 2) -1; k++) { // 열 13579
	    		 System.out.print(i);
	    	 } System.out.println();
	     }
		
		
	     
	} // main

}


//---------
//<결과>
//몇 단 삼각형을 원하십니까?4
//*
//**
//***
//****
//****
//***
//**
//*
// ****
//  ***
//   **
//    *
//    *
//   **
//  ***
// ****
//    *
//   ***
//  *****
// *******
//    1
//   222
//  33333
// 4444444
