package Programmers;

import java.util.ArrayList;
import java.util.List;

public class level1_bfs {

	public static void main(String[] args) {
		int[] answers = {1,2,3,4,5};
//		for(int x: solution(answers)) {
//			System.out.println(x);
//		}
	}
	public static int[] solution(int[] answers) {
		int[] arr = new int[3];
		int[] first = {1,2,3,4,5};
		int[] second = {2,1,2,3,2,4,2,5};
		int[] third = {3,3,1,1,2,2,4,4,5,5};

		for(int i=0; i<answers.length;i++){
			if(answers[i] == first[i%first.length]){
				arr[0]++;
			}
			if(answers[i] == second[i%second.length]){
				arr[1]++;
			}
			if(answers[i] == third[i%third.length]){
				arr[2]++;
			}
		}

		int max = Math.max(Math.max(arr[0], arr[1]), arr[2]);
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(max == arr[i]) {
				list.add(i+1);
			}
		}

		int[] answer = new int[list.size()];
		for(int i=0;i<answer.length;i++){
			answer[i] = list.get(i);
		}

		return answer;
	}


}
