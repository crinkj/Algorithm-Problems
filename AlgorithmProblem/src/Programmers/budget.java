package Programmers;

import java.util.Arrays;

public class budget {
/*
 * https://programmers.co.kr/learn/courses/30/lessons/12982
 */
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;

		System.out.println(solution(d,budget));
	}

	public static int solution(int[] d, int budget) {
		int answer = 0;

		Arrays.sort(d);
		int change = 0;
		for(int i=0;i<d.length;i++) {
			change = budget % d[i];
			if(change >= 0) {
				answer++;
			}
		}

		return answer;
	}
}
