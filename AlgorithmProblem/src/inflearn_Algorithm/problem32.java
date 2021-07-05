package inflearn_Algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class problem32 {
/*
 * 문제: Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
		예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
		알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
		길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String first = sc.next();
		String second = sc.next();

		System.out.println(solution(first,second));
	}

	public static String solution(String first, String second) {

		String answer = "YES";

		HashMap<Character,Integer> map = new HashMap<>();
		HashMap<Character,Integer> map2 = new HashMap<>();

		for(char x : first.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1);
		}
		for(char x : second.toCharArray()) {
			map2.put(x, map2.getOrDefault(x,0)+1);
		}

		for(char x : map2.keySet()) {
			if(!map.containsKey(x) || map.get(x) != map2.get(x)) {
				answer = "NO";
			}
		}
		return answer;

	}
}
