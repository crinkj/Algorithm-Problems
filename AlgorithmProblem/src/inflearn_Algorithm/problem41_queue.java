package inflearn_Algorithm;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem41_queue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];

		Queue<Integer> que = new LinkedList<>();
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			que.offer(arr[i]);
		}
		for(int i=0;i<m;i++) {
			que.poll();
		}
		int num = que.poll();
		System.out.println(num);
		int answer = 0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(num == arr[i]) {
				answer = i;
			}
		}
		System.out.println(answer);

	}
}
