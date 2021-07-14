package Programmers;

public class hidePhoneNumber {
	/*
	 * 문제: https://programmers.co.kr/learn/courses/30/lessons/12948
	 */

	public static String solution(String phone_number) {
		String answer = "";
		 for(int i=0;i<phone_number.length();i++){
			 if(i < phone_number.length()-4) {
				 answer += "*";
			 }else {
	           answer += phone_number.charAt(i);
			 }
	        }
		 return answer;
	}
}
