package inflearn_Algorithm;

import java.util.Scanner;

public class problem13 {
//	문제: N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
	public static void main(String args[]) {
		problem13 prob = new problem13();

		Scanner sc = new Scanner(System.in);
		int letter = sc.nextInt();

		int[] arr = new int[letter];
		int[] answer = new int[letter];
		for(int i=0; i< letter; i++) {
			arr[i] = sc.nextInt();
		}

		answer[0] = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i] > arr[i-1]) {
				answer[i] = arr[i];
			}else {
				answer[i] = 0;
			}
		}

		for(int x : answer) {
			if(x != 0) {
				System.out.print(x + " ");
			}
		}


	}
}
