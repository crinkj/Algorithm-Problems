package Programmers;

import java.util.HashMap;

public class phoneKetMon {
/*
 * 문제: https://programmers.co.kr/learn/courses/30/lessons/1845
 */
	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,2};
		System.out.println(solution(nums));
	}
	public static int solution(int[] nums) {
		int answer = 0;
		int total = nums.length/2;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<nums.length;i++){
			map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
		}

		answer = map.size();
		if(answer > total) {
			answer = total;
		}

		return answer;
	}

}
