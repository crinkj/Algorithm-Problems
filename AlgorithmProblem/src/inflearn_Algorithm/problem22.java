package inflearn_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class problem22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[][] arr = new int[num+2][num+2];

		for(int i=1; i<arr.length-1;i++) {
			for(int j=1;j<arr.length-1;j++) {
				arr[i][j] = sc.nextInt();
               }
		}

//		for(int i=0; i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				System.out.print(arr[i][j] + " ");
//               }
//			System.out.println(" ");
//		}

		int cnt = 0;

		ArrayList<Integer> answer = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j< arr.length;j++) {
				if(arr[i][j] != 0) {
					int ans = Collections.max(Arrays.asList(arr[i][i-1],arr[i-1][i],arr[i][i+1],arr[i+1][i]));
					answer.add(ans);
				}
			}
		}
		System.out.println(answer.size());
	}
}
