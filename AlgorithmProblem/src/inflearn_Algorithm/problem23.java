package inflearn_Algorithm;

import java.util.Scanner;

public class problem23 {
	public static void main(String[] args) {
		problem23 prob = new problem23();

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[][] arr = new int[num][num];

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<5;j++) {
				arr[i][j] = sc.nextInt();
			}
		}


		System.out.println(prob.solution(arr));
	}

	public int solution(int[][] arr) {

		int answer = 0;
		int ans = 0;
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=0;j<arr.length;j++) {
				for(int k=0; k<5;k++) {
					if(arr[i][k] == arr[j][k]) { // 하나하나 비교를 해줘야하기때문에 for문을 한번더 돌려줘야된다. 그래야 arr[i][j] 고정하면서 하나하나 다 비교한다
						count++;
						break;
					}
				}
			}
			if(count > answer) { // 비교하면서 큰 숫자를 찾아간다
				answer = count;
				ans = i;
			}

		}
		ans+=1;
		return ans;
	}
}
