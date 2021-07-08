package inflearn_Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class problem37 {
	/*
	 * 문제: 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();

		for(Character x: solution(word)) {
			System.out.print(x);
		}
	}

	public static ArrayList<Character> solution(String word) {

		ArrayList<Character> answer = new ArrayList<>();

		int count = 0;
		for(int i=0;i<word.length();i++) {

			if(word.charAt(i) == '(') {
				count++;
			}else if(word.charAt(i) == ')') {
				count--;
			}
			else if(count == 0) {
				answer.add(word.charAt(i));
			}
		}

		return answer;

	}

}
