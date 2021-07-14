package Programmers;

public class primeNumber {
 /*
  * 문제: https://programmers.co.kr/learn/courses/30/lessons/12977
  */
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};

		int total = 0;

		int answer = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					total += arr[i];
					total += arr[j];
					total += arr[k];

					if(solution(total)) {
						answer++;
					}
				}
			}
		}
		System.out.println(answer);
	}
	public static boolean solution(int start) {
		for(int i=2 ;i<start;i++) { // 소수니깐 2부터 검증해주면된다
			if(start%i == 0)
				return false;
		}
		return true;
	}
}
