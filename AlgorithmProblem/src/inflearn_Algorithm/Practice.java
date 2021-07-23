package inflearn_Algorithm;

import java.util.Scanner;

public class Practice {

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
				if(arr[i] > arr[j]) {
					count++;
				}
			}

			answer[i] = count;
		}

		return answer;
	}}
