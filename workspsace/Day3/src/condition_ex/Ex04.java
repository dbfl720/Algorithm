package condition_ex;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("걸은 수와 몸무게를 입력하세요:");
		int walk = scan.nextInt();
		int weight = scan.nextInt();
		
		// 만약에 걸은수가 10000보를 초과하면서 몸무게가 65키로 이하이면 "떡볶이"
		if (walk > 10000 && weight <= 65) {
			System.out.println("둘 다 만족하니 떡볶이");
		}
		
		
		// 만약에 걸은수가 10000보를 초과하거나 몸무게가 65키로 이하이면 "떡볶이"
		if (walk > 10000 || weight <= 65) {
			System.out.println("하나라도 만족하니 떡볶이 먹자");
		}
	}

}
