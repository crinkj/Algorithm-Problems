package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sumTwoNumbers {
	/*
	 * https://programmers.co.kr/learn/courses/30/lessons/68644
	 */
	public static void main(String[] args) {
			int [] problem = {5,0,2,7};
			System.out.println(solution(problem));


	}
	public static int[] solution(int[] prob) {
		List<Integer> converter = new ArrayList<Integer>();
		for(int i=0;i<prob.length;i++) {
			for(int k=i+1;k<prob.length;k++) {
				int sum = prob[k]+prob[i];
				if(!converter.contains(sum)) {
					converter.add(sum);
				}
			}
		}

		int[] answer = new int[converter.size()];
		for(int i=0;i<converter.size();i++) {
			answer[i] = converter.get(i);
		}

		Arrays.sort(answer);
		return answer;
	}

}
