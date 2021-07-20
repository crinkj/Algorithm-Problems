package inflearn_Algorithm;

import java.util.Scanner;

public class problem27 {

 /*내가한 방법 (무식하다)
 	문제: 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
		만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면 12 1511 20 2510 20 19 13 15
		연속된 3일간의 최대 매출액은 11+20+25=56만원입니다. 여러분이 현수를 도와주세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int day = sc.nextInt();

		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
		}
		int first = arr[0];
		int second = arr[1];
		int third = arr[2];

		int total = 0;
		int other = 0;

		total += first+=second+= third;
		other = total;
		int max = 0;
		for(int i=3;i<arr.length;i++) {
			other -= arr[i-3];
			other += arr[i];
			if(total < other) {
				max = other;
				total = other;
			}
		}
		System.out.println(max);

	}
*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(solution(n,k,arr));

	}
	public static int solution(int n,int k, int[] arr) {

		int answer=0,sum = 0;
		for(int i=0;i<k;i++) {
			sum+=arr[i];
		}
		answer = sum;
		for(int i=k;i<n;i++) {
			sum -=arr[i-k];
			sum +=arr[i];
			if(answer < sum) {
				answer = sum;
			}
		}
		return answer;
	}

}
