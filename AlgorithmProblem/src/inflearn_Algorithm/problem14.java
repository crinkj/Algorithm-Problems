package inflearn_Algorithm;

import java.util.Scanner;

public class problem14 {
//	문제:선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
//	선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
	public static void main(String[] args) {

		problem14 prob = new problem14();
		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		System.out.println(prob.solution(number));
	}

	public int solution(int number) {
		int[] visible = new int[number];
		int count =0;

		Scanner sc = new Scanner(System.in);
		for(int i=0; i<number;i++) {
			visible[i] = sc.nextInt();
		}
		visible[visible.length] = 0;

		for(int j=0; j<visible.length;j++) {
			if(visible[j] < visible[j+1]) {
				count++;
			}

		}

		return count;
	}
}
