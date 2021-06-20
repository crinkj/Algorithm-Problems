package inflearn_Algorithm;

import java.util.Scanner;

public class problem18 {
	public static void main(String[] args) {
		problem18 prob  = new problem18();

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[] ans = prob.solution(num);

	}

	public int[] solution(int num) {
		int[] ans = new int[num];

		Scanner sc = new Scanner(System.in);

		for(int i=0; i<num;i++) {
			ans[i] = sc.nextInt();
		}

		for(int j=0; j< ans.length;j++) {
			if(ans[j] > 9) {
				Integer.
				ans[j]=Integer.reverse(ans[j]);
			}
		}

		return ans;
	}
}
