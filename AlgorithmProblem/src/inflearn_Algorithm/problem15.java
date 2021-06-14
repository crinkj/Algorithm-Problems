package inflearn_Algorithm;

import java.util.Scanner;

public class problem15 {
//	A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
	public static void main(String[] args) {

		problem15 prob = new problem15();
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] arr = new int[num];
		int[] arr2 = new int[num];

		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int j=0; j<arr2.length;j++) {
			arr2[j] = sc.nextInt();
		}
		char[] ans = prob.solution(arr, arr2);

		for(int i=0; i < ans.length;i++) {
			System.out.println(ans[i]);
		}
	}

	public char[] solution(int[] arr, int[] arr2) {
		char[] ans =new char[arr.length];

		for(int i=0;i<arr.length;i++) {
				if(arr2[i] == 1 && arr[i] == 2) {
					ans[i] = 'A';
				}else if(arr2[i] == 1 && arr[i] == 3) {
					ans[i] = 'B';
				}else if(arr2[i] == 2 && arr[i] == 3) {
					ans[i] = 'A';
				}else if(arr2[i] == 2 && arr[i] == 1) {
					ans[i] = 'B';
				}
				else {
					ans[i] = 'D';
				}

		}
		return ans;
	}
}
