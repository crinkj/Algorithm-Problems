package inflearn_Algorithm;

import java.util.Scanner;

public class problem28 {
/*
 * 		문제: N개의 수로 이루어진 수열이 주어집니다.  이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
			 만약 N=8, M=6이고 수열이 다음과 같다면 1 2 1 3 1 1 1 2 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		int total = 0, count=0, lt=0;
		for(int i=1;i<n;i++) {
			total += arr[i];
			if(total == m) {
				count++;
			}
		while(total >= m) { // 만약 더한 숫자가 m을 넘어갈경우 인덱스 0부터 빼준다
			total -= arr[lt++];
			if(total == m) {
				count++;
			}
		}

		}

		System.out.println(count);
	}
}
