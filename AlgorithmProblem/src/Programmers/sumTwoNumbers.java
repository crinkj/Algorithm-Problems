package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class sumTwoNumbers {
	/*
	 * https://programmers.co.kr/learn/courses/30/lessons/68644
	 */
	public static void main(String[] args) {
			int [] problem = {5,0,2,7};
			for(int x: solution(problem)) {
				System.out.print(x +",");
			}


	}
	public static int[] solution(int[] prob) {
		ArrayList<Integer> converter = new ArrayList<>();

		Arrays.sort(prob);
		for(int i=0;i<prob.length;i++) {
			for(int k=1;k<prob.length;k++) {
				if(!converter.contains(prob[i]+prob[k])) {
					converter.add(prob[i]+prob[k]);
				}
			}
		}

		int[] answer = new int[converter.size()];
		for(int i=0;i<converter.size();i++) {
			answer[i] = converter.get(i);
		}

		return answer;
	}

}
