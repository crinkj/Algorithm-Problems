package inflearn_Algorithm;

import java.util.Scanner;

public class problem7 {

	public static void main(String[] args) {
		problem7 prob = new problem7();
		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();
		if(prob.solution(word).equals(word.toLowerCase())) {  // 다 소문자로 바꾼후
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}


	public String solution(String word) {
		String ans ="";
		word = word.toLowerCase();
		char[] arr = word.toCharArray();

		for(int i=arr.length-1; i>=0; i--) {
			ans += arr[i];
		}
		return ans;
	}
}
