package inflearn_Algorithm;

import java.util.Scanner;

public class problem5 {
//	문제: ﻿영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
//		특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

	public static void main(String[] args) {
		problem5 prob = new problem5();
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();

		System.out.println(prob.solution(word));

	}

	public String solution(String word) {
		String answer = "";
		char[] arr = word.toCharArray();
		int lt=0 , rt=arr.length-1;
		for(int i=0; i<arr.length;i++) {
			if(lt < rt) {
				 if(!Character.isAlphabetic(arr[lt])) {
					lt++;
				 }
				 else if(!Character.isAlphabetic(arr[rt])) {
					rt--;
				 }
				 else {
					char letter = arr[lt];
					arr[lt] = arr[rt];
					arr[rt] = letter;
					lt++;
					rt--;
				 }
			}
		}
		answer = String.valueOf(arr);
		return answer;

	}
}
