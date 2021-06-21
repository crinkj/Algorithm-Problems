package inflearn_Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class problem18 {
//	문제: N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
//		예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
//		첫 자리부터의 연속된 0은 무시한다.


//	public static void main(String[] args) {
//		problem18 prob  = new problem18();
//
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//
//		for(int i=0; i<num; i++) {
//			arr[i] = sc.nextInt();
//		}
//
//		for(int x : prob.solution(num, arr)) {
//			System.out.print(x + " ");
//		}
//	}
//
//	public ArrayList<Integer> solution(int n, int[] arr){
//
//		ArrayList<Integer> answer = new ArrayList<>();
//
//		for(int i=0; i< arr.length;i++) {
//			int tmp = arr[i];
//			int res = 0;
//
//			while(tmp > 0) { // 123 이면 1,2,3 쪼개서 0보다 클경우 while돌아가게
//				int t = tmp%10;   // 123/10 = 3
//				res = res*10+t;  // 0 = 0*10+3 = 3
//				tmp = tmp/10; // 123/10 = 12
//			}
//
//			if(tof(res)) answer.add(res);
//
//		}
//
//		return answer;
//	}
//
//	public boolean tof(int num) {
//
//		if(num == 1) {
//			return false;
//		}
//		for(int i=2; i<num; i++) {
//			if(num%i == 0)
//				return false;
//		}
//		return true;
//
//	}

	public static void main(String[] args) {
		problem18 prob = new problem18();

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[] arr = new int[num];
		for(int i=0; i<num;i++) {
			arr[i] = sc.nextInt();
		}

		for(int x: prob.solution(num, arr)) {
			System.out.print(x + " ");
		}
	}

	public ArrayList<Integer> solution(int num,int[] arr){
		problem18 prob = new problem18();
		ArrayList<Integer> answer = new ArrayList<>();

		for(int i=0; i< arr.length;i++) {

			int tmp = arr[i];
			int res =0;

			while(tmp > 0) {
				int t = tmp%10;
				res = res*10 + t;
				tmp = tmp/10;
			}

			if(prob.isTrue(res))answer.add(res);
		}

		return answer;
	}

	public boolean isTrue(int num) {
		if(num == 1) {
			return false;
		}
		for(int i=2; i<num;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
