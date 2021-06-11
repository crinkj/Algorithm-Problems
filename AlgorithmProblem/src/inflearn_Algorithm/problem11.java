package inflearn_Algorithm;

import java.util.Scanner;

public class problem11 {

// 문자열 압축: 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가
//			 연속으로 반복되는 경우 반복되는문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.


	public static void main(String[] args) {
		problem11 answer = new problem11();

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();

		System.out.println(answer.solution(word));

	}

	public String solution(String word) {
		String answer = "";
		word = word + " " ;
		int count = 1;

		for(int i=0; i<word.length()-1;i++) {
			if(word.charAt(i)== word.charAt(i+1)) {
				count++;
			}else {
				answer += word.charAt(i);

				if(count > 1) {
					answer += String.valueOf(count);
					count = 1;
				}
			}
		}

		return answer;
	}



}
