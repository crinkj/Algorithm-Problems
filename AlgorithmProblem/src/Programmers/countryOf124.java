package Programmers;

import java.util.HashMap;

public class countryOf124 {

	public static void main(String[] args) {
		String answer = "";
		int n = 4;

		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] ans = {1,2,4,11,12,14,21,22,24,41};
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "4");
		map.put(4, "11");
		map.put(5, "12");
		map.put(6, "14");
		map.put(7, "21");
		map.put(8, "22");
		map.put(9, "24");
		map.put(10, "41");
		answer += map.get(n);

		System.out.println(answer);
	}
}
