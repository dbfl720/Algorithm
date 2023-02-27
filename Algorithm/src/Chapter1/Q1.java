package Chapter1;

public class Q1 {

	public static void main(String[] args) {
		//네 값의 최대값을 구하는 max4 메서드를 작성하세요. 작성한 메서드를 테스트하기 위해 main 메서드를
		// 포함한 프로그램을 작성해야 합니다.
		
		System.out.println("max4(4,3,2,1)" + max4(4,3,2,1));

	}






 static int max4(int a, int b, int c, int d) {
	 int max = a;
	 if(b > max) 
		 max = b;
	 if(c > max) 
		 max = c;
	 if(d > max) 
		 max = d;
		 
	
	return max;
 }
}
