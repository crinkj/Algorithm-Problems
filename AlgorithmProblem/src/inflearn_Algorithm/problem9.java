package inflearn_Algorithm;

import java.util.Scanner;

public class problem9 {
//	문제: 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
//		만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
//		추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.

	public int solution(String s) {
		String answer = "";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) answer +=x; // Character.isDigt(x) 숫자인지 아닌지 확인해주는 메소드
		}
		return Integer.parseInt(answer);
	}
	public static void main(String[] args) {
		problem9 prob = new problem9();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(prob.solution(str));
	}
}
