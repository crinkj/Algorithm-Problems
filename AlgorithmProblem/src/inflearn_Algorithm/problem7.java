package inflearn_Algorithm;

import java.util.Scanner;

public class problem7 {

//	문제:앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
//		문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
//		단 회문을 검사할 때 대소문자를 구분하지 않습니다.

	public static void main(String[] args) {
		problem7 prob = new problem7();
		Scanner sc = new Scanner(System.in);

		String word = sc.nextLine();
		if(prob.solution(word).equals(word.toLowerCase())) {  // 다 소문자로 바꾼후 앞에 단어랑 맞는지 안 맞는지 조건문
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
