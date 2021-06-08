package inflearn_Algorithm;

import java.util.Scanner;

public class problem10 {

// 문제: 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		problem10 prob = new problem10();
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char letter = sc.next().charAt(0);
		System.out.println(prob.solution(word,letter));

	}

	public String solution(String word, char letter) {
		String answer = "";
		char[] arr = new char[word.length()];
		arr = word.toCharArray();

		return answer;
	}


}
