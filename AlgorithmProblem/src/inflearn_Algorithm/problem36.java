package inflearn_Algorithm;

import java.util.Scanner;

public class problem36 {

	/*
	 * 올바른 괄호: 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
	 *			 (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String prob = sc.next();

		if(solution(prob) == true) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
	public static boolean solution(String prob) {
		boolean answer = true;
		char[] arr = prob.toCharArray();

		int count=0;
		if(arr[0] == ')') return false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == '(') {
				count++;
			}else {
				if(count < 1)
					return false;
				count--;
			}
		}
		if(count != 0)
			return false;
		return answer;
	}

}
