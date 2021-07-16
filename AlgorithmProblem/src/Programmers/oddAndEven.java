package Programmers;

public class oddAndEven {
/*
 * https://programmers.co.kr/learn/courses/30/lessons/12937
 */
	public static void main(String[] args) {

		System.out.println(solution(8));
	}

	public static String solution(int num) {

		String answer = "";
		if(num % 2 == 1) {
			answer = "Odd";
		}else {
			answer ="Even";
		}
		return answer;
	}
}
