package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class baekjoon_2576 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[7];
		ArrayList<Integer> answer = new ArrayList<Integer>();

		int min=0,total=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] % 2 == 1) {
				answer.add(arr[i]);
				total+= arr[i];
			}
		}
		Collections.sort(answer);

		if(answer.size() > 0) {
			System.out.println(total);
			System.out.println(answer.get(0));
		}else {
			System.out.println(-1);
		}







	}
}
