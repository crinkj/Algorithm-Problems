package Programmers;

public class lotto {
	/*
	 * https://programmers.co.kr/learn/courses/30/lessons/77484
	 *lottos:[44, 1, 0, 0, 31, 25]	 winning:[31, 10, 45, 1, 6, 19]	 low,high:[3, 5]
	 */
	public static void main(String[] args) {
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] winning ={31, 10, 45, 1, 6, 19};

		System.out.print("[" + solution(lottos,winning)[0] + "," + solution(lottos,winning)[1] + "]");
	}

	public static int[] solution(int[] lottos,int[] winning) {
		int[] answer = new int[2];
		int high=0,low=0;
		for(int i=0;i<lottos.length;i++) {
			if(lottos[i] == 0)high++;
			for(int j=0;j<winning.length;j++){
				if(lottos[i] == winning[j]) {
					high++;
					low++;
				}
			}
		};

		answer[0] = Math.min(7 - high, 6);
		answer[1] = Math.min(7 - low, 6);

		return answer;

	}
}
