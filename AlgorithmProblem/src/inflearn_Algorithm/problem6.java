package inflearn_Algorithm;

import java.util.Scanner;

public class problem6 {
	public static void main(String[] args) {
		problem6 prob = new problem6();
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(prob.solution(word));
	}
	public String solution(String word) {
		StringBuilder answer = new StringBuilder();

		char[] arr = word.toCharArray(); // 문자를 단어 배열로 바꿔준다

		for(int i=0;i< arr.length; i++) {
			boolean repeated = false;  // 거짓으로 정의
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] == arr[j]) { // 문자를 다른 문자들과 비교하고 있을경우 반복문에서 빠져나온다.
					repeated = true;
					break;
				}
			}
			if(!repeated) {    // true값을가지고 빠져나오면 Stringbuilder 배열에 문자를 넣어준다
				answer.append(arr[i]);
			}
		}
		String ans = answer.toString();
		return ans;
	}

//다른 방법
//	public String solution(String str) {
//		String answer ="";
//		for(int i=0; i<str.length(); i++) {                               
//			if(str.indexOf(str.charAt(i)) == i) {          // indexOf 메소드: 특정문자의 인덱스를찾아준다  
//				answer+= str.charAt(i);
//				}
//		}
//	}
}
