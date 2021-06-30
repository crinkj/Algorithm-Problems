package inflearn_Algorithm;

import java.util.Scanner;

public class problem30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int zeroToOne = sc.nextInt();
		int[] arr = new int[num];

		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}

		int count = 0;

		for(int i=0;i<num;i++) {
			if(arr[i] == 0) {
				count = 0;
			}else {
			while(arr[i] == 1) {
				count++;
			}
			}
		}
		System.out.println(count);
	}
}
