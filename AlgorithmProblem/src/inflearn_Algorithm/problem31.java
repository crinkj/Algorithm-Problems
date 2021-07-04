package inflearn_Algorithm;

import java.util.HashMap;
import java.util.Scanner;

public class problem31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String word = sc.nextLine();
		System.out.println(solution(n,word));
}
	public static char solution(int n, String word) {
		char[] arr = word.toCharArray();
		HashMap<Character,Integer> map= new HashMap<Character,Integer>();
		map.put('A', 0);
		map.put('B', 0);
		map.put('C', 0);
		map.put('D', 0);
		map.put('E', 0);

		for(char x: arr) {
			map.get(x);
		}

		return 'A';
	}
}
