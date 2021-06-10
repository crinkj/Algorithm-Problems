package inflearn_Algorithm;

import java.util.Scanner;

public class problem11 {
// 문자열 압축
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();

		char[] arr = word.toCharArray();
		char[] answer = new char[100];
		int count = 0;

		for(int i=0; i< arr.length;i++) {
			if(arr[i] == arr[i+1]) {
				count++;
			}else {
				count = 0;
			}
		}

	}



}
