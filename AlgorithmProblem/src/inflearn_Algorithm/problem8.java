package inflearn_Algorithm;

import java.util.Scanner;

public class problem8 {
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
