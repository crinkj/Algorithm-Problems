package Baekjoon;

import java.util.Scanner;

public class Basic_2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;

		for(int i=1; i<=k; i++) {
			if(n%i== 0) {
				count++;
			}
		}
		System.out.println(count);
		if(count < k) {
			System.out.println(0);
		}
	}
}
