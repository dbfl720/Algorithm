package Chapter5;

import java.util.Scanner;

public class ex5_7 {

		// 하노이의 탑
		static void move(int no, int x, int y) {
			if(no > 1) 
				move(no - 1, x , 6 - x - y);  // 이 프로그램은기둥 번호를 정수 1, 2,3 으로 나타냄. 기둥 번호의 합이 6이므로 중간 기둥 : 6 - x - y 이다.
			System.out.printf("원반[%d]를 %d번 기둥에서 %d번 기둥으로 옮김\n", no, x , y);
			
			if(no > 1)
				move(no - 1, 6 - x - y, y);
		}

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("하노이의 탑");
			System.out.print("원반의 개수: ");
			int n = scan.nextInt();
			
			move(n,1,3);
	}

}
