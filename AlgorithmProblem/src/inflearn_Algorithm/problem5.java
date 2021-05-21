package inflearn_Algorithm;

import java.util.Scanner;

public class problem5 {

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
