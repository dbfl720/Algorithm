package Chapter2;

public class Ex2_9 {

	public static void main(String[] args) {
		// 1000이하의 소수를 나열
		int counter = 0;  // 곲셈과 나눗셈의 횟수
		int ptr = 0;  // 찾은 소수의 개수
		int[] prime = new int[500];  // 소수를 저장하는 배열
		
		prime[ptr++] = 2;  // 2는 소수임
		prime[ptr++] = 3;  // 3은 소수임
		
		for(int n = 5; n <= 1000; n +=2) { // 조사 대상은 홀수만..
			boolean flag = false; 
			
			for(int i =1; prime[i] * prime[i] <= n; i++) {
				counter += 2;  //곱셉과 나눗셈의 수행 횟수 때문에 +2
				if(n% prime[i] == 0) {  // 나누어 떨어지면 소수가 아ㅣㄴㅁ
					flag= true; 
					break;
				}
			}
			
			if(!flag) { // 마지막까지 나누어 떨어지지 않음.
				prime[ptr++] = n;    // 소수로 배열에 저장.
				counter++;
			}
		}
		
		
		for(int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
			System.out.println("곱셉과 나눗셈을 수행한 횟수: "+ counter);
		}

	}

}
