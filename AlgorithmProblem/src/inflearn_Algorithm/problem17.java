package inflearn_Algorithm;

import java.util.Scanner;

public class problem17 {

	public static void main(String[] args) {
//		문제: 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] ch = new int[num+1];

		int count = 0;

		for(int i=2;i<=num; i++) {
			if(ch[i] == 0) { // 배열에 0인것만 소수
				count++;
				for(int j=i;j<=num;j=j+i) { // for 문 여기서 돌리기 시작 i에 i를 더해줘서 약수를 없앤다
					ch[j] = 1; // 소수가 아닌건 배열에 1로넣어준다
				}

			}
		}
		System.out.println(count);
	}

}
