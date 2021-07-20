package inflearn_Algorithm;

import java.util.Scanner;
import java.util.Stack;

public class problem38 {

	/*
	 * https://cote.inflearn.com/contest/10/problem/05-03 카카오 크레인 문제
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] arr = new int[n][n]; // 2차원배열 길이

		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt(); // 2차원 배열 받기
			}
		}
		int m = sc.nextInt(); // 뽑을 자리 배열
		int[] moves = new int[m];
		for(int i=0;i<moves.length;i++) { // 뽑을자리 배열 받기
			moves[i] = sc.nextInt();
		}

		System.out.print(solution(n,arr, m, moves));
		}

	public static int solution(int n,int[][] arr,int m, int[] moves) {
		int answer = 0;
		Stack<Integer> board = new Stack<>();

		for(int i=0;i<moves.length;i++) {
			for(int j=0;j<arr.length;j++) {  // arr.length는 행크기  열크기일경우 arr[0].length.
				if(arr[j][moves[i]-1] != 0) { // 이중배열안에 있는 값이 0 이아닐경우(인형일 경우)
					if(!board.empty()) { // 만약 stack에 값이 들어가있을경우
						if(board.peek() == arr[j][moves[i]-1]) { // 스택 맨위에 값과 뽑은 인형값과 같을 경우
							answer+=2; // 인형 두개가 터지므로 2를 더해준다
							board.pop(); // 터진 값은 뺴준다
						}else {
							board.push(arr[j][moves[i]-1]);
						}
					}else {
						board.push(arr[j][moves[i]-1]);
					}
					arr[j][moves[i]-1] = 0;
					break;
				}
			}
		}

		return answer;
	}

}
