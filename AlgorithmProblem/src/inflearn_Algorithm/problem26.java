package inflearn_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class problem26 {

	public static void main(String[] args) {
//		문제: A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.

		problem26 prob = new problem26();

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}

		int num2 = sc.nextInt();
		int[] arr2= new int[num2];
		for(int i=0;i<num2;i++) {
			arr2[i] = sc.nextInt();
		}

		for(int x: prob.solution(num, num2, arr, arr2)) {
			System.out.print(x + " ");
		}
	}

	public ArrayList<Integer> solution(int n,int m,int[] arr,int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<Integer>();

		Arrays.sort(arr);
		Arrays.sort(arr2);
		int pn=0,pm=0;
		while(pn<n && pm<m) {
			if(arr[pn] == arr2[pm]) {
				answer.add(arr[pn++]);
				pm++;
			}else if(arr[pn] > arr[pm]) {
				pm++;
			}else {
				pn++;
			}
		}


		return answer;
	}
}
