package inflearn_Algorithm;

import java.util.Scanner;

public class problem16 {
	public static void main(String[] args) {
		problem16 prob = new problem16();

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[] arr = prob.solution(num);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public int[] solution(int num) {
		int[] arr = new int[num];
		int a = 1;
		int b = 1, c;

		arr[0] = 1;
		arr[1] = 1;
		for(int i=2; i<num;i++) {
			c=a+b;
			arr[i]= c;
			a=b;
			b=c;
		 }
		return arr;
	}
}
