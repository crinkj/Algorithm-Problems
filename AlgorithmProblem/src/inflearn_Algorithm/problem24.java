package inflearn_Algorithm;

import java.util.Scanner;

public class problem24 {
	public static void main(String[] args) {
		problem24 prob = new problem24();
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 가로
		int M = sc.nextInt(); // 세로

		int[][] arr = new int[M][N]; // 세로, 가로
		for(int i=0;i<M;i++) { // 세로부터 받고 가로
			for(int j=0;j<N;j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println(prob.solution(arr,N,M));
	}
	public int solution(int[][] arr,int N, int M) {
		int num = 0;

		for(int i=0; i<N;i++) {
			for(int j=0;j<M;j++) {
				arr[i][j]
			}
		}
		return num;
	}

}
