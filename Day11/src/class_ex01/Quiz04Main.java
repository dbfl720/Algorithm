package class_ex01;

public class Quiz04Main {

	public static void main(String[] args) {
		// TODO: stu1 객체 생성 및 값 넣기 구현하기
		
		// 객체 생성.
		StudentInfo stu1 = new StudentInfo();
		
		// 필드에 값 세팅하기
		stu1.name = "유재석";
		stu1.age = 21;
		stu1.className = "java";
		stu1.phoneNumber = "01023453223";
		
		
        // 결과값 출력
        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println(stu1.className);
        System.out.println(stu1.phoneNumber);
        stu1.isAdult();

        System.out.println();
        
        

        // TODO: stu2 객체 생성 및 값 넣기 구현하기
        
        // 객체 생성.
        StudentInfo stu2 = new StudentInfo();
        
        
        // 필드에 값 세팅하기
        stu2.name = "이효리";
        stu2.age = 17;
        stu2.className = "java";
        stu2.phoneNumber = "01096482734";

        // 결과값 출력
        System.out.println(stu2.name);
        System.out.println(stu2.age);
        System.out.println(stu2.className);
        System.out.println(stu2.phoneNumber);
        stu2.isAdult();

	} // main
} // class
