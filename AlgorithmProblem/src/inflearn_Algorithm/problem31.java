package inflearn_Algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class problem31 {
/*
 * 	문제:학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
		투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
		선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
		반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String word = sc.next();
		System.out.println(solution(n,word));
}
// 내 풀이
//	public static char solution(int n, String word) {
//		char[] arr = word.toCharArray();
//		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
//		map.put('A', 0);
//		map.put('B', 0);
//		map.put('C', 0);
//		map.put('D', 0);
//		map.put('E', 0);
//
//		for(char x: arr) {
//			if(map.containsKey(x)) {
//				map.put(x, map.get(x)+1);
//			}
//		}
//
//		int answer = 0;
//		char ans = 'A';
//		for(Entry<Character,Integer> entry : map.entrySet()) {
//			if(answer < entry.getValue()){
//				answer = entry.getValue();
//				ans = entry.getKey();
//			}
//
//		}
//
//		return ans;
//	}
	public static char solution(int n,String word) {

		HashMap<Character, Integer> map = new HashMap<>();
		int max = 0;
		char answer = ' ';
		for(char x : word.toCharArray()) {
			if(map.containsKey(x)) {
				map.put(x, map.get(x)+1);
			}else {
				map.put(x, 0);
			}
			}

		for(char x: map.keySet()) {
			if(max < map.get(x)) {
				max = map.get(x);
				answer = x;
			}
		}
		return answer;
	}
}
