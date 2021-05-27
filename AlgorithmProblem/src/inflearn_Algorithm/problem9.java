package inflearn_Algorithm;

import java.util.Scanner;

public class problem9 {
	public int solution(String s) {
		String answer = "";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) answer +=x;
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
