package inflearn_Algorithm;

import java.util.Scanner;

public class problem17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] ch = new int[num+1];

		int count = 0;

		for(int i=2;i<=num; i++) {
			if(ch[i] == 0) {
				count++;

				for(int j=i;j<=num;j=j+i) { // for 문 여기서 돌리기 시작
					ch[j] = 1; // 여기서 쌓이기 시작
				}
				
			}
		}
		System.out.println(count);
	}

}
