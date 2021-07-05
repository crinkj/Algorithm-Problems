package inflearn_Algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class problem34 {
/*
 *문제:S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
  	  아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		System.out.println(solution(s,t));

	}

	public static int solution(String s,String t) {
		int count = 0;
		int answer = 0;
		HashMap<Character,Integer> mapS = new HashMap<>();
		HashMap<Character, Integer> mapT = new HashMap<>();
		char[] arrS = s.toCharArray();
		char[] arrT = t.toCharArray();

		for(int i=0;i<arrT.length;i++) {
			mapT.put(arrT[i], mapT.getOrDefault(arrT[i], 0)+1);
		}
		for(int i=0;i<arrT.length-1;i++) {
			mapS.put(arrS[i], mapS.getOrDefault(arrS[i], 0)+1);
		}

		int lt = 0;
		for(int i=arrT.length-1;i<arrS.length;i++) {
			mapS.put(arrS[i], mapS.getOrDefault(arrS[i], 0)+1);
			if(mapS.equals(mapT)) {
				answer++;
			}
			mapS.put(arrS[lt], mapS.get(arrS[lt]) -1);
			if(mapS.get(arrS[lt]) == 0) {
				mapS.remove(arrS[lt]);
			}
			lt++;
			}


		return answer;
	}
}
