package inflearn_Algorithm;

import java.util.Scanner;

public class problem29 {

	/*
	 * 문제: N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
			만약 N=15이면
			7+8=15
			4+5+6=15
			1+2+3+4+5=15
			와 같이 총 3가지의 경우가 존재한다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[] arr = new int[num+1];
		for(int i=0; i<num;i++) {
			arr[i] = i+1;
		}


		int total=0,lt=0,count=0,rt=0;
		for(int i=0;i<(num/2)+1;i++) {
			total += arr[rt++];
			if(total == num) {
				count++;
			}
			while(total >= num) {
				total -= arr[lt++];
				if(total == num) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
