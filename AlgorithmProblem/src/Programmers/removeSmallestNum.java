package Programmers;

import java.util.ArrayList;
import java.util.Collections;

public class removeSmallestNum {

	/*
	 * https://programmers.co.kr/learn/courses/30/lessons/12935
	 */
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		System.out.println(solution(arr));
	}
	public static int[] solution(int[] arr) {
		int num = 0;

		if(arr.length == 1) {
			num = 1;
		}else {
			num = arr.length-1;
		}
		int[] answer = new int[num];
		if(arr[0] == 10) {
			answer[0] = -1;
		}else {
			int min = arr[0];
			for(int i=1;i<arr.length;i++) {
				if(min > arr[i]) {
					min = arr[i];
				}
			}

			for(int i=0;i<answer.length;i++) {
					answer[i] = arr[i];
			}

		}
		for(int x: answer) {
			System.out.println(x);
		}


        return answer;
    }
}
