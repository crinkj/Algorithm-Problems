package inflearn_Algorithm;

import java.util.Scanner;

public class problem29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[] arr = new int[num+1];
		for(int i=0; i<num;i++) {
			arr[i] = i+1;
		}


		int total=0,lt=0,count=0,rt=0;
		for(int i=0;i<(num/2)+1;i++) {
			total += arr[rt++];
			if(total == num) {
				count++;
			}
			while(total >= num) {
				total -= arr[lt++];
				if(total == num) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
