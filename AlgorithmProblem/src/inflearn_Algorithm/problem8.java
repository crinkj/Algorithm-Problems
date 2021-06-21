package inflearn_Algorithm;

import java.util.Scanner;

public class problem8 {

//	문제: 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
//		문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
//		단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
//		알파벳 이외의 문자들의 무시합니다.

	public static void main(String[] args) {
		problem8 prob = new problem8();
		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();
		System.out.println(prob.solution(word));
	}
	public String solution(String word) {
		String answer = "NO";
		word = word.toLowerCase().replaceAll("[^a-z]", ""); // 소문자 a부터 z가아니면 ""처리 해라.
		String reverseWord = new StringBuilder(word).reverse().toString();

		if(word.equals(reverseWord)) answer = "YES";

		return answer;
	}
}
