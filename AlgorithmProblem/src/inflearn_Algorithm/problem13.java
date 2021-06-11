package inflearn_Algorithm;

import java.util.Scanner;

public class problem13 {
//	문제: N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
	public static void main(String args[]) {
		problem13 prob = new problem13();

		Scanner sc = new Scanner(System.in);
		int letter1 = sc.nextInt();

		int[] arr = new int[letter1];
		for(int i=0; i< letter1; i++) {
			arr[i] = sc.nextInt();
		}

		for(int j=0; j<arr.length;j++) {
			if(arr[j] >= letter1) {
				System.out.print(arr[j] +" ");
			}
		}

	}
}
