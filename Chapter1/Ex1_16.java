package Chapter1;

public class Ex1_16 {

	public static void main(String[] args) {
		// 다중 루프 다루기
		
		System.out.print("---구구단 곱셈표------");
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
				System.out.println();
			}
		}

	}

}
