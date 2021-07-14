package Programmers;

import java.util.ArrayList;
import java.util.Collections;

public class workOutClothes {

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {3};
		System.out.println(solution(n,lost,reserve));
	}
	  public static int solution(int n, int[] lost, int[] reserve) {

		  int answer = 0;
		  int[] arr = new int[n];
		  for(int i=0;i<n;i++) {
			   arr[i] = 1;
		  }

		  for(int l:lost) {
			  arr[l-1]--;
		  }
		  for(int r:reserve) {
			  arr[r-1]++;
		  }


		  for(int i=0;i<n;i++) {
			 if(arr[i] == 0) {
				 if(i >0&&arr[i-1] == 2) {
					 arr[i-1]--;
					 arr[i]++;
				 }
				 else if(i < n-1&&arr[i+1] == 2) {
					 arr[i]++;
					 arr[i+1]--;
				 }

			 }
		  }
		  for(int i=0;i<arr.length;i++) {
			  if(arr[i] >= 1) {
				  answer++;
			  }
		  }


	        return answer;
}
}
