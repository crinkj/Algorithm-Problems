package inflearn_Algorithm;

import java.util.Scanner;

public class problem30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int lt=0,count=0,answer=0;

		for(int i=0;i<n;i++) {
			if(arr[i] == 0)count++;
			while(count > k) {
				if(arr[lt] == 0)count--;
				lt++;
			}
			answer = Math.max(answer,i-lt+1);
		}
		System.out.println(answer);
	}
}
