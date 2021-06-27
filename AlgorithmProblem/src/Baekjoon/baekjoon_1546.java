package Baekjoon;import java.util.Scanner;

public class baekjoon_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int max = 0;
		int avg = 0;

		int[] arr = new int[num];
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println((arr[i]/max) * 100);

		}

		System.out.println(Math.floor(avg/num));
	}
}
