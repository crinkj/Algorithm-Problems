package inflearn_Algorithm;

import java.util.Scanner;

public class problem10 {
	public int[] solution(String s, char t) {
		int[] answer = new int[s.length()];
		int p=1000;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==t) {
				p=0;
				answer[i]=p;
			}
			else {
				p++;
				answer[i]=p;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		problem10 prob = new problem10();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		for(int x  : prob.solution(str, c)) {
			System.out.println(x + " ");
		}

	}
}
