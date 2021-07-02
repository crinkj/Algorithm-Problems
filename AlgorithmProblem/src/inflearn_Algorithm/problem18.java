package inflearn_Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class problem18 {
//	문제: N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
//		예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
//		첫 자리부터의 연속된 0은 무시한다.


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[] arr = new int[num];
		for(int i=0; i<num;i++) {
			arr[i] = sc.nextInt();
		}

		for(int x: solution(num, arr)) {
			System.out.print(x + " ");
		}
	}

	public static ArrayList<Integer> solution(int num,int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();

		for(int i=0; i< arr.length;i++) {

			int tmp = arr[i];
			int res = 0;

			while(tmp > 0) {
				int t = tmp%10; // 1) 290을 입력받으면 290%10= 0;
								// 2) 29%10 = 9;
								// 3) 2%10 = 2;
				res = res*10 + t; // 1) 0*10+0 = 0;
								  // 2) 0*10+9 = 9;
				 				  // 3) 9*10 + 2 = 92;
				tmp = tmp/10; // 1) 29
							  // 2) 29/10 = 2;
							  // 3) 2/10 = 0;
			}

			if(isTrue(res))answer.add(res); // while문을 빠져나온 92가 소수인지 확인한다. 약수면 ArrayList에 담는다
		}

		return answer;
	}

	public static boolean isTrue(int num) {
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
