package inflearn_Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		problem4 prob = new problem4();
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String[] str = new String[input];
		for(int i=0; i<input; i++) {
			str[i] = sc.nextLine();
		}
		for(String x : prob.solution(input, str)) {
			System.out.println(x);
		}
	}

	// 있는 메소드사용
	public ArrayList<String> solution(int input, String[] str){
		ArrayList<String> answer = new ArrayList<>();
		for(String x: str) {
			String tmp = new StringBuilder(x).reverse().toString(); // 객체 여러가지 안만들어서 메모리 낭비 방지를 한다 string보다 메모리 구조에 좋다
			answer.add(tmp);
		}
		return answer;
	}

	// Reverse하는법
//	public ArrayList<String> solution2(int input, String[] str){
//		ArrayList<String> answer = new ArrayList<>();
//		for(String x: str) {
//			char[] string = x.toCharArray();  // 스트링 x 를 char 배열에 삽입
//			int lt=0, rt = x.length()-1;
//			while(lt<rt) {
//				char tmp = string[lt];
//				string[lt] = string[rt];
//				string[rt] = tmp;
//				lt ++;
//				rt --;
//			}
//			String tmp = String.valueOf(string);
//			answer.add(tmp);
//		}
//		return answer;
//	}

}
