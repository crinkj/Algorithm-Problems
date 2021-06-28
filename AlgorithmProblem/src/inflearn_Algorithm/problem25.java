package inflearn_Algorithm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class problem25 {

	public static void main(String[] args) {
//		문제: 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
//			두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
//			세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
//			네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.


		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> answer = new ArrayList<Integer>();

		int num = sc.nextInt();
		int[] arr = new int[num];

		for(int i=0;i<num;i++) {
			arr[ i] = sc.nextInt();
			answer.add(arr[i]);
		}

		int num2 = sc.nextInt();
		int[] arr2 = new int[num2];

		for(int i=0; i<num2;i++) {
			arr2[i] = sc.nextInt();
			answer.add(arr2[i]);
		}

		Collections.sort(answer);

		for(int x: answer) {
			System.out.print(x + " ");
		}
	}

// 방법 2)
//	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//
//	ArrayList<Integer> answer = new ArrayList<Integer>();
//
//	int num = sc.nextInt();
//	int[] arr = new int[num];
//
//	for(int i=0;i<num;i++) {
//		arr[ i] = sc.nextInt();
//	}
//
//	int num2 = sc.nextInt();
//	int[] arr2 = new int[num2];
//
//	for(int i=0; i<num2;i++) {
//		arr2[i] = sc.nextInt();
//	}
//
//	int pn=0,pm=0;
//	while(pn<num && pm<num2) {
//		if(arr[pn] < arr2[pm]) {
//			answer.add(arr[pn++]);
//		}else {
//			answer.add(arr2[pm++]);
//		}
//	}
//	while(pn <num) {
//		answer.add(arr[pn++]);
//	}
//	while(pm <num2) {
//		answer.add(arr2[pm++]);
//	}
//
//	for(int x: answer) {
//	System.out.print(x + " ");
//	}
//	}
}
