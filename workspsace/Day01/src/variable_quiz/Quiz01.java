package variable_quiz;

public class Quiz01 {

	public static void main(String[] args) {
//		이름: 신보람 나이: 25
//
//		3 + 5 = 8
//		3 - 5 = -2
//
//		7 X 1 = 7
//		7 X 2 = 14
//		7 X 3 = 21

		
		System.out.println("이름: 홍유리 나이: 12");
		System.out.println();
		
		int number = 3;
		int number2 = 5;
		int sum = number + number2;
		
		System.out.println("3 + 5 =" + sum);
		System.out.println("3 - 5 =" + ((number - number2)) );
		System.out.println();
		
		int number3 = 7;
		System.out.println("7 x 1 = " + number3);
		System.out.println("7 x 2 = " + number3 * 2);
		System.out.println("7 x 3 = " + number3 * 3);
	}

}
