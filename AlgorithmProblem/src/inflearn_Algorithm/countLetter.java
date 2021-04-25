package inflearn_Algorithm;

import java.util.Scanner;

public class countLetter {
 // 문제: 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.

//	//문자열 바꾸기 방법1
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String word = in.next(); // 단어 받기
		char letter = in.next().charAt(0); // 알파벳 받기
		int count = 0; // 단어가 알파벳 포함시 카운트

		word = word.toUpperCase(); // 단어 대문자로 바꾸기
		letter = Character.toUpperCase(letter); // 알파벳 대문자로 바꾸기

		for(int i=0; i<word.length(); i++) { // 문장 알파벳 반복문돌리기
			if(word.charAt(i) == letter) {
				count++;    //문자가 알파벳 포함시 카운트
			}
		}
		System.out.println(count);

	}
	//문자열 바꾸기 방법2

	public int solution(String word, char letter) {
		int count = 0;
		word = word.toUpperCase();
		letter = Character.toUpperCase(letter);

//    1) 인덱스로 접근하는방법
//		for(int i=0; i<word.length(); i++) {
//			if( word.charAt(i) == letter) {
//				count++;
//			}
//		}

//	  2) for Each로 컬렉션 프레임워크를 사용해서 반복 돌리기
		for(char x: word.toCharArray()) {
			if(x == letter) {
				count++;
			}
		}

		return count;
	}

	public static void main2(String[] args) {
		countLetter iA = new countLetter();
		Scanner sc= new Scanner(System.in);

		String word = sc.nextLine();
		char letter = sc.next().charAt(0);

		System.out.println(iA.solution(word, letter));
	}
}