package Programmers;

public class weeklyChallenge1week {

	public static void main(String[] args) {
//		https://programmers.co.kr/learn/courses/30/lessons/82612

		System.out.println(solution(3,20,4));

	}

	public static long solution(int price,int money,int count) {
	       long answer = 0;

			for(int i=1;i<=count;i++) {
				answer += price*i;
			}
	        answer -= money;
	        if(answer < 0){
	            answer = 0;
	        }
		return answer;
	}

}
