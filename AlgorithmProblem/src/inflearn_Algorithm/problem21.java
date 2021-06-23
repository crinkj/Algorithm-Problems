package inflearn_Algorithm;

import java.util.Scanner;

public class problem21 {
//	문제: 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
//		 N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[][] arr = new int[num][num];

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int sum1,sum2;
		int answer = 0;

		for(int i=0;i<arr.length;i++) {
			sum1=0;
			sum2=0;
			for(int j=0;j<arr.length;j++) {
				sum1 +=arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		sum1=0;
		sum2=0;
		for(int i=0;i<arr.length;i++) {
				sum1 += arr[i][i];
				sum2 += arr[i][arr.length-1-i];
			answer = Math.max(sum1, answer);
			answer = Math.max(answer, sum2);
		}
		System.out.println(answer);
	}

}
