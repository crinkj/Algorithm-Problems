package inflearn_Algorithm;

import java.util.Scanner;

public class shiftLetter {
//////문제 2) 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변호나하는 프로그램을 작성하세요
	public static void main(String[] args){

	    Scanner in=new Scanner(System.in);
	    String word = in.nextLine();
	    char[] arr = word.toCharArray(); //문자 배열로 넣기
	    word = ""; //문자 초기화
	    for(int i=0; i<arr.length; i++){
	     if(arr[i] == Character.toUpperCase(arr[i]) ){ // 대문자인지 확인
			arr[i] = Character.toLowerCase(arr[i]);  // 대문자면 소문자로 바꾼후 더하기
			word += arr[i];
	       }else{
	     	arr[i] = Character.toUpperCase(arr[i]);  //소문자면 대문자로 바꾸고 더하기
	     	word += arr[i];
	     }
	  }
	    System.out.println(word);

}
	// 방법2

	public String solution(String str) {
		String answer = "";
		for(char x : str.toCharArray()) { // 문자열 배열로 넣는방법
			if(Character.isLowerCase(x)) {       // A 65 ~ 90 숫자로 따졌을때
												 // a 97 ~ 122
				answer+=Character.toUpperCase(x);
			}else {
				answer+=Character.toLowerCase(x);
			}
		}
		return answer;
	}

	public static void main2(String[] args) {
		shiftLetter L = new shiftLetter();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(L.solution(str));
	}
}
