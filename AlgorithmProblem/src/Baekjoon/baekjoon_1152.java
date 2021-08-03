package Baekjoon;


public class baekjoon_1152 {

	public static void main(String[] args) {
		String word = "The Curious CASE of Benjamin Button";
		String[] arr = word.split(" ");

		int count  = 0;
		for(String x: arr) {
			count++;
		}
		System.out.println(count);
	}
}
