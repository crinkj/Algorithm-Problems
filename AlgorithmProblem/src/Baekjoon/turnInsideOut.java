package Baekjoon;

import java.util.Scanner;

public class turnInsideOut {

	public static void main(String[] args) {
		String s = "1100";

		int[] arr = new int[s.length()];

		for(int i=0;i<arr.length;i++) {
			arr[i] =  Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		int zero = 0;
		int one = 0;

		for(int i=1;i<arr.length;i++) {
			if(arr[i-1] != arr[i]) {
				if(arr[i] == 0) {
					zero++;
				}else {
					one++;
				}
			}
		}
		System.out.println(Math.min(zero, one));
	}
}
