package inflearn_Algorithm;

import java.util.Scanner;

public class problem10 {

// 문제: 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		problem10 prob = new problem10();
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char letter = sc.next().charAt(0);
		for(int x : prob.solution(word,letter)) {
			System.out.print(x + " ");
		}
	}

	public int[] solution(String word, char letter) {
		int count = 0;
		char[] arr = new char[word.length()];
		int[] answer = new int[word.length()];
		arr = word.toCharArray();

		for(int i=0; i <arr.length;i++) { // 왼쪽에서부터 먼저 각 문자의 거리를 구한다
			if(arr[i] == letter) {
				count = 0;
                answer[i] = 0;
			}else {
				count++;
				answer[i] = count;
			}
		}
		count = 0;
		for(int i=arr.length-1; i>= 0; i--) { // 오른쪽에서부터 거리를 구한 후 왼쪽에서 구한 거리와 비교하여 최소값을 구한다
			if(arr[i] == letter) count=0;
			else {
				count++;
				if(answer[i] >= count) {
				 answer[i] = count;
				}
				//answer[i] = Math.min(answer[i],count); Math.min안에 두개의 숫자를넣으면 둘중에 작은값이 들어간다.
			}
		}
		return answer;
	}


}
