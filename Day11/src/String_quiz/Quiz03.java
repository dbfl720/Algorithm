package String_quiz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz03 {

	public static void main(String[] args) {
		// 1. 문자열 검색 ?????????
//		파일이름이 저장된 문자열 배열에서 jpg 파일이 몇개인지 출력하세요.
//		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//		출력 예시
//
//		jpg 파일 개수 : 3

//		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//		
//		int count = 0;
//		for(int i = 0; i < files.length; i++) {
//			if (files[i].endsWith(i) = "jpg") {
//				count++;
//		}
//		
//	}

	  // 1. 선생님
//		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//		// [ ] 있으면 배열이라는 뜻.
//		int count = 0;
//		for (int i = 0; i < files.length; i++) {
//			if (files[i].endsWith("jpg"))  {    // "cat.jpg"
//				count++;
//			
//			}	
//	}
//		System.out.println("jpg 파일 개수 : " + count);
		
		
		
		
		
		
		
		
		
		// 2.
//		Scanner scan = new Scanner (System.in);
//		
//		System.out.print("1. 승리를 영어로 입력하세요 : ");
//		String word1 = scan.next();
//		System.out.print("2. 사랑을 영어로 입력하세요 : ");
//		String word2 = scan.next();
//		System.out.print("3. 컴퓨터를 영어로 입력하세요 : ");
//		String word3 = scan.next();
//		System.out.print("4. 노트북을 영어로 입력하세요 : ");
//		String word4 = scan.next();
//		
//		
//		
//
//		String [] words = {"victory", "love", "computer", "notebook"}; 
//		
//		
//		int count = 0;
//		for (int i = 0; i < words.length; i++) {
//			if(word1.equals(words[i])) {
//				count += 25;
//		}
//			if(word2.equals(words[i])) {
//				count += 25;
//		}	if(word3.equals(words[i])) {
//				count += 25;
//		}	if(word4.equals(words[i])) {
//				count += 25;
//		}
//				
//		}
//		System.out.println("점수는 " + count + "점 입니다.");
	

				
							
		
		// 2. 선생님
//		Scanner scan = new Scanner(System.in);
//
//	    String[] quizWord = {"승리", "사랑", "컴퓨터", "노트북"};
//	    String[] answerWord = {"victory", "love", "computer", "notebook"};
//	    int score = 0;
//	    for (int i = 0; i < quizWord.length; i++) { // 0 ~ 3 => 4
//	    	System.out.print((i + 1) + "." + quizWord[i] + "를 영어로 입력하세요:");
//	    	 String answer = scan.next();
//	    	 if (answer.equals(answerWord[i])) {
//	    		 score += 25;
//	    	 }
//	    }
//	    
//	    System.out.println("점수 " + score + "점 입니다.");

		
		
		
		
		
		// 3.  ??? ??
//		 동명이인 수 구하기
//		 String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
//		 동명이인 종류: 송강호, 이민정, 이정재 => 3
//		
//		
		 String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
		 String[] names = memberStr.split(":");		
		 List <String> list = Arrays.asList(names);  // List 준비
		 List <String> newList = list.stream().distinct().collect(Collectors.toList());  // 중복 제거
		 System.out.println(newList);
		 
	
		 String valueA = newList.get(1).toString();
		 String valueB = newList.get(3).toString();
		 String valueC = newList.get(4).toString();
		 
		 String a = valueA + valueB + valueC;
	
		 System.out.println(a);
		 
		 
		 

		 
		 
		 
//		 		
//		  int count = 0;
//		  for (int i = 0; i < newList.length; i++) {
//		  if (newList.equals("송강호")){
//			count++;
//		  }	if (newList.equals("이민정")){
//			count++;	
//		  }   if (newList.equals("이정재")){
//		    count++;	
//		  }
//		  }
//		 System.out.println(count); 
//		 
		 
		

		 
		  // 1. 선생님
//			String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//			// [ ] 있으면 배열이라는 뜻.
//			int count = 0;
//			for (int i = 0; i < files.length; i++) {
//				if (files[i].endsWith("jpg"))  {    // "cat.jpg"
//					count++;
//				
//				}	
//		}
//			System.out.println("jpg 파일 개수 : " + count);
		 
		 
		 
		 
		 
		 
		 
		 // 3..... ?
//		  String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
//		  String[] members = memberStr.split(":");
//		  int count = 0;
//		  for(int i = 0; i < members.length; i++) {
//			  String target = members[i];
//			  for(int j = i +1; j < members.length; j++) {
//				  if(target.equals(members[j])) {
//					  count++;
//				  }
//			  }
//		  } 
//		  System.out.println(count);

			
			
			
		 
		
		// 3. 동명이인 수 구하기
//		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
//		동명이인 종류: 송강호, 이민정, 이정재 => 3
//		
//		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
//		
//		int count = 0;
//		for(int i = 0; i < memberStr.length(); i++) {
//			if(memberStr.equals("송강호, 이민정, 이정재");
//			count++;
//		}
		
		
		
		
	}  // main
 }  // class


