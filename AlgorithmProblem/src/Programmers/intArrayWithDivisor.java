package Programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class intArrayWithDivisor {

	public static void main(String[] args) {
		int[] arr = {5,9,7,10};
		int divisor = 5;
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % divisor == 0) {
				ans.add(arr[i]);
			}
		}
		int[] answer = new int[ans.size()];
		if(ans.size() > 0) {
			answer = new int[ans.size()];
			for(int i=0;i<ans.size();i++) {
				answer[i] = ans.get(i);
			}
			Arrays.sort(answer);
		}else {
			answer = new int[1];
			answer[0] = -1;
		}

	}
}
