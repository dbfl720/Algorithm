package Chapter1;

import java.util.Scanner;

public class Ex1_1 {

	public static void main(String[] args) {
		// 1-1 알고리즘이란?
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 최대값을 구합니다.");
	    System.out.print("a의 값: ");
	    int a = stdIn.nextInt();
	    System.out.print("b의 값: ");
	    int b = stdIn.nextInt();
	    System.out.print("c의 값: ");
	    int c = stdIn.nextInt();
	    
	    int max = a;
	    if(b > max) max = b;
	    if(c > max) max = c;
	    
	    System.out.println("최대값은 " + max + "입니다.");
		

	}

}
