package Chapter3;
//아이디를 부여하는 클래스

class Id {
	private static int counter = 0; // 아이디를 몇개 부여했는지 저장
	private int id; // 아이디
	
	// 생성자
	public Id() {id = ++counter; } // 생성자
	
	// counter를 반환하는 클래스 메서드
	public static int getCounter() { return counter;}  // 클래스 메서드
	
	// 아이디를 반환하는 인스턴스 메서드.
	public int getId() {return id;}
}

public class ex3c_1 {

	public static void main(String[] args) {
		Id a = new Id();  // 아이디1
		Id b = new Id(); // 아이디2
		
		
		System.out.println("a의 아이디: "+ a.getId()); //인스턴스 메서드 호출 : 변수이름.메서드이름 ()
		System.out.println("b의 아이디: " + b.getId());
		
		System.out.println("부여한 아이디의 개수: " + Id.getCounter());  // 클래스 메서드 호출 : 클래스이름.메서드 이름 ()
		

	}

}
