package Programmers;

import java.util.Arrays;

public class budget {
/*
 * https://programmers.co.kr/learn/courses/30/lessons/12982
 */
	public static void main(String[] args) {
		int[] d = {2,2,3,3};
		int budget = 10;

		System.out.println(solution(d,budget));
	}

	public static int solution(int[] d, int budget) {
		int answer = 0;

		Arrays.sort(d);
		for(int i=0;i<d.length;i++) {
			budget = budget - d[i];
			if(budget > 0 || budget == 0) {
				answer++;
			}
		}

		return answer;
	}
}
