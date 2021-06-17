package inflearn_Algorithm;

import java.util.Scanner;

public class problem16 {
//	1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
//
//	2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
	public static void main(String[] args) {
		problem16 prob = new problem16();

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[] arr = prob.solution(num);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public int[] solution(int num) {
		int[] arr = new int[num];
		int a = 1;
		int b = 1, c;

		arr[0] = 1;
		arr[1] = 1;
		for(int i=2; i<num;i++) {
			arr[i] = arr[i-2] + arr[i-1];
		 }
		return arr;
	}
	// 손코딩(배열 쓰지않고)
//	public void solution(int n) {
//		int a=1; b=1,c;
//		for(int i=2; i<n; i++) {
//			c=a+b;
//			a=b;
//			b=c;
//		}
//	}
}
