package inflearn_Algorithm;

import java.util.Scanner;

public class problem20 {

//	문제: N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
//		같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
//		즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.

	public static void main(String[] args) {
		problem20 prob = new problem20();
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] arr = new int[num];

		for(int i=0; i<num;i++) {
			arr[i] = sc.nextInt();
		}

		for(int x:prob.solution(num, arr) ) {
				System.out.print(x + " ");
		}

	}

	public int[] solution(int num,int[] arr) {
		int[] answer = new int[num];

		for(int i=0; i<arr.length;i++) {
			int count = 1;
			for(int j=0;j<arr.length;j++) { // 숫자 하나하나 비교해서 클떄마다 count 하나씩 더해주기
				if(arr[i] < arr[j]) {
					count++;
				}
			}

			answer[i] = count;
		}

		return answer;
	}
}
