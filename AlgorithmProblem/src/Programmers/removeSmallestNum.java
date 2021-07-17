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
        ArrayList<Integer> sample = new ArrayList<>();
        int num = arr[0];
        for(int i=0;i<arr.length;i++){
            if(num <arr[i]){
                num = arr[i];
            }
            sample.add(arr[i]);
        }
        Collections.sort(sample);
        int[] answer = new int[sample.size()-1];
        for(int i=1;i<sample.size();i++) {
        	answer = sample.get(1).to;
        }


        return answer;
    }
}
